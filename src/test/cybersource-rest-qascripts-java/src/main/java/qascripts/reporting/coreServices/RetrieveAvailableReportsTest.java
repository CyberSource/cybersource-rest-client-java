package qascripts.reporting.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.ReportsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class RetrieveAvailableReportsTest {

	public static void main(String args[]) throws Exception {
		RetrieveAvailableReportsTest retrieveAvailableReportsTest = new RetrieveAvailableReportsTest();
		retrieveAvailableReportsTest.process();
	}

	public void process() throws Exception {
		Properties merchantProp;
		String timeQueryType = null;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Reporting\\CoreServices\\RetrieveAvailableReports.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			timeQueryType = columns[3];
			String timeString = columns[1];
			DateTime ddateTime = new DateTime(timeString);
			DateTime startTime = ddateTime.withZone(DateTimeZone.forID("GMT"));

			String timeString2 = columns[2];
			DateTime ddateTime2 = new DateTime(timeString2);
			DateTime endTime = ddateTime2.withZone(DateTimeZone.forID("GMT"));
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ReportsApi reportsApi = new ReportsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				reportsApi.searchReports(startTime, endTime, timeQueryType, "testrest", null, null, null, null, null);
				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_AVAILABLE_REPORTS,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_AVAILABLE_REPORTS,
							ConstantUtility.ASSERTION_PASS, columns[4], null, apiClient.getResponseCode(),
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_AVAILABLE_REPORTS, ConstantUtility.FAIL,
						reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_AVAILABLE_REPORTS, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();

	}
}