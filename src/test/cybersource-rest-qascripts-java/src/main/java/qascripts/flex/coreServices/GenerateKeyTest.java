package qascripts.flex.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.KeyGenerationApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.FlexV1KeysPost200Response;
import Model.GeneratePublicKeyRequest;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GenerateKeyTest {

	public static void main(String args[]) throws Exception {
		GenerateKeyTest generateKeyTest = new GenerateKeyTest();
		generateKeyTest.process();
	}

	public FlexV1KeysPost200Response process() throws Exception {
		FlexV1KeysPost200Response response = null;
		Properties merchantProp;

		File inputFile = new File(
				System.getProperty("user.dir") + "\\src\\main\\java\\CSV_Files\\Flex\\CoreServices\\GenerateKey.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();
		GeneratePublicKeyRequest request = null;

		while ((columns = csvReader.readNext()) != null) {
			request = new GeneratePublicKeyRequest();
			request.encryptionType(columns[1]);

			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				KeyGenerationApi keyGenerationApi = new KeyGenerationApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = keyGenerationApi.generatePublicKey(request);

				if (response.getKeyId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GENERATE_KEY, ConstantUtility.ASSERTION_FAILED,
							ConstantUtility.KEY_ID_NULL, response.getKeyId(), apiClient.getResponseCode(),
							Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GENERATE_KEY, ConstantUtility.ASSERTION_PASS,
							columns[2], response.getKeyId(), apiClient.getResponseCode(), Boolean.TRUE);
				}
			}

			catch (ApiException e) {
				String reason = null;
				try {
					if (apiClient.getRespBody() == null) {
						reason = e.getMessage();
					} else {
						JSONObject obj = new JSONObject(apiClient.getRespBody()).getJSONObject("responseStatus");
						reason = obj.getString("message");
					}
				} catch (JSONException exp) {
					reason = apiClient.getRespBody();
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GENERATE_KEY, ConstantUtility.FAIL, reason, null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GENERATE_KEY, ConstantUtility.FAIL, e.getMessage(),
						null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
