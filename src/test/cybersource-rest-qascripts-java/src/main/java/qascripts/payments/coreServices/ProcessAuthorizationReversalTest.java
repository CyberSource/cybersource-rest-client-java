package qascripts.payments.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.ReversalApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.AuthReversalRequest;
import Model.PtsV2PaymentsReversalsPost201Response;
import Model.Ptsv2paymentsidreversalsClientReferenceInformation;
import Model.Ptsv2paymentsidreversalsReversalInformation;
import Model.Ptsv2paymentsidreversalsReversalInformationAmountDetails;
import au.com.bytecode.opencsv.CSVReader;
import junit.framework.Assert;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class ProcessAuthorizationReversalTest {

	public static void main(String args[]) throws Exception {
		ProcessAuthorizationReversalTest processAuthorizationReversalTest = new ProcessAuthorizationReversalTest();
		processAuthorizationReversalTest.process();
	}

	public PtsV2PaymentsReversalsPost201Response process() throws Exception {

		PtsV2PaymentsReversalsPost201Response response = null;
		Properties merchantProp;
		String amount = null;
		String paymentId = null;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Payments\\CoreServices\\ProcessAuthorizationReversal.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		AuthReversalRequest request = null;

		while ((columns = csvReader.readNext()) != null) {

			request = new AuthReversalRequest();

			paymentId = columns[1];
			Ptsv2paymentsidreversalsClientReferenceInformation client = new Ptsv2paymentsidreversalsClientReferenceInformation();
			client.code("test_reversal");
			request.setClientReferenceInformation(client);

			Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails = new Ptsv2paymentsidreversalsReversalInformationAmountDetails();
			amountDetails.totalAmount(columns[2]);

			Ptsv2paymentsidreversalsReversalInformation reversalInformation = new Ptsv2paymentsidreversalsReversalInformation();
			reversalInformation.reason("testing");
			reversalInformation.setAmountDetails(amountDetails);

			request.setReversalInformation(reversalInformation);
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ReversalApi reversalApi = new ReversalApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = reversalApi.authReversal(paymentId, request);
				amount = response.getReversalAmountDetails().getReversedAmount();
				if (!response.getStatus().getValue().equals(ConstantUtility.REVERESED_STATUS)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_AUTHORIZATION_REVERESAL,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.NOT_REVERESED_STATUS, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (response.getId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_AUTHORIZATION_REVERESAL,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.PAYMENT_ID_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					Assert.assertEquals(columns[2], amount);
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_AUTHORIZATION_REVERESAL, ConstantUtility.ASSERTION_PASS,
							columns[3], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
				}
			} catch (ApiException e) {
				String reason = null;
				try {
					if (apiClient.getRespBody() == null) {
						reason = e.getMessage();
					} else {
						JSONObject obj = new JSONObject(apiClient.getRespBody());
						reason = obj.getString("message");
					}
				} catch (JSONException exp) {
					reason = apiClient.getRespBody();
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_AUTHORIZATION_REVERESAL, ConstantUtility.FAIL, reason,
						null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (AssertionError e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_AUTHORIZATION_REVERESAL, ConstantUtility.ASSERTION_FAILED,
						columns[3], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_AUTHORIZATION_REVERESAL, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}