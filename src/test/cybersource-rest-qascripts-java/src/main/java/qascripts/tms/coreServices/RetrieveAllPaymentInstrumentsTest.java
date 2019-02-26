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
import Model.TmsV1InstrumentidentifiersPaymentinstrumentsGet200Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class RetrieveAllPaymentInstrumentsTest {

	public static void main(String args[]) throws Exception {
		RetrieveAllPaymentInstrumentsTest retrieveAllPaymentInstrumentsTest = new RetrieveAllPaymentInstrumentsTest();
		retrieveAllPaymentInstrumentsTest.process();
	}

	public TmsV1InstrumentidentifiersPaymentinstrumentsGet200Response process() throws Exception {
		TmsV1InstrumentidentifiersPaymentinstrumentsGet200Response response = null;
		Properties merchantProp;
		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\TMS\\CoreServices\\RetrieveAllPaymentInstruments.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();
		String tokenId = null;
		while ((columns = csvReader.readNext()) != null) {
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				PaymentInstrumentsApi paymentInstrumentsApi = new PaymentInstrumentsApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = paymentInstrumentsApi.tmsV1InstrumentidentifiersTokenIdPaymentinstrumentsGet(columns[1],
						columns[2], null, null);
				tokenId=response.getLinks().getSelf().getHref().split("/")[6];
				if (!columns[2].equals(tokenId)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_ALL_PAYMENT_INSTRUMENTS,
							ConstantUtility.ASSERTION_FAILED, columns[3], tokenId,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_ALL_PAYMENT_INSTRUMENTS,
							ConstantUtility.ASSERTION_PASS, columns[3], tokenId, apiClient.getResponseCode(),
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_ALL_PAYMENT_INSTRUMENTS, ConstantUtility.FAIL,
						reason, tokenId, apiClient.getResponseCode(), Boolean.TRUE);
			}catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_ALL_PAYMENT_INSTRUMENTS, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
