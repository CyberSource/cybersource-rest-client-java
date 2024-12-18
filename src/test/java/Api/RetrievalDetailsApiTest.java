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
import Model.ReportingV3RetrievalDetailsGet200Response;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RetrievalDetailsApi
 */
@Ignore
public class RetrievalDetailsApiTest {

    private final RetrievalDetailsApi api = new RetrievalDetailsApi();

    
    /**
     * Get Retrieval Details
     *
     * Retrieval Detail Report Description
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRetrievalDetailsTest() throws Exception {
        DateTime startTime = null;
        DateTime endTime = null;
        String organizationId = null;
        ReportingV3RetrievalDetailsGet200Response response = api.getRetrievalDetails(startTime, endTime, organizationId);

        // TODO: test validations
    }
    
}
