package qascripts.reporting.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
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
import Invokers.ApiResponse;
import Model.ReportingV3ReportSubscriptionsGet200ResponseReportPreferences;
import Model.ReportingV3ReportSubscriptionsGet200ResponseReportPreferences.FieldNameConventionEnum;
import Model.ReportingV3ReportsIdGet200Response;
import Model.RequestBody1;
import Model.RequestBody1.ReportMimeTypeEnum;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class CreateAdhocReportTest {

	public static void main(String args[]) throws Exception {
		CreateAdhocReportTest createAdhocReportTest = new CreateAdhocReportTest();
		createAdhocReportTest.process();
	}

	public ApiResponse<ReportingV3ReportsIdGet200Response> process() throws Exception {
		ApiResponse<ReportingV3ReportsIdGet200Response> response = null;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Reporting\\CoreServices\\CreateAdhocReport.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		RequestBody1 request = null;
		while ((columns = csvReader.readNext()) != null) {
			request = new RequestBody1();

			request.reportDefinitionName(columns[1]);
			request.timezone("GMT");
			request.reportMimeType(ReportMimeTypeEnum.APPLICATION_XML);
			request.reportName(columns[2]);

			String timeString = columns[3];
			DateTime ddateTime = new DateTime(timeString);
			DateTime startTime = ddateTime.withZone(DateTimeZone.forID("Asia/Dushanbe"));
			request.reportStartTime(startTime);

			String timeString2 = columns[4];
			DateTime ddateTime2 = new DateTime(timeString2);
			DateTime endTime = ddateTime2.withZone(DateTimeZone.forID("Asia/Dushanbe"));
			request.reportEndTime(endTime);

			ReportingV3ReportSubscriptionsGet200ResponseReportPreferences reportPreferences = new ReportingV3ReportSubscriptionsGet200ResponseReportPreferences();
			reportPreferences.signedAmounts(true);
			reportPreferences.fieldNameConvention(FieldNameConventionEnum.SOAPI);
			request.reportPreferences(reportPreferences);

			List<String> reportFields = new ArrayList<String>();
			reportFields.add("Request.RequestID");
			reportFields.add("Request.TransactionDate");
			reportFields.add("Request.MerchantID");

			request.reportFields(reportFields);
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ReportsApi ReportsApi = new ReportsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				ReportsApi.createReport(request);

				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_ADHOC_REPORTS,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_ADHOC_REPORTS,
							ConstantUtility.ASSERTION_PASS, columns[5], null, apiClient.getResponseCode(),
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_ADHOC_REPORTS, ConstantUtility.FAIL, reason,
						null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_ADHOC_REPORTS, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
