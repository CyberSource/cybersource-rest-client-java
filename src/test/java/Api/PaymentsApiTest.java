/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Model.CreatePaymentRequest;
import Model.CreateSessionReq;
import Model.CreateSessionRequest;
import Model.IncrementAuthRequest;
import Model.OrderPaymentRequest;
import Model.PtsV2IncrementalAuthorizationPatch201Response;
import Model.PtsV2IncrementalAuthorizationPatch400Response;
import Model.PtsV2PaymentsOrderPost201Response;
import Model.PtsV2PaymentsPost201Response;
import Model.PtsV2PaymentsPost201Response1;
import Model.PtsV2PaymentsPost201Response2;
import Model.PtsV2PaymentsPost400Response;
import Model.PtsV2PaymentsPost502Response;
import Model.RefreshPaymentStatusRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsApi
 */
@Ignore
public class PaymentsApiTest {

    private final PaymentsApi api = new PaymentsApi();

    
    /**
     * Create a Payment Order Request
     *
     * Create a Payment Order Request
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOrderRequestTest() throws Exception {
        OrderPaymentRequest orderPaymentRequest = null;
        String id = null;
        PtsV2PaymentsOrderPost201Response response = api.createOrderRequest(orderPaymentRequest, id);

        // TODO: test validations
    }
    
    /**
     * Process a Payment
     *
     * A payment authorizes the amount for the transaction. There are a number of supported payment features, such as E-commerce and Card Present - Credit Card/Debit Card, Echeck, e-Wallets, Level II/III Data, etc..  A payment response includes the status of the request. It also includes processor-specific information when the request is successful and errors if unsuccessful. See the [Payments Developer Guides Page](https://developer.cybersource.com/docs/cybs/en-us/payments/developer/ctv/rest/payments/payments-intro.html).  Authorization can be requested with Capture, Decision Manager, Payer Authentication(3ds), and Token Creation. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPaymentTest() throws Exception {
        CreatePaymentRequest createPaymentRequest = null;
        PtsV2PaymentsPost201Response response = api.createPayment(createPaymentRequest);

        // TODO: test validations
    }
    
    /**
     * Create Alternative Payments Sessions Request
     *
     * Create Alternative Payments Sessions Request
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createSessionRequestTest() throws Exception {
        CreateSessionReq createSessionReq = null;
        PtsV2PaymentsPost201Response2 response = api.createSessionRequest(createSessionReq);

        // TODO: test validations
    }
    
    /**
     * Increment an Authorization
     *
     * Use this service to authorize additional charges in a lodging or autorental transaction. Include the ID returned from the original authorization in the PATCH request to add additional charges to that authorization. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void incrementAuthTest() throws Exception {
        String id = null;
        IncrementAuthRequest incrementAuthRequest = null;
        PtsV2IncrementalAuthorizationPatch201Response response = api.incrementAuth(id, incrementAuthRequest);

        // TODO: test validations
    }
    
    /**
     * Check a Payment Status
     *
     * Checks and updates the payment status 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void refreshPaymentStatusTest() throws Exception {
        String id = null;
        RefreshPaymentStatusRequest refreshPaymentStatusRequest = null;
        PtsV2PaymentsPost201Response1 response = api.refreshPaymentStatus(id, refreshPaymentStatusRequest);

        // TODO: test validations
    }
    
    /**
     * Update Alternative Payments Sessions Request
     *
     * Update Alternative Payments Sessions Request
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateSessionReqTest() throws Exception {
        CreateSessionRequest createSessionRequest = null;
        String id = null;
        PtsV2PaymentsPost201Response2 response = api.updateSessionReq(createSessionRequest, id);

        // TODO: test validations
    }
    
}
