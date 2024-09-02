package sampleCodeJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import qascripts.flex.coreServices.GenerateKeyTest;
import qascripts.flex.coreServices.TokenizeCardTest;
import qascripts.flex.noEncryptionKeyGeneration.KeyGenerationNoEncTest;
import qascripts.payments.coreServices.CapturePaymentTest;
import qascripts.payments.coreServices.ProcessAuthorizationReversalTest;
import qascripts.payments.coreServices.ProcessCreditTest;
import qascripts.payments.coreServices.ProcessPaymentTest;
import qascripts.payments.coreServices.RefundCaptureTest;
import qascripts.payments.coreServices.RefundPaymentTest;
import qascripts.payments.coreServices.VoidCaptureTest;
import qascripts.payments.coreServices.VoidCreditTest;
import qascripts.payments.coreServices.VoidPaymentTest;
import qascripts.payments.coreServices.VoidRefundTest;
import qascripts.payouts.coreServices.ProcessPayoutTest;
import qascripts.reporting.coreServices.CreateAdhocReportTest;
import qascripts.reporting.coreServices.CreateReportSubscriptionForReportNameByOrganizationTest;
import qascripts.reporting.coreServices.DeleteSubscriptionOfReportNameByOrganizationTest;
import qascripts.reporting.coreServices.DownloadReportTest;
import qascripts.reporting.coreServices.GetAllSubscriptionsTest;
import qascripts.reporting.coreServices.GetNotificationOfChangesTest;
import qascripts.reporting.coreServices.GetPurchaseAndRefundDetailsTest;
import qascripts.reporting.coreServices.GetReportBasedOnReportidTest;
import qascripts.reporting.coreServices.GetReportDefinitionTest;
import qascripts.reporting.coreServices.GetReportingResourceInformationTest;
import qascripts.reporting.coreServices.GetSubscriptionForReportNameTest;
import qascripts.reporting.coreServices.RetrieveAvailableReportsTest;
import qascripts.secureFileShare.coreServices.DownloadFileWithFileIdentifierTest;
import qascripts.secureFileShare.coreServices.GetListOfFilesTest;
import qascripts.tms.coreServices.CreateInstrumentIdentifierTest;
import qascripts.tms.coreServices.CreatePaymentInstrumentTest;
import qascripts.tms.coreServices.DeleteInstrumentIdentifierTest;
import qascripts.tms.coreServices.DeletePaymentInstrumentTest;
import qascripts.tms.coreServices.RetrieveAllPaymentInstrumentsTest;
import qascripts.tms.coreServices.RetrieveInstrumentIdentifierTest;
import qascripts.tms.coreServices.RetrievePaymentInstrumentTest;
import qascripts.tms.coreServices.UpdateInstrumentIdentifierTest;
import qascripts.tms.coreServices.UpdatePaymentInstrumentTest;
import qascripts.transactionBatches.coreServices.GetIndividualBatchFileTest;
import qascripts.transactionBatches.coreServices.GetListOfBatchFilesTest;
import qascripts.transactionDetails.coreServices.RetrieveTransactionTest;
import qascripts.transactionSearch.coreServices.CreateSearchTest;
import qascripts.transactionSearch.coreServices.GetSearchResultsTest;
import qascripts.userManagement.coreServices.GetUserInformationTest;

/**
 * Samplecode
 */
