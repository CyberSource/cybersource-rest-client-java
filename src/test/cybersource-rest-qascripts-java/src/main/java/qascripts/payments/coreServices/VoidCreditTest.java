package qascripts.payments.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.VoidApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.PtsV2PaymentsVoidsPost201Response;
import Model.Ptsv2paymentsidreversalsClientReferenceInformation;
import Model.VoidCreditRequest;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class VoidCreditTest {

	public static void main(String args[]) throws Exception {
		VoidCreditTest voidCreditTest = new VoidCreditTest();
		voidCreditTest.process();
	}

	public  PtsV2PaymentsVoidsPost201Response process() throws Exception {

		PtsV2PaymentsVoidsPost201Response response = null;
		Properties merchantProp;
		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Payments\\CoreServices\\VoidCredit.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		VoidCreditRequest request = null;

		while ((columns = csvReader.readNext()) != null) {

			request = new VoidCreditRequest();
			Ptsv2paymentsidreversalsClientReferenceInformation client = new Ptsv2paymentsidreversalsClientReferenceInformation();
			client.code("test_credit_void");
			request.setClientReferenceInformation(client);

			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				VoidApi voidApi = new VoidApi(merchantConfig);
				apiClient=Invokers.Configuration.getDefaultApiClient();
				response = voidApi.voidCredit(request, columns[1]);
				if (!response.getStatus().getValue().equals(ConstantUtility.VOIDED_STATUS)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.VOID_CREDIT, ConstantUtility.ASSERTION_FAILED,
							ConstantUtility.NOT_VOIDED_STATUS, response.getId(), apiClient.getResponseCode(),
							Boolean.TRUE);
				} else if (response.getId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.VOID_CREDIT, ConstantUtility.ASSERTION_FAILED,
							ConstantUtility.PAYMENT_ID_NULL, response.getId(), apiClient.getResponseCode(),
							Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.VOID_CREDIT, ConstantUtility.ASSERTION_PASS,
							columns[3], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
				}
			}

			catch (ApiException e) {
				String reason = null;
				try {
					if (apiClient.getRespBody() == null) {
						reason =columns[3];
						apiClient.setResponseCode("404");
					} else {
						JSONObject obj = new JSONObject(apiClient.getRespBody());
						reason = obj.getString("message");
					}
				} catch (JSONException exp) {
					reason = apiClient.getRespBody();
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.VOID_CREDIT, ConstantUtility.FAIL, reason, null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.VOID_CREDIT, ConstantUtility.FAIL, e.getMessage(),
						null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
