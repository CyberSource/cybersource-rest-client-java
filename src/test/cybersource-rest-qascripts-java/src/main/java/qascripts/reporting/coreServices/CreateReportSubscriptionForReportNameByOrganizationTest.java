package qascripts.reporting.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.ReportSubscriptionsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.RequestBody;
import Model.RequestBody.ReportMimeTypeEnum;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class CreateReportSubscriptionForReportNameByOrganizationTest {

	public static void main(String args[]) throws Exception {
		CreateReportSubscriptionForReportNameByOrganizationTest createReportSubscriptionForReportNameByOrganizationTest = new CreateReportSubscriptionForReportNameByOrganizationTest();
		createReportSubscriptionForReportNameByOrganizationTest.process();
	}

	public void process() throws Exception {
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Reporting\\CoreServices\\CreateReportSubscriptionForReportNameByOrganization.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		RequestBody request = null;
		while ((columns = csvReader.readNext()) != null) {
			request = new RequestBody();

			request.reportDefinitionName(columns[1]);

			List<String> reportFields = new ArrayList<String>();
			reportFields.add("Request.RequestID");
			reportFields.add("Request.TransactionDate");
			reportFields.add("Request.MerchantID");
			request.reportFields(reportFields);

			request.reportFrequency(columns[3]);
			request.startDay(1);
			request.startTime("0959");

			request.reportMimeType(ReportMimeTypeEnum.TEXT_CSV);
			request.reportName(columns[2]);
			request.timezone("America/Chicago");
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ReportSubscriptionsApi reportSubscriptionsApi = new ReportSubscriptionsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				reportSubscriptionsApi.createSubscription(request);
				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_REPORT_SUBSCRIPTION_FOR_REPORT_NAME_BY_ORG,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_REPORT_SUBSCRIPTION_FOR_REPORT_NAME_BY_ORG,
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
						JSONObject obj = jsonObject.getJSONArray("fields").getJSONObject(0);
						reason = obj.getString("message");
					}
				} catch (JSONException exp) {
					reason = apiClient.getRespBody();
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_REPORT_SUBSCRIPTION_FOR_REPORT_NAME_BY_ORG, ConstantUtility.FAIL,
						reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_REPORT_SUBSCRIPTION_FOR_REPORT_NAME_BY_ORG, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();

	}
}