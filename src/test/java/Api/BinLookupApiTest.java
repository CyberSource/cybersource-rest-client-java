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

import Model.CreateBinLookupRequest;
import Model.InlineResponse2012;
import Model.PtsV2CreateOrderPost400Response;
import Model.PtsV2PaymentsPost502Response;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BinLookupApi
 */
@Ignore
public class BinLookupApiTest {

    private final BinLookupApi api = new BinLookupApi();

    
    /**
     * BIN Lookup API
     *
     * The BIN Lookup Service is a versatile business tool that provides card network agnostic solution designed to ensure frictionless transaction experience by utilizing up-to-date Bank Identification Number (BIN) attributes sourced from multiple global and regional data sources. This service helps to improve authorization rates by helping to route transactions to the best-suited card network, minimizes fraud through card detail verification and aids in regulatory compliance by identifying card properties. The service is flexible and provides businesses with a flexible choice of inputs such as primary account number (PAN), network token from major networks (such as Visa, American Express, Discover and several regional networks) which includes device PAN (DPAN), and all types of tokens generated via CyberSource Token Management Service (TMS). Currently, the range of available credentials is contingent on the networks enabled for the business entity. Therefore, the network information specified in this documentation is illustrative and subject to personalized offerings for each reseller or merchant. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAccountInfoTest() throws Exception {
        CreateBinLookupRequest createBinLookupRequest = null;
        InlineResponse2012 response = api.getAccountInfo(createBinLookupRequest);

        // TODO: test validations
    }
    
}
