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

import Model.InlineResponse201;
import Model.PtsV2RetrievePaymentTokenGet400Response;
import Model.PtsV2RetrievePaymentTokenGet502Response;
import Model.Request;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentTokensApi
 */
@Ignore
public class PaymentTokensApiTest {

    private final PaymentTokensApi api = new PaymentTokensApi();

    
    /**
     * Retrieve or Delete Payment Token
     *
     * This API can be used in two flavours - for retrieval or deletion of vault id. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void retrieveOrDeletePaymentTokenTest() throws Exception {
        Request request = null;
        InlineResponse201 response = api.retrieveOrDeletePaymentToken(request);

        // TODO: test validations
    }
    
}
