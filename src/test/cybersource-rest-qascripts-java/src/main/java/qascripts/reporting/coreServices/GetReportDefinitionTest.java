package qascripts.reporting.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.ReportDefinitionsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.ReportingV3ReportDefinitionsNameGet200Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GetReportDefinitionTest {

	public static void main(String args[]) throws Exception {
		GetReportDefinitionTest getReportDefinitionTest = new GetReportDefinitionTest();
		getReportDefinitionTest.process();
	}

	public ReportingV3ReportDefinitionsNameGet200Response process() throws Exception {
		ReportingV3ReportDefinitionsNameGet200Response response = null;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Reporting\\CoreServices\\GetReportDefinition.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ReportDefinitionsApi reportDefinitionsApi = new ReportDefinitionsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = reportDefinitionsApi.getResourceInfoByReportDefinition(columns[1], null);
				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_REPORT_DEFINITION,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if(!columns[1].equals(response.getReportDefintionName())){
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_REPORT_DEFINITION,
							ConstantUtility.ASSERTION_FAILED, columns[2], null,
							apiClient.getResponseCode(), Boolean.TRUE);
				}else{
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_REPORT_DEFINITION,
							ConstantUtility.ASSERTION_PASS, columns[2], null, apiClient.getResponseCode(),
							Boolean.TRUE);
				}
			} catch (ApiException e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_REPORT_DEFINITION, ConstantUtility.FAIL,
						columns[2], null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_REPORT_DEFINITION, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}