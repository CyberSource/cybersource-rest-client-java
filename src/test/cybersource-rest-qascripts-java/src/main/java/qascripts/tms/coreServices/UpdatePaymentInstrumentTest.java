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
import Model.Body3;
import Model.TmsV1PaymentinstrumentsPost201Response;
import Model.Tmsv1instrumentidentifiersCard;
import Model.Tmsv1paymentinstrumentsBillTo;
import Model.Tmsv1paymentinstrumentsCard;
import Model.Tmsv1paymentinstrumentsCard.TypeEnum;
import Model.Tmsv1paymentinstrumentsInstrumentIdentifier;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class UpdatePaymentInstrumentTest {

	public static void main(String args[]) throws Exception {
		UpdatePaymentInstrumentTest updatePaymentInstrumentTest = new UpdatePaymentInstrumentTest();
		updatePaymentInstrumentTest.process();
	}

	public TmsV1PaymentinstrumentsPost201Response process() throws Exception {
		TmsV1PaymentinstrumentsPost201Response response = null;
		Properties merchantProp;
		Body3 body;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\TMS\\CoreServices\\UpdatePaymentInstrument.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {

			body = new Body3();

			Tmsv1paymentinstrumentsCard card = new Tmsv1paymentinstrumentsCard();
			card.expirationMonth("09");
			card.expirationYear("2022");
			card.type(TypeEnum.VISA);
			body.card(card);

			Tmsv1paymentinstrumentsBillTo billTo = new Tmsv1paymentinstrumentsBillTo();
			billTo.firstName("John");
			billTo.lastName("Deo");
			billTo.company("CyberSource");
			billTo.address1("1 Market St");
			billTo.address2("20 Main Street");
			billTo.locality("san francisco");
			billTo.administrativeArea("CA");
			billTo.postalCode("94105");
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
				response = paymentInstrumentApi.tmsV1PaymentinstrumentsTokenIdPatch(columns[1], columns[2], body);
				if (!response.getState().getValue().equals(ConstantUtility.ACTIVE_STATE)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.UPDATE_PAYMENT_INSTRUMENT,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.STATUS_NOT_ACTIVE, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (!response.getId().equals(columns[2])) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.UPDATE_PAYMENT_INSTRUMENT,
							ConstantUtility.ASSERTION_FAILED, columns[3], response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.UPDATE_PAYMENT_INSTRUMENT,
							ConstantUtility.ASSERTION_PASS, columns[3], response.getId(), apiClient.getResponseCode(),
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.UPDATE_PAYMENT_INSTRUMENT, ConstantUtility.FAIL,
						reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (AssertionError e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.UPDATE_PAYMENT_INSTRUMENT,
						ConstantUtility.ASSERTION_FAILED, columns[3], response.getId(), apiClient.getResponseCode(),
						Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.UPDATE_PAYMENT_INSTRUMENT, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
