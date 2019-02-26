package qascripts.payments.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.PaymentsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.CreatePaymentRequest;
import Model.PtsV2PaymentsPost201Response;
import Model.Ptsv2paymentsClientReferenceInformation;
import Model.Ptsv2paymentsOrderInformation;
import Model.Ptsv2paymentsOrderInformationAmountDetails;
import Model.Ptsv2paymentsOrderInformationBillTo;
import Model.Ptsv2paymentsPaymentInformation;
import Model.Ptsv2paymentsPaymentInformationCard;
import Model.Ptsv2paymentsPointOfSaleInformation;
import au.com.bytecode.opencsv.CSVReader;
import junit.framework.Assert;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class ProcessPaymentTest {

	public static void main(String args[]) throws Exception {
		ProcessPaymentTest processPaymentTest = new ProcessPaymentTest();
		processPaymentTest.process();
	}

	public PtsV2PaymentsPost201Response process() throws Exception {
		PtsV2PaymentsPost201Response response = null;
		Properties merchantProp;
		String amount = null;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Payments\\CoreServices\\ProcessPayment.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		CreatePaymentRequest request = null;
		while ((columns = csvReader.readNext()) != null) {

			request = new CreatePaymentRequest();

			Ptsv2paymentsClientReferenceInformation client = new Ptsv2paymentsClientReferenceInformation();
			client.code("test_payment");
			request.clientReferenceInformation(client);

			Ptsv2paymentsPointOfSaleInformation saleInformation = new Ptsv2paymentsPointOfSaleInformation();
			saleInformation.cardPresent(false);
			saleInformation.catLevel(6);
			saleInformation.terminalCapability(4);
			request.pointOfSaleInformation(saleInformation);

			Ptsv2paymentsOrderInformationBillTo billTo = new Ptsv2paymentsOrderInformationBillTo();
			billTo.country("US");
			billTo.firstName("John");
			billTo.lastName("Deo");
			billTo.address1("1 Market St");
			billTo.postalCode("94105");
			billTo.locality("san francisco");
			billTo.administrativeArea("CA");
			billTo.email("test@cybs.com");

			Ptsv2paymentsOrderInformationAmountDetails amountDetails = new Ptsv2paymentsOrderInformationAmountDetails();
			amountDetails.totalAmount(columns[1]);
			amountDetails.currency("USD");

			Ptsv2paymentsOrderInformation orderInformation = new Ptsv2paymentsOrderInformation();
			orderInformation.billTo(billTo);
			orderInformation.amountDetails(amountDetails);
			request.setOrderInformation(orderInformation);

			Ptsv2paymentsPaymentInformationCard card = new Ptsv2paymentsPaymentInformationCard();
			card.expirationYear("2031");
			card.number("4111111111111111");
			card.securityCode("123");
			card.expirationMonth("12");

			Ptsv2paymentsPaymentInformation paymentInformation = new Ptsv2paymentsPaymentInformation();
			paymentInformation.card(card);
			request.setPaymentInformation(paymentInformation);
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				PaymentsApi paymentApi = new PaymentsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = paymentApi.createPayment(request);
				amount = response.getOrderInformation().getAmountDetails().getAuthorizedAmount();
				if (!response.getStatus().getValue().equals(ConstantUtility.AUTHORIZED_STATUS)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYMENT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.UN_AUTHORIZED, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (response.getId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYMENT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.PAYMENT_ID_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					Assert.assertEquals(columns[1], amount);
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYMENT, ConstantUtility.ASSERTION_PASS,
							columns[2], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYMENT, ConstantUtility.FAIL, reason, null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (AssertionError e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYMENT, ConstantUtility.ASSERTION_FAILED,
						columns[2], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYMENT, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;
	}

}