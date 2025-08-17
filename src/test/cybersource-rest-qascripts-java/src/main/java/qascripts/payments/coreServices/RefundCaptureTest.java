package qascripts.payments.coreServices;

import java.io.File;
import java.io.FileReader;
import java.net.SocketTimeoutException;
import java.util.Properties;

import com.cybersource.authsdk.core.MerchantConfig;
import com.cybersource.flex.sdk.repackaged.JSONException;
import com.cybersource.flex.sdk.repackaged.JSONObject;

import Api.RefundApi;
import Data.Configuration;
import Invokers.ApiClient;
import Invokers.ApiException;
import Model.PtsV2PaymentsRefundPost201Response;
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
import Model.RefundCaptureRequest;
import au.com.bytecode.opencsv.CSVReader;
import junit.framework.Assert;
import qascripts.Utility.ConstantUtility;
import qascripts.Utility.CsvUtility;

public class RefundCaptureTest {

	public static void main(String args[]) throws Exception {
		RefundCaptureTest refundCaptureTest = new RefundCaptureTest();
		refundCaptureTest.process();
	}

	public PtsV2PaymentsRefundPost201Response process() throws Exception {

		PtsV2PaymentsRefundPost201Response response = null;
		Properties merchantProp;
		String amount = null;
		String captureId = null;

		File inputFile = new File(System.getProperty("user.dir")
				+ "\\src\\main\\java\\CSV_Files\\Payments\\CoreServices\\RefundCapture.csv");
		CSVReader csvReader = new CSVReader(new FileReader(inputFile));
		String[] columns = null;
		csvReader.readNext();

		RefundCaptureRequest request = null;

		while ((columns = csvReader.readNext()) != null) {

			request = new RefundCaptureRequest();

			captureId = columns[1];

			Ptsv2paymentsClientReferenceInformation client = new Ptsv2paymentsClientReferenceInformation();
			client.code("test_refund_capture");
			request.setClientReferenceInformation(client);

			Ptsv2paymentsidcapturesBuyerInformation buyerInformation = new Ptsv2paymentsidcapturesBuyerInformation();
			buyerInformation.merchantCustomerId("123456abcd");
			request.buyerInformation(buyerInformation);

			Ptsv2paymentsidcapturesAggregatorInformationSubMerchant subMerchant = new Ptsv2paymentsidcapturesAggregatorInformationSubMerchant();

			subMerchant.country("US");
			subMerchant.phoneNumber("4158880000");
			subMerchant.address1("1 Market St");
			subMerchant.postalCode("94105");
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
			billTo.phoneNumber("9999999");
			billTo.address2("Foster City");
			billTo.address1("1 Market St");
			billTo.postalCode("94105");
			billTo.locality("Ann Arbor");
			billTo.company("Visa");
			billTo.administrativeArea("MI");
			billTo.email("test@cybs.com");

			Ptsv2paymentsidcapturesOrderInformationInvoiceDetails invoiceDetails = new Ptsv2paymentsidcapturesOrderInformationInvoiceDetails();
			invoiceDetails.purchaseOrderDate("20111231");
			invoiceDetails.purchaseOrderNumber("CREDIT US");

			Ptsv2paymentsidcapturesOrderInformationAmountDetails amountDetails = new Ptsv2paymentsidcapturesOrderInformationAmountDetails();
			amountDetails.totalAmount(columns[2]);
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

			ApiClient apiClient = null;
			try {
				/* Read Merchant details. */
				merchantProp = Configuration.getMerchantDetails();
				MerchantConfig merchantConfig = new MerchantConfig(merchantProp);
				RefundApi refundApi = new RefundApi(merchantConfig);
				apiClient = Invokers.Configuration.getDefaultApiClient();
				response = refundApi.refundCapture(request, captureId);
				amount = response.getRefundAmountDetails().getRefundAmount();
				if (!response.getStatus().getValue().equals(ConstantUtility.PENDING_STATUS)) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_CAPTURE,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.NOT_PENDING_STATUS, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else if (response.getId() == null) {
					CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_CAPTURE,
							ConstantUtility.ASSERTION_FAILED, ConstantUtility.PAYMENT_ID_NULL, response.getId(),
							apiClient.getResponseCode(), Boolean.TRUE);
				} else {
					Assert.assertEquals(columns[2], amount);
					CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_CAPTURE, ConstantUtility.ASSERTION_PASS,
							columns[3], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
				}
			}

			catch (ApiException e) {
				String reason = null;
				try {
					if (apiClient.getRespBody() == null) {
						reason =columns[3];
						apiClient.setResponseCode("404");
					} else {
						JSONObject obj = new JSONObject(apiClient.getRespBody());
						reason = obj.getString("message");
					}
				} catch (JSONException exp) {
					reason = apiClient.getRespBody();
				}
				CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_CAPTURE, ConstantUtility.FAIL, reason, null,
						apiClient.getResponseCode(), Boolean.TRUE);
			} catch (AssertionError e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_CAPTURE, ConstantUtility.ASSERTION_FAILED,
						columns[3], response.getId(), apiClient.getResponseCode(), Boolean.TRUE);
			}  catch (Exception e) {
				CsvUtility.writingToCsv(columns[0], ConstantUtility.REFUND_CAPTURE, ConstantUtility.FAIL,
						e.getMessage(), null, apiClient.getResponseCode(), Boolean.FALSE);
			}
		}
		csvReader.close();
		return response;

	}
}
