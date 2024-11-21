package qascripts.reporting.coreServices;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONArray;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.PurchaseAndRefundDetailsApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import au.com.bytecode.opencsv.CSVReader;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class GetPurchaseAndRefundDetailsTest {

	public static void main(String args[]) throws Exception {
		GetPurchaseAndRefundDetailsTest getPurchaseAndRefundDetailsTest = new GetPurchaseAndRefundDetailsTest();
		getPurchaseAndRefundDetailsTest.process();
	}

	public void process() throws Exception {
		String organizationId = null;
		String groupName = "groupName";
		String paymentSubtype = "VI";
		String viewBy = "requestDate";
		int offSet = 20;
		int limit = 2000;
		Properties merchantProp;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Reporting\\CoreServices\\GetPurchaseAndRefundDetails.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		while ((columns = csvReader.readNext()) != null) {
			organizationId = columns[3];
			String timeString = columns[1];
			DateTime ddateTime = new DateTime(timeString);
			DateTime startTime = ddateTime.withZone(DateTimeZone.forID("Asia/Ashkhabad"));

			String timeString2 = columns[2];
			DateTime ddateTime2 = new DateTime(timeString2);
			DateTime endTime = ddateTime2.withZone(DateTimeZone.forID("Asia/Ashkhabad"));
			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				PurchaseAndRefundDetailsApi purchaseAndRefundDetailsApi = new PurchaseAndRefundDetailsApi(
						merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				purchaseAndRefundDetailsApi.getPurchaseAndRefundDetails(startTime, endTime, organizationId,
						paymentSubtype, viewBy, groupName, offSet, limit);

				if (apiClient.getResponseCode() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_PURCHASE_AND_REFUND_DETAIL,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.RESPONSE_CODE_NULL, null,
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_PURCHASE_AND_REFUND_DETAIL,
							ConstantUtility.ASSERTION_PASS, columns[3], null, apiClient.getResponseCode(),
							Boolean.TRUE);
				}
			} catch (ApiException e) {
				String reason = null;
				try {
					if (apiClient.getRespBody() == null) {
						reason = e.getMessage();
					} else {
						JSONArray jsonarray = new JSONObject(apiClient.getRespBody()).getJSONArray("fields");

						JSONObject obj = jsonarray.getJSONObject(0);
						reason = obj.getString("message");
					}
				} catch (JSONException exp) {
					reason = apiClient.getRespBody();
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_PURCHASE_AND_REFUND_DETAIL,
						ConstantUtility.FAIL, reason, null, apiClient.getResponseCode(), Boolean.TRUE);
			} catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.GET_PURCHASE_AND_REFUND_DETAIL,
						ConstantUtility.FAIL, e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();

	}
}