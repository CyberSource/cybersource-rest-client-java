package qascripts.payments.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.CaptureApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.CapturePaymentRequest;
import Model.PtsV2PaymentsCapturesPost201Response;
import Model.Ptsv2paymentsClientReferenceInformation;
import Model.Ptsv2paymentsidcapturesOrderInformation;
import Model.Ptsv2paymentsidcapturesOrderInformationAmountDetails;
import Model.Ptsv2paymentsidcapturesOrderInformationBillTo;
import Model.Ptsv2paymentsidcapturesPointOfSaleInformation;
import au.com.bytecode.opencsv.CSVReader;
import junit.framework.Assert;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class CapturePaymentTest {

	public static void main(String args[]) throws Exception {
		CapturePaymentTest capturePaymentTest = new CapturePaymentTest();
		capturePaymentTest.process();
	}

	public PtsV2PaymentsCapturesPost201Response process() throws Exception {

		PtsV2PaymentsCapturesPost201Response response = null;
		Properties merchantProp;
		String amount = null;
		String paymentId = null;
		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Payments\\CoreServices\\CapturePayment.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		CapturePaymentRequest request = null;

		while ((columns = csvReader.readNext()) != null) {

			request = new CapturePaymentRequest();

			paymentId = columns[1];

			Ptsv2paymentsClientReferenceInformation client = new Ptsv2paymentsClientReferenceInformation();
			client.code("test_capture");
			request.setClientReferenceInformation(client);

			Ptsv2paymentsidcapturesPointOfSaleInformation saleInformation = new Ptsv2paymentsidcapturesPointOfSaleInformation();
			request.pointOfSaleInformation(saleInformation);

			Ptsv2paymentsidcapturesOrderInformationBillTo billTo = new Ptsv2paymentsidcapturesOrderInformationBillTo();
			billTo.country("US");
			billTo.firstName("John");
			billTo.lastName("Deo");
			billTo.address1("1 Market St");
			billTo.postalCode("94105");
			billTo.locality("san francisco");
			billTo.administrativeArea("CA");
			billTo.email("test@cybs.com");

			Ptsv2paymentsidcapturesOrderInformationAmountDetails amountDetails = new Ptsv2paymentsidcapturesOrderInformationAmountDetails();
			amountDetails.totalAmount(columns[2]);
			amountDetails.currency("USD");

			Ptsv2paymentsidcapturesOrderInformation orderInformation = new Ptsv2paymentsidcapturesOrderInformation();
			orderInformation.billTo(billTo);
			orderInformation.amountDetails(amountDetails);
			request.setOrderInformation(orderInformation);
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				CaptureApi captureApi = new CaptureApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = captureApi.capturePayment(request, paymentId);
				amount = response.getOrderInformation().getAmountDetails().getTotalAmount();
				if (!response.getStatus().getValue().equals(ConstantUtility.PENDING_STATUS)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CAPTURE_PAYMENT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.NOT_PENDING_STATUS, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (response.getId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CAPTURE_PAYMENT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.PAYMENT_ID_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					Assert.assertEquals(columns[2], amount);
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CAPTURE_PAYMENT, ConstantUtility.ASSERTION_PASS,
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CAPTURE_PAYMENT, ConstantUtility.FAIL, reason, null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (AssertionError e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CAPTURE_PAYMENT, ConstantUtility.ASSERTION_FAILED,
						columns[3], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CAPTURE_PAYMENT, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;
	}
}
