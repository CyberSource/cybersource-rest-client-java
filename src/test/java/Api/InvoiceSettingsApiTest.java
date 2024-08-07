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

import Model.InvoiceSettingsRequest;
import Model.InvoicingV2InvoiceSettingsGet200Response;
import Model.InvoicingV2InvoicesAllGet400Response;
import Model.InvoicingV2InvoicesAllGet502Response;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceSettingsApi
 */
@Ignore
public class InvoiceSettingsApiTest {

    private final InvoiceSettingsApi api = new InvoiceSettingsApi();

    
    /**
     * Get Invoice Settings
     *
     * Allows you to retrieve the invoice settings for the payment page.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInvoiceSettingsTest() throws Exception {
        InvoicingV2InvoiceSettingsGet200Response response = api.getInvoiceSettings();

        // TODO: test validations
    }
    
    /**
     * Update Invoice Settings
     *
     * Allows you to customize the payment page, the checkout experience, email communication and payer authentication. You can customize the invoice to match your brand with your business name, logo and brand colors, and a VAT Tax number. You can choose to capture the payers shipping details, phone number and email during the checkout process. You can add a custom message to all invoice emails and enable or disable payer authentication for invoice payments.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateInvoiceSettingsTest() throws Exception {
        InvoiceSettingsRequest invoiceSettingsRequest = null;
        InvoicingV2InvoiceSettingsGet200Response response = api.updateInvoiceSettings(invoiceSettingsRequest);

        // TODO: test validations
    }
    
}
