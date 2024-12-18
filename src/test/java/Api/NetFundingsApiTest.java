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

import org.joda.time.DateTime;
import Model.ReportingV3NetFundingsGet200Response;
import Model.Reportingv3ReportDownloadsGet400Response;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NetFundingsApi
 */
@Ignore
public class NetFundingsApiTest {

    private final NetFundingsApi api = new NetFundingsApi();

    
    /**
     * Get Netfunding Information for an Account or a Merchant
     *
     * Get Netfunding information for an account or a merchant.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNetFundingDetailsTest() throws Exception {
        DateTime startTime = null;
        DateTime endTime = null;
        String organizationId = null;
        String groupName = null;
        ReportingV3NetFundingsGet200Response response = api.getNetFundingDetails(startTime, endTime, organizationId, groupName);

        // TODO: test validations
    }
    
}
