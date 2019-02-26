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
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class DeleteSubscriptionOfReportNameByOrganizationTest {

	public static void main(String args[]) throws Exception {
		DeleteSubscriptionOfReportNameByOrganizationTest deleteSubscriptionOfReportNameByOrganizationTest = new DeleteSubscriptionOfReportNameByOrganizationTest();
		deleteSubscriptionOfReportNameByOrganizationTest.process();
	}

	public void process() throws Exception {
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Reporting\\CoreServices\\DeleteSubscriptionOfReportNameByOrganization.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ReportSubscriptionsApi reportSubscriptionsApi = new ReportSubscriptionsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				reportSubscriptionsApi.deleteSubscription(columns[1]);
				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0],
							ConstantUtility.DELETE_SUBSCRIPTION_OF_REPORT_NAME_BY_ORG,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0],
							ConstantUtility.DELETE_SUBSCRIPTION_OF_REPORT_NAME_BY_ORG,
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.DELETE_SUBSCRIPTION_OF_REPORT_NAME_BY_ORG,
						ConstantUtility.FAIL, reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.DELETE_SUBSCRIPTION_OF_REPORT_NAME_BY_ORG,
						ConstantUtility.FAIL, e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();

	}
}