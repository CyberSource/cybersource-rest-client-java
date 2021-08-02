package utilities.flex.models.transienttoken;

import java.util.Base64;

import com.google.gson.Gson;

public class TransientTokenUtility {
   
    /**
     * This is the method to extract transient token from given jwt token 
     * @param jwt
     * @return
     */
    public JwtResponseModel extractTransientToken(String jwt)
    {
        // split the jwt token into two parts 
        // bearer and token part
        String splitContents[] = jwt.split(" ");
        if(splitContents.length > 1)
        {
            // decode the base 64 encoded string
            String encodedString  = splitContents[1];
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
            String decodedString = new String(decodedBytes);
            Gson gson=new Gson();
            // Map decoded string to response model
            JwtResponseModel jwtResponseModel = gson.fromJson(decodedString,JwtResponseModel.class);
            // return JTI string 
            return jwtResponseModel;
        }
      
        return null;
    }
}
