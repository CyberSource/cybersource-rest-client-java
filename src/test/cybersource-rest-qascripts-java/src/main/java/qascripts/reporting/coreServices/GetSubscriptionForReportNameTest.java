package qascripts.reporting.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.ReportSubscriptionsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.ReportingV3ReportSubscriptionsGet200Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GetSubscriptionForReportNameTest {

	public static void main(String args[]) throws Exception {
		GetSubscriptionForReportNameTest getSubscriptionForReportNameTest = new GetSubscriptionForReportNameTest();
		getSubscriptionForReportNameTest.process();
	}

	public ReportingV3ReportSubscriptionsGet200Response process() throws Exception {
		ReportingV3ReportSubscriptionsGet200Response response = null;
		String respReportName = null;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Reporting\\CoreServices\\GetSubscriptionForReportName.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			ApiClient apiClient = null;
			String reportDefinitionId = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ReportSubscriptionsApi reportSubscriptionsApi = new ReportSubscriptionsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = reportSubscriptionsApi.getSubscription(columns[1]);
				JSONObject obj = new JSONObject(apiClient.getRespBody());
				respReportName = obj.getString("reportName");
				reportDefinitionId = obj.getString("reportDefinitionId");

				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SUBSCRIPTION_FOR_REPORT_NAME,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (!columns[1].equals(respReportName)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SUBSCRIPTION_FOR_REPORT_NAME,
							ConstantUtility.ASSERTION_FAILED, columns[2], null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SUBSCRIPTION_FOR_REPORT_NAME,
							ConstantUtility.ASSERTION_PASS, columns[2], null, apiClient.getResponseCode(),
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SUBSCRIPTION_FOR_REPORT_NAME,
						ConstantUtility.FAIL, reason, reportDefinitionId, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SUBSCRIPTION_FOR_REPORT_NAME,
						ConstantUtility.FAIL, e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}