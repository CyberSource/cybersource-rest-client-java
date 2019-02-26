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
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class DeleteInstrumentIdentifierTest {

	public static void main(String args[]) throws Exception {
		DeleteInstrumentIdentifierTest deleteInstrumentIdentifierTest = new DeleteInstrumentIdentifierTest();
		deleteInstrumentIdentifierTest.process();
	}

	public void process() throws Exception {
		Properties merchantProp;
		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\TMS\\CoreServices\\DeleteInstrumentIdentifier.csv");
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
				instrumentIdentifierApi.tmsV1InstrumentidentifiersTokenIdDelete(columns[1], columns[2]);

				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.DELETE_INSTRUMENT_IDENTIFIER,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.DELETE_INSTRUMENT_IDENTIFIER,
							ConstantUtility.ASSERTION_PASS, columns[3], null, apiClient.getResponseCode(),
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
				CsvUtility.writingToCsv(columns[0], ConstantUtility.DELETE_INSTRUMENT_IDENTIFIER, ConstantUtility.FAIL,
						reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.DELETE_INSTRUMENT_IDENTIFIER, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();

	}
}
