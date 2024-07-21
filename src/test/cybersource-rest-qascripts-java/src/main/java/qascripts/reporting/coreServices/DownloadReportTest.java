package qascripts.reporting.coreServices;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

import org.joda.time.LocalDate;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.ReportDownloadsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class DownloadReportTest {

	public static void main(String args[]) throws Exception {
		DownloadReportTest downloadReportTest = new DownloadReportTest();
		downloadReportTest.process();
	}

	public void process() throws Exception {
		Properties merchantProp;
		String resourceFile = "DownloadReport";
		final String FILE_PATH = "src/test/resources/";

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Reporting\\CoreServices\\DownloadReport.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			LocalDate reportDate = new LocalDate(columns[3]);
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ReportDownloadsApi downloadsApi = new ReportDownloadsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				downloadsApi.downloadReportWithHttpInfo(reportDate, columns[2], columns[1]);
				InputStream stream = new ByteArrayInputStream(
						apiClient.getResponseBody().getBytes(StandardCharsets.UTF_8));

				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				org.apache.commons.io.IOUtils.copy(stream, baos);
				byte[] bytes = baos.toByteArray();
				BufferedReader br = new BufferedReader(new InputStreamReader((new ByteArrayInputStream(bytes))));

				String output;
				String reportType = "csv";
				while ((output = br.readLine()) != null) {
					if (output.contains("xml")) {
						reportType = "xml";
					}
				}
				BufferedReader br_write = new BufferedReader(new InputStreamReader((new ByteArrayInputStream(bytes))));
				BufferedWriter bw = new BufferedWriter(
						new FileWriter(new File(FILE_PATH + resourceFile + "." + reportType)));
				while ((output = br_write.readLine()) != null) {
					bw.write(output + "\n");
				}
				bw.close();

				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.DOWNLOAD_REPORT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (apiClient.getResponseBody() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.DOWNLOAD_REPORT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.FILE_CONTENT_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.DOWNLOAD_REPORT, ConstantUtility.ASSERTION_PASS,
							columns[4], null, apiClient.getResponseCode(), Boolean.TRUE);
				}
			} catch (ApiException e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.DOWNLOAD_REPORT, ConstantUtility.FAIL, columns[4], null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.DOWNLOAD_REPORT, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();

	}
}
