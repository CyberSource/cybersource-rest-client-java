package qascripts.tms.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.InstrumentIdentifierApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.TmsV1InstrumentidentifiersPost200Response;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class RetrieveInstrumentIdentifierTest {

	public static void main(String args[]) throws Exception {
		RetrieveInstrumentIdentifierTest retrieveInstrumentIdentifierTest = new RetrieveInstrumentIdentifierTest();
		retrieveInstrumentIdentifierTest.process();
	}

	public TmsV1InstrumentidentifiersPost200Response process() throws Exception {
		TmsV1InstrumentidentifiersPost200Response response = null;
		Properties merchantProp;
		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\TMS\\CoreServices\\RetrieveInstrumentIdentifier.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {

			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				InstrumentIdentifierApi instrumentIdentifierApi = new InstrumentIdentifierApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = instrumentIdentifierApi.tmsV1InstrumentidentifiersTokenIdGet(columns[1], columns[2]);
				if (!response.getState().getValue().equals(ConstantUtility.ACTIVE_STATE)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_INSTRUMENT_IDENTIFIER,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.STATUS_NOT_ACTIVE, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (response.getId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_INSTRUMENT_IDENTIFIER,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.TOKEN_ID_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_INSTRUMENT_IDENTIFIER,
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_INSTRUMENT_IDENTIFIER, ConstantUtility.FAIL,
						reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (AssertionError e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_INSTRUMENT_IDENTIFIER,
						ConstantUtility.ASSERTION_FAILED, columns[3], response.getId(), apiClient.getResponseCode(),
						Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.RETRIEVE_INSTRUMENT_IDENTIFIER, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
