package qascripts.payouts.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.ProcessAPayoutApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.PtsV2PaymentsPost201ResponseClientReferenceInformation;
import Model.PtsV2PayoutsPostResponse;
import Model.Ptsv2payoutsMerchantInformation;
import Model.Ptsv2payoutsMerchantInformationMerchantDescriptor;
import Model.Ptsv2payoutsOrderInformation;
import Model.Ptsv2payoutsOrderInformationAmountDetails;
import Model.Ptsv2payoutsPaymentInformation;
import Model.Ptsv2payoutsPaymentInformationCard;
import Model.Ptsv2payoutsProcessingInformation;
import Model.Ptsv2payoutsRecipientInformation;
import Model.Ptsv2payoutsSenderInformation;
import Model.Ptsv2payoutsSenderInformationAccount;
import au.com.bytecode.opencsv.CSVReader;
import junit.framework.Assert;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class ProcessPayoutTest {

	public static void main(String args[]) throws Exception {
		ProcessPayoutTest processPayoutTest = new ProcessPayoutTest();
		processPayoutTest.process();
	}

	public void process() throws Exception {
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Payouts\\CoreServices\\CreatePayout.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		PtsV2PayoutsPostResponse request = null;

		while ((columns = csvReader.readNext()) != null) {

			request = new PtsV2PayoutsPostResponse();

			PtsV2PaymentsPost201ResponseClientReferenceInformation client = new PtsV2PaymentsPost201ResponseClientReferenceInformation();
			client.code(columns[1]);
			request.clientReferenceInformation(client);

			Ptsv2payoutsSenderInformationAccount account = new Ptsv2payoutsSenderInformationAccount();
			account.number("1234567890123456789012345678901234");
			account.fundsSource("01");

			Ptsv2payoutsSenderInformation senderInformation = new Ptsv2payoutsSenderInformation();
			senderInformation.referenceNumber("1234567890");
			senderInformation.address1("900 Metro Center Blvd.900");
			senderInformation.countryCode("US");
			senderInformation.locality("Foster City");
			senderInformation.name("Thomas Jefferson");
			senderInformation.administrativeArea("CA");
			request.senderInformation(senderInformation);

			Ptsv2payoutsProcessingInformation processingInformation = new Ptsv2payoutsProcessingInformation();
			processingInformation.commerceIndicator("internet");
			processingInformation.businessApplicationId(columns[2]);
			processingInformation.networkRoutingOrder("ECG");
			request.processingInformation(processingInformation);

			Ptsv2payoutsOrderInformationAmountDetails amountDetails = new Ptsv2payoutsOrderInformationAmountDetails();
			amountDetails.totalAmount(columns[3]);
			amountDetails.currency("USD");

			Ptsv2payoutsOrderInformation orderInformation = new Ptsv2payoutsOrderInformation();
			orderInformation.amountDetails(amountDetails);
			request.orderInformation(orderInformation);

			Ptsv2payoutsMerchantInformationMerchantDescriptor merchantDescriptor = new Ptsv2payoutsMerchantInformationMerchantDescriptor();
			merchantDescriptor.country("US");
			merchantDescriptor.postalCode("94440");
			merchantDescriptor.locality("FC");
			merchantDescriptor.name("Thomas");
			merchantDescriptor.administrativeArea("CA");

			Ptsv2payoutsMerchantInformation merchantInformation = new Ptsv2payoutsMerchantInformation();
			merchantInformation.categoryCode(123);
			merchantInformation.merchantDescriptor(merchantDescriptor);
			request.merchantInformation(merchantInformation);

			Ptsv2payoutsPaymentInformationCard card = new Ptsv2payoutsPaymentInformationCard();
			card.expirationYear("2025");
			card.number("4111111111111111");
			card.expirationMonth("12");
			card.type("001");
			card.sourceAccountType("CH");

			Ptsv2payoutsPaymentInformation paymentInformation = new Ptsv2payoutsPaymentInformation();
			paymentInformation.card(card);
			request.paymentInformation(paymentInformation);

			Ptsv2payoutsRecipientInformation recipientInformation = new Ptsv2payoutsRecipientInformation();
			recipientInformation.firstName("John");
			recipientInformation.lastName("Deo");
			recipientInformation.address1("Paseo Padre Boulevard");
			recipientInformation.locality("Foster City");
			recipientInformation.administrativeArea("CA");
			recipientInformation.postalCode("94400");
			recipientInformation.phoneNumber("6504320556");
			recipientInformation.country("US");
			request.recipientInformation(recipientInformation);
			ApiClient apiClient = null;
			String respId= null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				ProcessAPayoutApi payoutApi = new ProcessAPayoutApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				payoutApi.octCreatePayment(request);
				JSONObject obj = new JSONObject(apiClient.getRespBody());
				respId = obj.getString("id");
				String amount = new JSONObject(apiClient.getRespBody()).getJSONObject("orderInformation").getJSONObject("amountDetails").getString("totalAmount");
				if (!obj.getString("status").equals(ConstantUtility.ACCEPTED_STATUS)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYOUT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.NOT_ACCEPTED_STATUS, respId,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (respId == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYOUT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.PAYMENT_ID_NULL, respId,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					Assert.assertEquals(columns[3], amount);
					CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYOUT, ConstantUtility.ASSERTION_PASS,
							columns[4], respId, apiClient.getResponseCode(), Boolean.TRUE);
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYOUT, ConstantUtility.FAIL, reason, null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (AssertionError e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYOUT, ConstantUtility.ASSERTION_FAILED,
						columns[4], respId, apiClient.getResponseCode(), Boolean.TRUE);
			}catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.PROCESS_PAYOUT, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();

	}
}
