package utilities.tracking;

import org.apache.commons.lang3.ObjectUtils;

import Model.*;

public class SdkTracker {
    public Object insertDeveloperIdTracker(Object requestObj, String requestClass, String runEnvironment, String merchantConfigDeveloperId) {
        String developerIdValue;
        if (runEnvironment.contains("apitest.cybersource.com")) {
            developerIdValue = "GJ5IEJBY";
        }
        else {
            developerIdValue = "SBBARODQ";
        }
        
        if(!ObjectUtils.isEmpty(merchantConfigDeveloperId)) {
        	developerIdValue= merchantConfigDeveloperId;
        }

        switch (requestClass)
        {
            case "CapturePaymentRequest":
                CapturePaymentRequest capturePaymentRequest = (CapturePaymentRequest)requestObj;

                if (capturePaymentRequest.getClientReferenceInformation() == null)
                {
                    capturePaymentRequest.setClientReferenceInformation(new Ptsv2paymentsClientReferenceInformation());
                }

                if (capturePaymentRequest.getClientReferenceInformation().getPartner() == null)
                {
                    capturePaymentRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsClientReferenceInformationPartner());
                }

                if (capturePaymentRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    capturePaymentRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return capturePaymentRequest;
            case "CreateCreditRequest":
                CreateCreditRequest createCreditRequest = (CreateCreditRequest)requestObj;

                if (createCreditRequest.getClientReferenceInformation() == null)
                {
                    createCreditRequest.setClientReferenceInformation(new Ptsv2paymentsClientReferenceInformation());
                }

                if (createCreditRequest.getClientReferenceInformation().getPartner() == null)
                {
                    createCreditRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsClientReferenceInformationPartner());
                }

                if (createCreditRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    createCreditRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return createCreditRequest;
            case "AddNegativeListRequest":
                AddNegativeListRequest addNegativeListRequest = (AddNegativeListRequest)requestObj;

                if (addNegativeListRequest.getClientReferenceInformation() == null)
                {
                    addNegativeListRequest.setClientReferenceInformation(new Riskv1liststypeentriesClientReferenceInformation());
                }

                if (addNegativeListRequest.getClientReferenceInformation().getPartner() == null)
                {
                    addNegativeListRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (addNegativeListRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    addNegativeListRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return addNegativeListRequest;
            case "CreateBundledDecisionManagerCaseRequest":
                CreateBundledDecisionManagerCaseRequest createBundledDecisionManagerCaseRequest = (CreateBundledDecisionManagerCaseRequest)requestObj;

                if (createBundledDecisionManagerCaseRequest.getClientReferenceInformation() == null)
                {
                    createBundledDecisionManagerCaseRequest.setClientReferenceInformation(new Riskv1decisionsClientReferenceInformation());
                }

                if (createBundledDecisionManagerCaseRequest.getClientReferenceInformation().getPartner() == null)
                {
                    createBundledDecisionManagerCaseRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (createBundledDecisionManagerCaseRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    createBundledDecisionManagerCaseRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return createBundledDecisionManagerCaseRequest;
            case "FraudMarkingActionRequest":
                FraudMarkingActionRequest fraudMarkingActionRequest = (FraudMarkingActionRequest)requestObj;

                if (fraudMarkingActionRequest.getClientReferenceInformation() == null)
                {
                    fraudMarkingActionRequest.setClientReferenceInformation(new Riskv1liststypeentriesClientReferenceInformation());
                }

                if (fraudMarkingActionRequest.getClientReferenceInformation().getPartner() == null)
                {
                    fraudMarkingActionRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (fraudMarkingActionRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    fraudMarkingActionRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return fraudMarkingActionRequest;
            case "CheckPayerAuthEnrollmentRequest":
                CheckPayerAuthEnrollmentRequest checkPayerAuthEnrollmentRequest = (CheckPayerAuthEnrollmentRequest)requestObj;

                if (checkPayerAuthEnrollmentRequest.getClientReferenceInformation() == null)
                {
                    checkPayerAuthEnrollmentRequest.setClientReferenceInformation(new Riskv1authenticationsetupsClientReferenceInformation());
                }

                if (checkPayerAuthEnrollmentRequest.getClientReferenceInformation().getPartner() == null)
                {
                    checkPayerAuthEnrollmentRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (checkPayerAuthEnrollmentRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    checkPayerAuthEnrollmentRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return checkPayerAuthEnrollmentRequest;
            case "PayerAuthSetupRequest":
                PayerAuthSetupRequest payerAuthSetupRequest = (PayerAuthSetupRequest)requestObj;

                if (payerAuthSetupRequest.getClientReferenceInformation() == null)
                {
                    payerAuthSetupRequest.setClientReferenceInformation(new Riskv1authenticationsetupsClientReferenceInformation());
                }

                if (payerAuthSetupRequest.getClientReferenceInformation().getPartner() == null)
                {
                    payerAuthSetupRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (payerAuthSetupRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    payerAuthSetupRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return payerAuthSetupRequest;
            case "ValidateRequest":
                ValidateRequest validateRequest = (ValidateRequest)requestObj;

                if (validateRequest.getClientReferenceInformation() == null)
                {
                    validateRequest.setClientReferenceInformation(new Riskv1authenticationsetupsClientReferenceInformation());
                }

                if (validateRequest.getClientReferenceInformation().getPartner() == null)
                {
                    validateRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (validateRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    validateRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return validateRequest;
            case "CreatePaymentRequest":
                CreatePaymentRequest createPaymentRequest = (CreatePaymentRequest)requestObj;

                if (createPaymentRequest.getClientReferenceInformation() == null)
                {
                    createPaymentRequest.setClientReferenceInformation(new Ptsv2paymentsClientReferenceInformation());
                }

                if (createPaymentRequest.getClientReferenceInformation().getPartner() == null)
                {
                    createPaymentRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsClientReferenceInformationPartner());
                }

                if (createPaymentRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    createPaymentRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return createPaymentRequest;
            case "IncrementAuthRequest":
                IncrementAuthRequest incrementAuthRequest = (IncrementAuthRequest)requestObj;

                if (incrementAuthRequest.getClientReferenceInformation() == null)
                {
                    incrementAuthRequest.setClientReferenceInformation(new Ptsv2paymentsidClientReferenceInformation());
                }

                if (incrementAuthRequest.getClientReferenceInformation().getPartner() == null)
                {
                    incrementAuthRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsidClientReferenceInformationPartner());
                }

                if (incrementAuthRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    incrementAuthRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return incrementAuthRequest;
            case "CreatePlanRequest":
                CreatePlanRequest createPlanRequest = (CreatePlanRequest)requestObj;

                if (createPlanRequest.getClientReferenceInformation() == null)
                {
                    createPlanRequest.setClientReferenceInformation(new Rbsv1plansClientReferenceInformation());
                }

                if (createPlanRequest.getClientReferenceInformation().getPartner() == null)
                {
                    createPlanRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (createPlanRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    createPlanRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return createPlanRequest;
            case "RefundCaptureRequest":
                RefundCaptureRequest refundCaptureRequest = (RefundCaptureRequest)requestObj;

                if (refundCaptureRequest.getClientReferenceInformation() == null)
                {
                    refundCaptureRequest.setClientReferenceInformation(new Ptsv2paymentsidrefundsClientReferenceInformation());
                }

                if (refundCaptureRequest.getClientReferenceInformation().getPartner() == null)
                {
                    refundCaptureRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsClientReferenceInformationPartner());
                }

                if (refundCaptureRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    refundCaptureRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return refundCaptureRequest;
            case "RefundPaymentRequest":
                RefundPaymentRequest refundPaymentRequest = (RefundPaymentRequest)requestObj;

                if (refundPaymentRequest.getClientReferenceInformation() == null)
                {
                    refundPaymentRequest.setClientReferenceInformation(new Ptsv2paymentsidrefundsClientReferenceInformation());
                }

                if (refundPaymentRequest.getClientReferenceInformation().getPartner() == null)
                {
                    refundPaymentRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsClientReferenceInformationPartner());
                }

                if (refundPaymentRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    refundPaymentRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return refundPaymentRequest;
            case "AuthReversalRequest":
                AuthReversalRequest authReversalRequest = (AuthReversalRequest)requestObj;

                if (authReversalRequest.getClientReferenceInformation() == null)
                {
                    authReversalRequest.setClientReferenceInformation(new Ptsv2paymentsidreversalsClientReferenceInformation());
                }

                if (authReversalRequest.getClientReferenceInformation().getPartner() == null)
                {
                    authReversalRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsidreversalsClientReferenceInformationPartner());
                }

                if (authReversalRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    authReversalRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return authReversalRequest;
            case "MitReversalRequest":
                MitReversalRequest mitReversalRequest = (MitReversalRequest)requestObj;

                if (mitReversalRequest.getClientReferenceInformation() == null)
                {
                    mitReversalRequest.setClientReferenceInformation(new Ptsv2paymentsClientReferenceInformation());
                }

                if (mitReversalRequest.getClientReferenceInformation().getPartner() == null)
                {
                    mitReversalRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsClientReferenceInformationPartner());
                }

                if (mitReversalRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    mitReversalRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return mitReversalRequest;
            case "CreateSubscriptionRequest":
                CreateSubscriptionRequest createSubscriptionRequest = (CreateSubscriptionRequest)requestObj;

                if (createSubscriptionRequest.getClientReferenceInformation() == null)
                {
                    createSubscriptionRequest.setClientReferenceInformation(new Rbsv1subscriptionsClientReferenceInformation());
                }

                if (createSubscriptionRequest.getClientReferenceInformation().getPartner() == null)
                {
                    createSubscriptionRequest.getClientReferenceInformation().setPartner(new Rbsv1subscriptionsClientReferenceInformationPartner());
                }

                if (createSubscriptionRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    createSubscriptionRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return createSubscriptionRequest;
            case "UpdateSubscription":
                UpdateSubscription updateSubscription = (UpdateSubscription)requestObj;

                if (updateSubscription.getClientReferenceInformation() == null)
                {
                    updateSubscription.setClientReferenceInformation(new Rbsv1subscriptionsClientReferenceInformation());
                }

                if (updateSubscription.getClientReferenceInformation().getPartner() == null)
                {
                    updateSubscription.getClientReferenceInformation().setPartner(new Rbsv1subscriptionsClientReferenceInformationPartner());
                }

                if (updateSubscription.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    updateSubscription.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return updateSubscription;
            case "TaxRequest":
                TaxRequest taxRequest = (TaxRequest)requestObj;

                if (taxRequest.getClientReferenceInformation() == null)
                {
                    taxRequest.setClientReferenceInformation(new Vasv2taxClientReferenceInformation());
                }

                if (taxRequest.getClientReferenceInformation().getPartner() == null)
                {
                    taxRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (taxRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    taxRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return taxRequest;
            case "VoidTaxRequest":
                VoidTaxRequest voidTaxRequest = (VoidTaxRequest)requestObj;

                if (voidTaxRequest.getClientReferenceInformation() == null)
                {
                    voidTaxRequest.setClientReferenceInformation(new Vasv2taxidClientReferenceInformation());
                }

                if (voidTaxRequest.getClientReferenceInformation().getPartner() == null)
                {
                    voidTaxRequest.getClientReferenceInformation().setPartner(new Vasv2taxidClientReferenceInformationPartner());
                }

                if (voidTaxRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    voidTaxRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return voidTaxRequest;
            case "ValidateExportComplianceRequest":
                ValidateExportComplianceRequest validateExportComplianceRequest = (ValidateExportComplianceRequest)requestObj;

                if (validateExportComplianceRequest.getClientReferenceInformation() == null)
                {
                    validateExportComplianceRequest.setClientReferenceInformation(new Riskv1liststypeentriesClientReferenceInformation());
                }

                if (validateExportComplianceRequest.getClientReferenceInformation().getPartner() == null)
                {
                    validateExportComplianceRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (validateExportComplianceRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    validateExportComplianceRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return validateExportComplianceRequest;
            case "VerifyCustomerAddressRequest":
                VerifyCustomerAddressRequest verifyCustomerAddressRequest = (VerifyCustomerAddressRequest)requestObj;

                if (verifyCustomerAddressRequest.getClientReferenceInformation() == null)
                {
                    verifyCustomerAddressRequest.setClientReferenceInformation(new Riskv1liststypeentriesClientReferenceInformation());
                }

                if (verifyCustomerAddressRequest.getClientReferenceInformation().getPartner() == null)
                {
                    verifyCustomerAddressRequest.getClientReferenceInformation().setPartner(new Riskv1decisionsClientReferenceInformationPartner());
                }

                if (verifyCustomerAddressRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    verifyCustomerAddressRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return verifyCustomerAddressRequest;
            case "MitVoidRequest":
                MitVoidRequest mitVoidRequest = (MitVoidRequest)requestObj;

                if (mitVoidRequest.getClientReferenceInformation() == null)
                {
                    mitVoidRequest.setClientReferenceInformation(new Ptsv2paymentsClientReferenceInformation());
                }

                if (mitVoidRequest.getClientReferenceInformation().getPartner() == null)
                {
                    mitVoidRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsClientReferenceInformationPartner());
                }

                if (mitVoidRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    mitVoidRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return mitVoidRequest;
            case "VoidCaptureRequest":
                VoidCaptureRequest voidCaptureRequest = (VoidCaptureRequest)requestObj;

                if (voidCaptureRequest.getClientReferenceInformation() == null)
                {
                    voidCaptureRequest.setClientReferenceInformation(new Ptsv2paymentsidreversalsClientReferenceInformation());
                }

                if (voidCaptureRequest.getClientReferenceInformation().getPartner() == null)
                {
                    voidCaptureRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsidreversalsClientReferenceInformationPartner());
                }

                if (voidCaptureRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    voidCaptureRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return voidCaptureRequest;
            case "VoidCreditRequest":
                VoidCreditRequest voidCreditRequest = (VoidCreditRequest)requestObj;

                if (voidCreditRequest.getClientReferenceInformation() == null)
                {
                    voidCreditRequest.setClientReferenceInformation(new Ptsv2paymentsidreversalsClientReferenceInformation());
                }

                if (voidCreditRequest.getClientReferenceInformation().getPartner() == null)
                {
                    voidCreditRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsidreversalsClientReferenceInformationPartner());
                }

                if (voidCreditRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    voidCreditRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return voidCreditRequest;
            case "VoidPaymentRequest":
                VoidPaymentRequest voidPaymentRequest = (VoidPaymentRequest)requestObj;

                if (voidPaymentRequest.getClientReferenceInformation() == null)
                {
                    voidPaymentRequest.setClientReferenceInformation(new Ptsv2paymentsidreversalsClientReferenceInformation());
                }

                if (voidPaymentRequest.getClientReferenceInformation().getPartner() == null)
                {
                    voidPaymentRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsidreversalsClientReferenceInformationPartner());
                }

                if (voidPaymentRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    voidPaymentRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return voidPaymentRequest;
            case "VoidRefundRequest":
                VoidRefundRequest voidRefundRequest = (VoidRefundRequest)requestObj;

                if (voidRefundRequest.getClientReferenceInformation() == null)
                {
                    voidRefundRequest.setClientReferenceInformation(new Ptsv2paymentsidreversalsClientReferenceInformation());
                }

                if (voidRefundRequest.getClientReferenceInformation().getPartner() == null)
                {
                    voidRefundRequest.getClientReferenceInformation().setPartner(new Ptsv2paymentsidreversalsClientReferenceInformationPartner());
                }

                if (voidRefundRequest.getClientReferenceInformation().getPartner().getDeveloperId() == null)
                {
                    voidRefundRequest.getClientReferenceInformation().getPartner().setDeveloperId(developerIdValue);
                }

                return voidRefundRequest;
            default:
                return requestObj;
        }
    }
}
