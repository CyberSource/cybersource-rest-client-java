package qascripts.payments.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.CreditApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.CreateCreditRequest;
import Model.PtsV2CreditsPost201Response;
import Model.Ptsv2paymentsClientReferenceInformation;
import Model.Ptsv2paymentsidcapturesAggregatorInformation;
import Model.Ptsv2paymentsidcapturesAggregatorInformationSubMerchant;
import Model.Ptsv2paymentsidcapturesBuyerInformation;
import Model.Ptsv2paymentsidcapturesOrderInformationAmountDetails;
import Model.Ptsv2paymentsidcapturesOrderInformationBillTo;
import Model.Ptsv2paymentsidcapturesOrderInformationInvoiceDetails;
import Model.Ptsv2paymentsidcapturesOrderInformationShippingDetails;
import Model.Ptsv2paymentsidrefundsMerchantInformation;
import Model.Ptsv2paymentsidrefundsOrderInformation;
import Model.Ptsv2paymentsidrefundsPaymentInformation;
import Model.Ptsv2paymentsidrefundsPaymentInformationCard;
import au.com.bytecode.opencsv.CSVReader;
import junit.framework.Assert;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class ProcessCreditTest {

	public static void main(String args[]) throws Exception {
		ProcessCreditTest processCreditTest = new ProcessCreditTest();
		processCreditTest.process();
	}

	public PtsV2CreditsPost201Response process() throws Exception {

		PtsV2CreditsPost201Response response = null;
		Properties merchantProp;
		String amount = null;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Payments\\CoreServices\\ProcessCredit.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		CreateCreditRequest request = null;

		while ((columns = csvReader.readNext()) != null) {

			request = new CreateCreditRequest();

			Ptsv2paymentsClientReferenceInformation client = new Ptsv2paymentsClientReferenceInformation();
			client.code("test_credits");
			request.setClientReferenceInformation(client);

			Ptsv2paymentsidcapturesBuyerInformation buyerInformation = new Ptsv2paymentsidcapturesBuyerInformation();
			buyerInformation.merchantCustomerId("123456abcd");
			request.buyerInformation(buyerInformation);

			Ptsv2paymentsidcapturesAggregatorInformationSubMerchant subMerchant = new Ptsv2paymentsidcapturesAggregatorInformationSubMerchant();

			subMerchant.country("US");
			subMerchant.phoneNumber("4158880000");
			subMerchant.address1("1 Market St");
			subMerchant.postalCode("941055");
			subMerchant.locality("san francisco");
			subMerchant.name("Visa Inc");
			subMerchant.administrativeArea("CA");
			subMerchant.email("test@cybs.com");

			Ptsv2paymentsidcapturesAggregatorInformation aggregatorInformation = new Ptsv2paymentsidcapturesAggregatorInformation();
			aggregatorInformation.subMerchant(subMerchant);
			aggregatorInformation.name("V-Internatio");
			aggregatorInformation.aggregatorId("123456789");
			request.setAggregatorInformation(aggregatorInformation);

			Ptsv2paymentsidcapturesOrderInformationShippingDetails shippingDetails = new Ptsv2paymentsidcapturesOrderInformationShippingDetails();
			shippingDetails.shipFromPostalCode("47404");

			Ptsv2paymentsidcapturesOrderInformationBillTo billTo = new Ptsv2paymentsidcapturesOrderInformationBillTo();
			billTo.country("US");
			billTo.firstName("John");
			billTo.lastName("Deo");
			billTo.phoneNumber("4158880000");
			billTo.address1("1 Market St");
			billTo.postalCode("94105");
			billTo.locality("san francisco");
			billTo.company("Visa");
			billTo.administrativeArea("MI");
			billTo.email("test@cybs.com");

			Ptsv2paymentsidcapturesOrderInformationInvoiceDetails invoiceDetails = new Ptsv2paymentsidcapturesOrderInformationInvoiceDetails();
			invoiceDetails.purchaseOrderDate("20111231");
			invoiceDetails.purchaseOrderNumber("CREDIT US");

			Ptsv2paymentsidcapturesOrderInformationAmountDetails amountDetails = new Ptsv2paymentsidcapturesOrderInformationAmountDetails();
			amountDetails.totalAmount(columns[1]);
			amountDetails.exchangeRate("0.5");
			amountDetails.exchangeRateTimeStamp("2.01304E+13");
			amountDetails.currency("usd");

			Ptsv2paymentsidrefundsOrderInformation orderInformation = new Ptsv2paymentsidrefundsOrderInformation();
			orderInformation.shippingDetails(shippingDetails);
			orderInformation.billTo(billTo);
			orderInformation.invoiceDetails(invoiceDetails);
			orderInformation.amountDetails(amountDetails);
			request.setOrderInformation(orderInformation);

			Ptsv2paymentsidrefundsMerchantInformation merchantInformation = new Ptsv2paymentsidrefundsMerchantInformation();
			merchantInformation.categoryCode(1234);
			request.merchantInformation(merchantInformation);

			Ptsv2paymentsidrefundsPaymentInformationCard card = new Ptsv2paymentsidrefundsPaymentInformationCard();
			card.expirationYear("2031");
			card.number("5555555555554444");
			card.expirationMonth("12");
			card.type("002");

			Ptsv2paymentsidrefundsPaymentInformation paymentInformation = new Ptsv2paymentsidrefundsPaymentInformation();
			paymentInformation.card(card);
			request.setPaymentInformation(paymentInformation);
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				CreditApi creditApi = new CreditApi(merchantConfig);
				apiClient=Invokers.Configuration.getDefaultApiClient();
				response = creditApi.createCredit(request);
				amount = response.getCreditAmountDetails().getCreditAmount();
				if (!response.getStatus().getValue().equals(ConstantUtility.PENDING_STATUS)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_CREDIT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.NOT_PENDING_STATUS, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (response.getId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_CREDIT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.PAYMENT_ID_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					Assert.assertEquals(columns[1], amount);
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_CREDIT, ConstantUtility.ASSERTION_PASS,
							columns[2], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
				}
			}

			catch (ApiException e) {
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_CREDIT, ConstantUtility.FAIL, reason, null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (AssertionError e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_CREDIT, ConstantUtility.ASSERTION_FAILED,
						columns[2], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_CREDIT, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}