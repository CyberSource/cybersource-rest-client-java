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

import Model.InlineResponse2004;
import Model.InlineResponse2015;
import Model.InlineResponse2016;
import Model.InlineResponse2017;
import Model.InlineResponse4042;
import Model.SaveAsymEgressKey;
import Model.UpdateStatus;
import Model.UpdateWebhook;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ManageWebhooksApi
 */
@Ignore
public class ManageWebhooksApiTest {

    private final ManageWebhooksApi api = new ManageWebhooksApi();

    
    /**
     * Delete a Webhook Subscription
     *
     * Delete the webhook. Please note that deleting a particular webhook does not delete the history of the webhook notifications.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteWebhookSubscriptionTest() throws Exception {
        String webhookId = null;
        api.deleteWebhookSubscription(webhookId);

        // TODO: test validations
    }
    
    /**
     * Get Details On a Single Webhook
     *
     * Retrieve the details of a specific webhook by supplying the webhook ID in the path.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWebhookSubscriptionByIdTest() throws Exception {
        String webhookId = null;
        InlineResponse2015 response = api.getWebhookSubscriptionById(webhookId);

        // TODO: test validations
    }
    
    /**
     * Get Details On All Created Webhooks
     *
     * Retrieve a list of all previously created webhooks.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getWebhookSubscriptionsByOrgTest() throws Exception {
        String organizationId = null;
        String productId = null;
        String eventType = null;
        List<InlineResponse2004> response = api.getWebhookSubscriptionsByOrg(organizationId, productId, eventType);

        // TODO: test validations
    }
    
    /**
     * Test a Webhook Configuration
     *
     * Test the webhook configuration by sending a sample webhook. Calling this endpoint sends a sample webhook to the endpoint identified in the user&#39;s subscription.   It will contain sample values for the product &amp; eventType based on values present in your subscription along with a sample message in the payload.   Based on the webhook response users can make any necessary modifications or rest assured knowing their setup is configured correctly. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notificationSubscriptionsV1WebhooksWebhookIdPostTest() throws Exception {
        String webhookId = null;
        InlineResponse2016 response = api.notificationSubscriptionsV1WebhooksWebhookIdPost(webhookId);

        // TODO: test validations
    }
    
    /**
     * Update a Webhook Subscription
     *
     * Update a Webhook Subscription.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notificationSubscriptionsV2WebhooksWebhookIdPatchTest() throws Exception {
        String webhookId = null;
        UpdateWebhook updateWebhook = null;
        api.notificationSubscriptionsV2WebhooksWebhookIdPatch(webhookId, updateWebhook);

        // TODO: test validations
    }
    
    /**
     * Update a Webhook Status
     *
     * Users can update the status of a webhook subscription by calling this endpoint.   The webhookId parameter in the URL path identifies the specific webhook subscription to be updated. The request body accepts the values ACTIVE or INACTIVE. If the subscription is set to INACTIVE, webhooks will not be delivered until the subscription is activated again. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void notificationSubscriptionsV2WebhooksWebhookIdStatusPutTest() throws Exception {
        String webhookId = null;
        UpdateStatus updateStatus = null;
        api.notificationSubscriptionsV2WebhooksWebhookIdStatusPut(webhookId, updateStatus);

        // TODO: test validations
    }
    
    /**
     * Message Level Encryption
     *
     * Store and manage certificates that will be used to preform Message Level Encryption (MLE). Each new webhook will need its own unique asymmetric certificate. You can either use a digital certificate issued/signed by a CA or self-sign your own using the documentation available on the Developer Guide. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void saveAsymEgressKeyTest() throws Exception {
        String vCSenderOrganizationId = null;
        String vCPermissions = null;
        SaveAsymEgressKey saveAsymEgressKey = null;
        String vCCorrelationId = null;
        InlineResponse2017 response = api.saveAsymEgressKey(vCSenderOrganizationId, vCPermissions, saveAsymEgressKey, vCCorrelationId);

        // TODO: test validations
    }
    
}
