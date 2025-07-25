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

import Model.ActivateSubscriptionResponse;
import Model.CancelSubscriptionResponse;
import Model.CreateSubscriptionRequest;
import Model.CreateSubscriptionResponse;
import Model.GetAllSubscriptionsResponse;
import Model.GetSubscriptionCodeResponse;
import Model.GetSubscriptionResponse;
import Model.InlineResponse4003;
import Model.InlineResponse4004;
import Model.InlineResponse404;
import Model.PtsV2PaymentsPost502Response;
import Model.SuspendSubscriptionResponse;
import Model.UpdateSubscription;
import Model.UpdateSubscriptionResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionsApi
 */
@Ignore
public class SubscriptionsApiTest {

    private final SubscriptionsApi api = new SubscriptionsApi();

    
    /**
     * Activate a Subscription
     *
     * Activate a &#x60;SUSPENDED&#x60; Subscription 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void activateSubscriptionTest() throws Exception {
        String id = null;
        Boolean processSkippedPayments = null;
        ActivateSubscriptionResponse response = api.activateSubscription(id, processSkippedPayments);

        // TODO: test validations
    }
    
    /**
     * Cancel a Subscription
     *
     * Cancel a Subscription
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelSubscriptionTest() throws Exception {
        String id = null;
        CancelSubscriptionResponse response = api.cancelSubscription(id);

        // TODO: test validations
    }
    
    /**
     * Create a Subscription
     *
     * Create a Recurring Billing Subscription
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createSubscriptionTest() throws Exception {
        CreateSubscriptionRequest createSubscriptionRequest = null;
        CreateSubscriptionResponse response = api.createSubscription(createSubscriptionRequest);

        // TODO: test validations
    }
    
    /**
     * Get a List of Subscriptions
     *
     * Retrieve Subscriptions by Subscription Code &amp; Subscription Status. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAllSubscriptionsTest() throws Exception {
        Integer offset = null;
        Integer limit = null;
        String code = null;
        String status = null;
        GetAllSubscriptionsResponse response = api.getAllSubscriptions(offset, limit, code, status);

        // TODO: test validations
    }
    
    /**
     * Get a Subscription
     *
     * Get a Subscription by Subscription Id
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionTest() throws Exception {
        String id = null;
        GetSubscriptionResponse response = api.getSubscription(id);

        // TODO: test validations
    }
    
    /**
     * Get a Subscription Code
     *
     * Get a Unique Subscription Code
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionCodeTest() throws Exception {
        GetSubscriptionCodeResponse response = api.getSubscriptionCode();

        // TODO: test validations
    }
    
    /**
     * Suspend a Subscription
     *
     * Suspend a Subscription
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void suspendSubscriptionTest() throws Exception {
        String id = null;
        SuspendSubscriptionResponse response = api.suspendSubscription(id);

        // TODO: test validations
    }
    
    /**
     * Update a Subscription
     *
     * Update a Subscription by Subscription Id
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateSubscriptionTest() throws Exception {
        String id = null;
        UpdateSubscription updateSubscription = null;
        UpdateSubscriptionResponse response = api.updateSubscription(id, updateSubscription);

        // TODO: test validations
    }
    
}
