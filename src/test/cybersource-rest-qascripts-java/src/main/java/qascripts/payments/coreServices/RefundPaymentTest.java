package qascripts.payments.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.RefundApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.PtsV2PaymentsRefundPost201Response;
import Model.Ptsv2paymentsClientReferenceInformation;
import Model.Ptsv2paymentsidcapturesOrderInformationAmountDetails;
import Model.Ptsv2paymentsidrefundsOrderInformation;
import Model.RefundPaymentRequest;
import au.com.bytecode.opencsv.CSVReader;
import junit.framework.Assert;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class RefundPaymentTest {

	public static void main(String args[]) throws Exception {
		RefundPaymentTest refundPaymentTest =new RefundPaymentTest();
		refundPaymentTest.process();
	}

	public PtsV2PaymentsRefundPost201Response process() throws Exception {

		PtsV2PaymentsRefundPost201Response response = null;
		Properties merchantProp;
		String amount = null;
		String paymentId = null;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Payments\\CoreServices\\RefundPayment.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		RefundPaymentRequest request = null;

		while ((columns = csvReader.readNext()) != null) {

			request = new RefundPaymentRequest();

			paymentId = columns[1];

			Ptsv2paymentsClientReferenceInformation client = new Ptsv2paymentsClientReferenceInformation();
			client.code("test_refund_payment");
			request.setClientReferenceInformation(client);

			Ptsv2paymentsidcapturesOrderInformationAmountDetails amountDetails = new Ptsv2paymentsidcapturesOrderInformationAmountDetails();
			amountDetails.totalAmount(columns[2]);
			amountDetails.currency("USD");

			Ptsv2paymentsidrefundsOrderInformation orderInformation = new Ptsv2paymentsidrefundsOrderInformation();
			orderInformation.amountDetails(amountDetails);
			request.setOrderInformation(orderInformation);

			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				RefundApi refundApi = new RefundApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = refundApi.refundPayment(request, paymentId);
				amount = response.getRefundAmountDetails().getRefundAmount();
				if (!response.getStatus().getValue().equals(ConstantUtility.PENDING_STATUS)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_PAYMENT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.NOT_PENDING_STATUS, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (response.getId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_PAYMENT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.PAYMENT_ID_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					Assert.assertEquals(columns[2], amount);
					CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_PAYMENT, ConstantUtility.ASSERTION_PASS,
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_PAYMENT, ConstantUtility.FAIL, reason, null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (AssertionError e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_PAYMENT, ConstantUtility.ASSERTION_FAILED,
						columns[3], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_PAYMENT, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
