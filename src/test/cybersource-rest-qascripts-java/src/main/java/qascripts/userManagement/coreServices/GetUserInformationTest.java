package qascripts.userManagement.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.UserManagementApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.UmsV1UsersGet200Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GetUserInformationTest {

	public static void main(String args[]) throws Exception {
		GetUserInformationTest getUserInformationTest = new GetUserInformationTest();
		getUserInformationTest.process();
	}

	public UmsV1UsersGet200Response process() throws Exception {
		UmsV1UsersGet200Response response = null;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\UserManagement\\CoreServices\\GetUserInformation.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {

			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				UserManagementApi userManagementApi = new UserManagementApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = userManagementApi.getUsers(columns[1], null, null, columns[2]);
				JSONObject obj = new JSONObject(apiClient.getRespBody()).getJSONArray("users").getJSONObject(0)
						.getJSONObject("organizationInformation");
				String organaisationId = obj.getString("organizationId");
				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_USER_INFORMATION,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (!columns[1].equals(organaisationId)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_SEARCH_RESULT,
							ConstantUtility.ASSERTION_FAILED, columns[3], null, apiClient.getResponseCode(),
							Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_USER_INFORMATION,
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_USER_INFORMATION, ConstantUtility.FAIL, reason,
						null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_USER_INFORMATION, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
