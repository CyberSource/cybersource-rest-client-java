package qascripts.transactionSearch.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.SearchTransactionsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.TssV2TransactionsPost201Response;
import Model.TssV2TransactionsPostResponse;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class CreateSearchTest {

	public static void main(String args[]) throws Exception {
		CreateSearchTest createSearchTest = new CreateSearchTest();
		createSearchTest.process();
	}

	public TssV2TransactionsPost201Response process() throws Exception {
		TssV2TransactionsPost201Response response = null;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\TransactionSearch\\CoreServices\\CreateSearchRequest.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();
		TssV2TransactionsPostResponse request = null;

		while ((columns = csvReader.readNext()) != null) {

			request = new TssV2TransactionsPostResponse();
			request.save(false);
			request.name(columns[1]);
			request.timezone("America/Chicago");
			request.query(columns[2]);
			request.offset(0);
			request.limit(80);
			request.sort("id:asc, submitTimeUtc:asc");
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				SearchTransactionsApi searchTransactionsApi = new SearchTransactionsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = searchTransactionsApi.createSearch(request);

				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_SEARCH_REQUEST,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (!columns[1].equals(response.getName())) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_SEARCH_REQUEST,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.INVALIDE_NAME, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_SEARCH_REQUEST,
							ConstantUtility.ASSERTION_PASS, columns[3], response.getId(), apiClient.getResponseCode(),
							Boolean.TRUE);
				}
			} catch (ApiException e) {
				String reason = null;
				try {
					if (apiClient.getRespBody() == null) {
						reason = e.getMessage();
					} else {
						JSONObject jsonObject = new JSONObject(apiClient.getRespBody());
						reason = jsonObject.getString("message");
					}
				} catch (JSONException exp) {
					reason = apiClient.getRespBody();
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_SEARCH_REQUEST, ConstantUtility.FAIL, reason,
						response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_SEARCH_REQUEST, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
