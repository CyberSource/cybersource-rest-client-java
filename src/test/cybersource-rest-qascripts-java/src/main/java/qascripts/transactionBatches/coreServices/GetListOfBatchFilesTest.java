package qascripts.transactionBatches.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.TransactionBatchesApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.PtsV1TransactionBatchesGet200Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GetListOfBatchFilesTest {

	public static void main(String args[]) throws Exception {
		GetListOfBatchFilesTest getListOfBatchFilesTest = new GetListOfBatchFilesTest();
		getListOfBatchFilesTest.process();
	}

	public PtsV1TransactionBatchesGet200Response process() throws Exception {

		PtsV1TransactionBatchesGet200Response response = null;
		String timeString = null;
		String timeString2 = null;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\TransactionBatches\\CoreServices\\GetListOfBatchFiles.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			timeString = columns[1];
			DateTime ddateTime = new DateTime(timeString);
			DateTime startTime = ddateTime.withZone(DateTimeZone.forID("GMT"));

			timeString2 = columns[2];
			DateTime ddateTime2 = new DateTime(timeString2);
			DateTime endTime = ddateTime2.withZone(DateTimeZone.forID("GMT"));
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				TransactionBatchesApi transactionBatchApi = new TransactionBatchesApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = transactionBatchApi.ptsV1TransactionBatchesGet(startTime, endTime);
				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_LIST_OF_BATCH_FILE,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_LIST_OF_BATCH_FILE,
							ConstantUtility.ASSERTION_PASS, columns[3], null, apiClient.getResponseCode(),
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_LIST_OF_BATCH_FILE, ConstantUtility.FAIL,
						reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_LIST_OF_BATCH_FILE, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
