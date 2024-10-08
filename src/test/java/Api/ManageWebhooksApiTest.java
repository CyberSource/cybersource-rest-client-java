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

import Model.InlineResponse2003;
import Model.InlineResponse2004;
import Model.InlineResponse2015;
import Model.InlineResponse4042;
import Model.SaveAsymEgressKey;
import Model.UpdateWebhookRequest;
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
        InlineResponse2004 response = api.getWebhookSubscriptionById(webhookId);

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
        List<InlineResponse2003> response = api.getWebhookSubscriptionsByOrg(organizationId, productId, eventType);

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
        InlineResponse2015 response = api.saveAsymEgressKey(vCSenderOrganizationId, vCPermissions, saveAsymEgressKey, vCCorrelationId);

        // TODO: test validations
    }
    
    /**
     * Update a Webhook Subscription
     *
     * Update the webhook subscription using PATCH.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateWebhookSubscriptionTest() throws Exception {
        String webhookId = null;
        UpdateWebhookRequest updateWebhookRequest = null;
        api.updateWebhookSubscription(webhookId, updateWebhookRequest);

        // TODO: test validations
    }
    
}
