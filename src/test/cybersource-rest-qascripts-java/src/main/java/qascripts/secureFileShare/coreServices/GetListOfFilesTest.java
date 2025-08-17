package qascripts.secureFileShare.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.joda.time.LocalDate;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.SecureFileShareApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GetListOfFilesTest {

	public static void main(String args[]) throws Exception {
		GetListOfFilesTest getListOfFilesTest = new GetListOfFilesTest();
		getListOfFilesTest.process();
	}

	public void process() throws Exception {
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\SecureFileShare\\CoreServices\\GetListOfFiles.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			LocalDate startDate = new LocalDate(columns[2]);
			LocalDate endDate = new LocalDate(columns[3]);
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				SecureFileShareApi secureFileShareApi = new SecureFileShareApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				secureFileShareApi.getFileDetails(startDate, endDate, columns[1]);
				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_LIST_OF_FILE,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_LIST_OF_FILE,
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_LIST_OF_FILE, ConstantUtility.FAIL, reason,
						null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_LIST_OF_FILE, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();

	}
}
