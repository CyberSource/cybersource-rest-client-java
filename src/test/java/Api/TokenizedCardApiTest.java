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

import Model.InlineResponse400;
import Model.InlineResponse403;
import Model.InlineResponse409;
import Model.InlineResponse410;
import Model.InlineResponse424;
import Model.InlineResponse500;
import Model.TokenizedcardRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokenizedCardApi
 */
@Ignore
public class TokenizedCardApiTest {

    private final TokenizedCardApi api = new TokenizedCardApi();

    
    /**
     * Delete a Tokenized Card
     *
     * |  |  |  | | --- | --- | --- | | The Network Token will attempt to be deleted from the card association and if successful the corresponding TMS Network Token will be deleted. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteTokenizedCardTest() throws Exception {
        String tokenizedCardId = null;
        String profileId = null;
        api.deleteTokenizedCard(tokenizedCardId, profileId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Tokenized Card
     *
     * |  |  |  | | --- | --- | --- | |**Tokenized Cards**&lt;br&gt;A Tokenized Card represents a network token. Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires.  
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTokenizedCardTest() throws Exception {
        String tokenizedCardId = null;
        String profileId = null;
        TokenizedcardRequest response = api.getTokenizedCard(tokenizedCardId, profileId);

        // TODO: test validations
    }
    
    /**
     * Create a Tokenized Card
     *
     * |  |  |  | | --- | --- | --- | |**Tokenized cards**&lt;br&gt;A Tokenized card represents a network token. Network tokens perform better than regular card numbers and they are not necessarily invalidated when a cardholder loses their card, or it expires. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postTokenizedCardTest() throws Exception {
        TokenizedcardRequest tokenizedcardRequest = null;
        String profileId = null;
        TokenizedcardRequest response = api.postTokenizedCard(tokenizedcardRequest, profileId);

        // TODO: test validations
    }
    
}
