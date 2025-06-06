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

import Model.CreateSubscriptionRequest1;
import Model.CreateSubscriptionResponse;
import Model.GetSubscriptionResponse1;
import Model.InlineResponse4005;
import Model.InlineResponse404;
import Model.PtsV2PaymentsPost502Response;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionsFollowOnsApi
 */
@Ignore
public class SubscriptionsFollowOnsApiTest {

    private final SubscriptionsFollowOnsApi api = new SubscriptionsFollowOnsApi();

    
    /**
     * Create a Follow-On Subscription
     *
     * Create a new Subscription based on the Request Id of an existing successful Transaction.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createFollowOnSubscriptionTest() throws Exception {
        String requestId = null;
        CreateSubscriptionRequest1 createSubscriptionRequest = null;
        CreateSubscriptionResponse response = api.createFollowOnSubscription(requestId, createSubscriptionRequest);

        // TODO: test validations
    }
    
    /**
     * Get a Follow-On Subscription
     *
     * Get details of the Subscription being created based on the Request Id of an existing successful Transaction. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFollowOnSubscriptionTest() throws Exception {
        String requestId = null;
        GetSubscriptionResponse1 response = api.getFollowOnSubscription(requestId);

        // TODO: test validations
    }
    
}
