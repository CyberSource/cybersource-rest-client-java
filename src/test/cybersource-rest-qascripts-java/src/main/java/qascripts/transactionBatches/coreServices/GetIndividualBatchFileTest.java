package qascripts.transactionBatches.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.TransactionBatchApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Model.PtsV1TransactionBatchesGet200Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GetIndividualBatchFileTest {

	public static void main(String args[]) throws Exception {
		GetIndividualBatchFileTest getIndividualBatchFileTest = new GetIndividualBatchFileTest();
		getIndividualBatchFileTest.process();
	}

	public ApiResponse<PtsV1TransactionBatchesGet200Response> process() throws Exception {

		ApiResponse<PtsV1TransactionBatchesGet200Response> response = null;
		String respId = null;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\TransactionBatches\\CoreServices\\GetIndividualBatchFile.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {

			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				TransactionBatchApi transactionBatchApi = new TransactionBatchApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				transactionBatchApi.ptsV1TransactionBatchesIdGet(columns[1]);
				JSONObject obj = new JSONObject(apiClient.getRespBody());
				respId = obj.getString("id");
				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_INDIVIDUAL_BATCH_FILE,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, respId,
							apiClient.getResponseCode(), Boolean.TRUE);
				}else if (!columns[1].equals(respId)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_INDIVIDUAL_BATCH_FILE,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.INVALID_RESPONSE_ID, respId,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_INDIVIDUAL_BATCH_FILE,
							ConstantUtility.ASSERTION_PASS, columns[2], respId, apiClient.getResponseCode(),
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_INDIVIDUAL_BATCH_FILE, ConstantUtility.FAIL,
						reason, respId, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_INDIVIDUAL_BATCH_FILE, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}