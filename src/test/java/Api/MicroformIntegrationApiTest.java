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

import Model.GenerateCaptureContextRequest;
import Model.InlineResponseDefault;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MicroformIntegrationApi
 */
@Ignore
public class MicroformIntegrationApiTest {

    private final MicroformIntegrationApi api = new MicroformIntegrationApi();

    
    /**
     * Generate Capture Context
     *
     * This API is used to generate the Capture Context data structure for the Microform Integration.  Microform is a browser-based acceptance solution that allows a seller to capture payment information is a secure manner from their website.  For more information about Flex Microform transactions, see the [Flex Developer Guides Page](https://developer.cybersource.com/api/developer-guides/dita-flex/SAFlexibleToken.html). For examples on how to integrate Flex Microform within your webpage please see our [GitHub Flex Samples](https://github.com/CyberSource?q&#x3D;flex&amp;type&#x3D;&amp;language&#x3D;) This API is a server-to-server API to generate the capture context that can be used to initiate instance of microform on a acceptance page.  The capture context is a digitally signed JWT that provides authentication, one-time keys, and the target origin to the Microform Integration application.  The availability of API features for a merchant may depend on the portfolio configuration and may need to be enabled at the portfolio level before they can be added to merchant accounts.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateCaptureContextTest() throws Exception {
        GenerateCaptureContextRequest generateCaptureContextRequest = null;
        String response = api.generateCaptureContext(generateCaptureContextRequest);

        // TODO: test validations
    }
    
}
