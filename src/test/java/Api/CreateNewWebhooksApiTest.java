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

import Model.InlineResponse2013;
import Model.SaveSymEgressKey;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CreateNewWebhooksApi
 */
@Ignore
public class CreateNewWebhooksApiTest {

    private final CreateNewWebhooksApi api = new CreateNewWebhooksApi();

    
    /**
     * Create Webhook Security Keys
     *
     * Create security keys that CyberSource will use internally to connect to your servers and validate messages using a digital signature.  Select the CREATE example for CyberSource to generate the key on our server and maintain it for you as well. Remember to save the key in the API response, so that you can use it to validate messages later. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void saveSymEgressKeyTest() throws Exception {
        String vCSenderOrganizationId = null;
        String vCPermissions = null;
        String vCCorrelationId = null;
        SaveSymEgressKey saveSymEgressKey = null;
        InlineResponse2013 response = api.saveSymEgressKey(vCSenderOrganizationId, vCPermissions, vCCorrelationId, saveSymEgressKey);

        // TODO: test validations
    }
    
}
