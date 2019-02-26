package qascripts.transactionDetails.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.TransactionDetailsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.TssV2TransactionsGet200Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class RetrieveTransactionTest {

	public static void main(String args[]) throws Exception {
		RetrieveTransactionTest retrieveTransactionTest = new RetrieveTransactionTest();
		retrieveTransactionTest.process();
	}

	public TssV2TransactionsGet200Response process() throws Exception {
		TssV2TransactionsGet200Response response = null;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\TransactionDetails\\CoreServices\\RetrieveTransaction.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				TransactionDetailsApi transactionDetailsApi = new TransactionDetailsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = transactionDetailsApi.getTransaction(columns[1]);

				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_TRANSACTION,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (!columns[1].equals(response.getId())) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_TRANSACTION,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.INVALID_RESPONSE_ID, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_TRANSACTION,
							ConstantUtility.ASSERTION_PASS, columns[2], response.getId(), apiClient.getResponseCode(),
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_TRANSACTION, ConstantUtility.FAIL,
						reason, response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_TRANSACTION, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