public class SampleCode {

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			SelectMethod();
		} else if (args.length == 1) {
			RunMethod(args[0]);
			return;
		}
		System.out.println("");
		System.out.print("Press <Return> to finish ...");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int i = Integer.parseInt(br.readLine());
		} catch (Exception ex) {
		}

	}

	private static void SelectMethod() {
		System.out.println("Code Sample Names: ");
		System.out.println("");
		ShowMethods();
		System.out.println("");
		System.out.print("Type a sample name & then press <Return> : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			RunMethod(br.readLine());
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}

	private static void ShowMethods() {
		System.out.println("	AuthorizationOnly");
		System.out.println("	GetAPayment");

	}

	public static void RunMethod(String methodName) throws Exception {
		System.out.println(methodName  + " execution starts");
		switch (methodName) {
		case "ProcessPaymentTest":
			ProcessPaymentTest processPaymentTest = new ProcessPaymentTest();
			processPaymentTest.process();
			break;
		case "CapturePaymentTest":
			CapturePaymentTest capturePaymentTest = new CapturePaymentTest();
			capturePaymentTest.process();
			break;
		case "ProcessAuthorizationReversalTest":
			ProcessAuthorizationReversalTest processAuthorizationReversalTest = new ProcessAuthorizationReversalTest();
			processAuthorizationReversalTest.process();
			break;
		case "ProcessCreditTest":
			ProcessCreditTest processCreditTest = new ProcessCreditTest();
			processCreditTest.process();
			break;
		case "RefundPaymentTest":
			RefundPaymentTest refundPaymentTest = new RefundPaymentTest();
			refundPaymentTest.process();
			break;
		case "RefundCaptureTest":
			RefundCaptureTest refundCaptureTest = new RefundCaptureTest();
			refundCaptureTest.process();
			break;
		case "VoidPaymentTest":
			VoidPaymentTest voidPaymentTest = new VoidPaymentTest();
			voidPaymentTest.process();
			break;
		case "VoidCaptureTest":
			VoidCaptureTest voidCaptureTest = new VoidCaptureTest();
			voidCaptureTest.process();
			break;
		case "VoidCreditTest":
			VoidCreditTest voidCreditTest = new VoidCreditTest();
			voidCreditTest.process();
			break;
		case "VoidRefundTest":
			VoidRefundTest voidRefundTest = new VoidRefundTest();
			voidRefundTest.process();
			break;
		case "ProcessPayoutTest":
			ProcessPayoutTest processPayoutTest = new ProcessPayoutTest();
			processPayoutTest.process();
			break;
		case "CreateInstrumentIdentifierTest":
			CreateInstrumentIdentifierTest createInstrumentIdentifierTest = new CreateInstrumentIdentifierTest();
			createInstrumentIdentifierTest.process();
			break;
		case "CreatePaymentInstrumentTest":
			CreatePaymentInstrumentTest createPaymentInstrumentTest = new CreatePaymentInstrumentTest();
			createPaymentInstrumentTest.process();
			break;
		case "RetrieveInstrumentIdentifierTest":
			RetrieveInstrumentIdentifierTest retrieveInstrumentIdentifierTest = new RetrieveInstrumentIdentifierTest();
			retrieveInstrumentIdentifierTest.process();
			break;
		case "UpdateInstrumentIdentifierTest":
			UpdateInstrumentIdentifierTest updateInstrumentIdentifierTest = new UpdateInstrumentIdentifierTest();
			updateInstrumentIdentifierTest.process();
			break;
		case "DeleteInstrumentIdentifierTest":
			DeleteInstrumentIdentifierTest deleteInstrumentIdentifierTest = new DeleteInstrumentIdentifierTest();
			deleteInstrumentIdentifierTest.process();
			break;
		case "RetrievePaymentInstrumentTest":
			RetrievePaymentInstrumentTest retrievePaymentInstrumentTest = new RetrievePaymentInstrumentTest();
			retrievePaymentInstrumentTest.process();
			break;
		case "UpdatePaymentInstrumentTest":
			UpdatePaymentInstrumentTest updatePaymentInstrumentTest = new UpdatePaymentInstrumentTest();
			updatePaymentInstrumentTest.process();
			break;
		case "DeletePaymentInstrumentTest":
			DeletePaymentInstrumentTest deletePaymentInstrumentTest = new DeletePaymentInstrumentTest();
			deletePaymentInstrumentTest.process();
			break;
		case "RetrieveAllPaymentInstrumentsTest":
			RetrieveAllPaymentInstrumentsTest retrieveAllPaymentInstrumentsTest = new RetrieveAllPaymentInstrumentsTest();
			retrieveAllPaymentInstrumentsTest.process();
			break;
		case "GetIndividualBatchFileTest":
			GetIndividualBatchFileTest getIndividualBatchFileTest = new GetIndividualBatchFileTest();
			getIndividualBatchFileTest.process();
			break;
		case "GetListOfBatchFilesTest":
			GetListOfBatchFilesTest getListOfBatchFilesTest = new GetListOfBatchFilesTest();
			getListOfBatchFilesTest.process();
			break;
		case "RetrieveTransactionTest":
			RetrieveTransactionTest retrieveTransactionTest = new RetrieveTransactionTest();
			retrieveTransactionTest.process();
			break;
		case "CreateSearchTest":
			CreateSearchTest createSearchTest = new CreateSearchTest();
			createSearchTest.process();
			break;
		case "GetSearchResultsTest":
			GetSearchResultsTest getSearchResultsTest = new GetSearchResultsTest();
			getSearchResultsTest.process();
			break;
		case "GetUserInformationTest":
			GetUserInformationTest getUserInformationTest = new GetUserInformationTest();
			getUserInformationTest.process();
			break;
		case "GetListOfFilesTest":
			GetListOfFilesTest getListOfFilesTest = new GetListOfFilesTest();
			getListOfFilesTest.process();
			break;
		case "DownloadFileWithFileIdentifierTest":
			DownloadFileWithFileIdentifierTest downloadFileWithFileIdentifierTest = new DownloadFileWithFileIdentifierTest();
			downloadFileWithFileIdentifierTest.process();
			break;
		case "GenerateKeyTest":
			GenerateKeyTest generateKeyTest = new GenerateKeyTest();
			generateKeyTest.process();
			break;
		case "KeyGenerationNoEncTest":
			KeyGenerationNoEncTest keyGenerationNoEncTest = new KeyGenerationNoEncTest();
			keyGenerationNoEncTest.process();
			break;
		case "TokenizeCardTest":
			TokenizeCardTest tokenizeCardTest = new TokenizeCardTest();
			tokenizeCardTest.process();
			break;
		case "GetSubscriptionForReportNameTest":
			GetSubscriptionForReportNameTest getSubscriptionForReportNameTest = new GetSubscriptionForReportNameTest();
			getSubscriptionForReportNameTest.process();
			break;
		case "GetReportingResourceInformationTest":
			GetReportingResourceInformationTest getReportingResourceInformationTest = new GetReportingResourceInformationTest();
			getReportingResourceInformationTest.process();
			break;
		case "GetReportDefinitionTest":
			GetReportDefinitionTest getReportDefinitionTest = new GetReportDefinitionTest();
			getReportDefinitionTest.process();
			break;
		case "GetReportBasedOnReportidTest":
			GetReportBasedOnReportidTest getReportBasedOnReportidTest = new GetReportBasedOnReportidTest();
			getReportBasedOnReportidTest.process();
			break;
		case "GetAllSubscriptionsTest":
			GetAllSubscriptionsTest getAllSubscriptionsTest = new GetAllSubscriptionsTest();
			getAllSubscriptionsTest.process();
			break;
		case "CreateAdhocReportTest":
			CreateAdhocReportTest createAdhocReportTest = new CreateAdhocReportTest();
			createAdhocReportTest.process();
			break;
		case "CreateReportSubscriptionForReportNameByOrganizationTest":
			CreateReportSubscriptionForReportNameByOrganizationTest createReportSubscriptionForReportNameByOrganizationTest = new CreateReportSubscriptionForReportNameByOrganizationTest();
			createReportSubscriptionForReportNameByOrganizationTest.process();
			break;
		case "DeleteSubscriptionOfReportNameByOrganizationTest":
			DeleteSubscriptionOfReportNameByOrganizationTest deleteSubscriptionOfReportNameByOrganizationTest = new DeleteSubscriptionOfReportNameByOrganizationTest();
			deleteSubscriptionOfReportNameByOrganizationTest.process();
			break;
		case "DownloadReportTest":
			DownloadReportTest downloadReportTest = new DownloadReportTest();
			downloadReportTest.process();
			break;
		case "RetrieveAvailableReportsTest":
			RetrieveAvailableReportsTest retrieveAvailableReportsTest = new RetrieveAvailableReportsTest();
			retrieveAvailableReportsTest.process();
			break;
		case "GetNotificationOfChangesTest":
			GetNotificationOfChangesTest getNotificationOfChangesTest = new GetNotificationOfChangesTest();
			getNotificationOfChangesTest.process();
			break;
		case "GetPurchaseAndRefundDetailsTest":
			GetPurchaseAndRefundDetailsTest getPurchaseAndRefundDetailsTest = new GetPurchaseAndRefundDetailsTest();
			getPurchaseAndRefundDetailsTest.process();
			break;
		default:
			break;
		}
		System.out.println(methodName  + " execution end");
	}
}
