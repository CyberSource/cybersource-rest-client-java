package qascripts.tms.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.PaymentInstrumentsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.Body2;
import Model.TmsV1PaymentinstrumentsPost201Response;
import Model.Tmsv1instrumentidentifiersCard;
import Model.Tmsv1paymentinstrumentsBillTo;
import Model.Tmsv1paymentinstrumentsCard;
import Model.Tmsv1paymentinstrumentsCard.TypeEnum;
import Model.Tmsv1paymentinstrumentsInstrumentIdentifier;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class CreatePaymentInstrumentTest {

	public static void main(String args[]) throws Exception {
		CreatePaymentInstrumentTest createPaymentInstrumentTest = new CreatePaymentInstrumentTest();
		createPaymentInstrumentTest.process();
	}

	public TmsV1PaymentinstrumentsPost201Response process() throws Exception {
		TmsV1PaymentinstrumentsPost201Response response = null;
		Properties merchantProp;
		Body2 body;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\TMS\\CoreServices\\CreatePaymentsInstruments.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {

			body = new Body2();
			Tmsv1paymentinstrumentsCard card = new Tmsv1paymentinstrumentsCard();
			card.expirationMonth("09");
			card.expirationYear("2022");
			card.type(TypeEnum.VISA);
			body.card(card);

			Tmsv1paymentinstrumentsBillTo billTo = new Tmsv1paymentinstrumentsBillTo();
			billTo.firstName("John");
			billTo.lastName("Deo");
			billTo.company("CyberSource");
			billTo.address1("12 Main Street");
			billTo.address2("20 My Street");
			billTo.locality("Foster City");
			billTo.administrativeArea("CA");
			billTo.postalCode("90200");
			billTo.country("US");
			billTo.email("test@cybs.com");
			billTo.phoneNumber("555123456");
			body.billTo(billTo);

			Tmsv1instrumentidentifiersCard instrumentidentifiersCard = new Tmsv1instrumentidentifiersCard();
			instrumentidentifiersCard.number("4111111111111111");

			Tmsv1paymentinstrumentsInstrumentIdentifier instrumentIdentifier = new Tmsv1paymentinstrumentsInstrumentIdentifier();
			instrumentIdentifier.card(instrumentidentifiersCard);
			body.instrumentIdentifier(instrumentIdentifier);
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				PaymentInstrumentsApi paymentInstrumentApi = new PaymentInstrumentsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = paymentInstrumentApi.tmsV1PaymentinstrumentsPost(columns[1], body);

				if (!response.getState().getValue().equals(ConstantUtility.ACTIVE_STATE)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_PAYMENT_INSTRUMENT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.STATUS_NOT_ACTIVE, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (response.getId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_PAYMENT_INSTRUMENT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.PAYMENT_ID_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_PAYMENT_INSTRUMENT,
							ConstantUtility.ASSERTION_PASS, columns[2], response.getId(), apiClient.getResponseCode(),
							Boolean.TRUE);
				}
			} catch (ApiException e) {
				String reason = null;
				try {
					if (apiClient.getRespBody() == null) {
						reason = e.getMessage();
					} else {
						JSONObject jsonObject = new JSONObject(apiClient.getRespBody());
						JSONObject obj = jsonObject.getJSONArray("errors").getJSONObject(0);
						reason = obj.getString("message");
					}
				} catch (JSONException exp) {
					reason = apiClient.getRespBody();
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_PAYMENT_INSTRUMENT, ConstantUtility.FAIL,
						reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.CREATE_PAYMENT_INSTRUMENT, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}