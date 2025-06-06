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


package Model;

import java.util.Objects;
import java.util.Arrays;
import Model.InvoicingV2InvoicesAllGet200ResponseLinks;
import Model.InvoicingV2InvoicesGet200ResponseInvoiceHistory;
import Model.InvoicingV2InvoicesPost201ResponseInvoiceInformation;
import Model.InvoicingV2InvoicesPost201ResponseOrderInformation;
import Model.Invoicingv2invoicesCustomerInformation;
import Model.Invoicingv2invoicesProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InvoicingV2InvoicesGet200Response
 */

public class InvoicingV2InvoicesGet200Response {
  @SerializedName("_links")
  private InvoicingV2InvoicesAllGet200ResponseLinks links = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("submitTimeUtc")
  private String submitTimeUtc = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("customerInformation")
  private Invoicingv2invoicesCustomerInformation customerInformation = null;

  @SerializedName("processingInformation")
  private Invoicingv2invoicesProcessingInformation processingInformation = null;

  @SerializedName("invoiceInformation")
  private InvoicingV2InvoicesPost201ResponseInvoiceInformation invoiceInformation = null;

  @SerializedName("orderInformation")
  private InvoicingV2InvoicesPost201ResponseOrderInformation orderInformation = null;

  @SerializedName("invoiceHistory")
  private List<InvoicingV2InvoicesGet200ResponseInvoiceHistory> invoiceHistory = null;

  public InvoicingV2InvoicesGet200Response links(InvoicingV2InvoicesAllGet200ResponseLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesAllGet200ResponseLinks getLinks() {
    return links;
  }

  public void setLinks(InvoicingV2InvoicesAllGet200ResponseLinks links) {
    this.links = links;
  }

  public InvoicingV2InvoicesGet200Response id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. 
   * @return id
  **/
  @ApiModelProperty(value = "An unique identification number generated by Cybersource to identify the submitted request. Returned by all services. It is also appended to the endpoint of the resource. On incremental authorizations, this value with be the same as the identification number returned in the original authorization response. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InvoicingV2InvoicesGet200Response submitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
    return this;
  }

   /**
   * Time of request in UTC. Format: &#x60;YYYY-MM-DDThh:mm:ssZ&#x60; **Example** &#x60;2016-08-11T22:47:57Z&#x60; equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The &#x60;T&#x60; separates the date and the time. The &#x60;Z&#x60; indicates UTC.  Returned by Cybersource for all services. 
   * @return submitTimeUtc
  **/
  @ApiModelProperty(value = "Time of request in UTC. Format: `YYYY-MM-DDThh:mm:ssZ` **Example** `2016-08-11T22:47:57Z` equals August 11, 2016, at 22:47:57 (10:47:57 p.m.). The `T` separates the date and the time. The `Z` indicates UTC.  Returned by Cybersource for all services. ")
  public String getSubmitTimeUtc() {
    return submitTimeUtc;
  }

  public void setSubmitTimeUtc(String submitTimeUtc) {
    this.submitTimeUtc = submitTimeUtc;
  }

  public InvoicingV2InvoicesGet200Response status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the invoice.  Possible values: - DRAFT - CREATED - SENT - PARTIAL - PAID - CANCELED - PENDING 
   * @return status
  **/
  @ApiModelProperty(value = "The status of the invoice.  Possible values: - DRAFT - CREATED - SENT - PARTIAL - PAID - CANCELED - PENDING ")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InvoicingV2InvoicesGet200Response customerInformation(Invoicingv2invoicesCustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
    return this;
  }

   /**
   * Get customerInformation
   * @return customerInformation
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesCustomerInformation getCustomerInformation() {
    return customerInformation;
  }

  public void setCustomerInformation(Invoicingv2invoicesCustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
  }

  public InvoicingV2InvoicesGet200Response processingInformation(Invoicingv2invoicesProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public Invoicingv2invoicesProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(Invoicingv2invoicesProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public InvoicingV2InvoicesGet200Response invoiceInformation(InvoicingV2InvoicesPost201ResponseInvoiceInformation invoiceInformation) {
    this.invoiceInformation = invoiceInformation;
    return this;
  }

   /**
   * Get invoiceInformation
   * @return invoiceInformation
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesPost201ResponseInvoiceInformation getInvoiceInformation() {
    return invoiceInformation;
  }

  public void setInvoiceInformation(InvoicingV2InvoicesPost201ResponseInvoiceInformation invoiceInformation) {
    this.invoiceInformation = invoiceInformation;
  }

  public InvoicingV2InvoicesGet200Response orderInformation(InvoicingV2InvoicesPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public InvoicingV2InvoicesPost201ResponseOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(InvoicingV2InvoicesPost201ResponseOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public InvoicingV2InvoicesGet200Response invoiceHistory(List<InvoicingV2InvoicesGet200ResponseInvoiceHistory> invoiceHistory) {
    this.invoiceHistory = invoiceHistory;
    return this;
  }

  public InvoicingV2InvoicesGet200Response addInvoiceHistoryItem(InvoicingV2InvoicesGet200ResponseInvoiceHistory invoiceHistoryItem) {
    if (this.invoiceHistory == null) {
      this.invoiceHistory = new ArrayList<InvoicingV2InvoicesGet200ResponseInvoiceHistory>();
    }
    this.invoiceHistory.add(invoiceHistoryItem);
    return this;
  }

   /**
   * Get invoiceHistory
   * @return invoiceHistory
  **/
  @ApiModelProperty(value = "")
  public List<InvoicingV2InvoicesGet200ResponseInvoiceHistory> getInvoiceHistory() {
    return invoiceHistory;
  }

  public void setInvoiceHistory(List<InvoicingV2InvoicesGet200ResponseInvoiceHistory> invoiceHistory) {
    this.invoiceHistory = invoiceHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicingV2InvoicesGet200Response invoicingV2InvoicesGet200Response = (InvoicingV2InvoicesGet200Response) o;
    return Objects.equals(this.links, invoicingV2InvoicesGet200Response.links) &&
        Objects.equals(this.id, invoicingV2InvoicesGet200Response.id) &&
        Objects.equals(this.submitTimeUtc, invoicingV2InvoicesGet200Response.submitTimeUtc) &&
        Objects.equals(this.status, invoicingV2InvoicesGet200Response.status) &&
        Objects.equals(this.customerInformation, invoicingV2InvoicesGet200Response.customerInformation) &&
        Objects.equals(this.processingInformation, invoicingV2InvoicesGet200Response.processingInformation) &&
        Objects.equals(this.invoiceInformation, invoicingV2InvoicesGet200Response.invoiceInformation) &&
        Objects.equals(this.orderInformation, invoicingV2InvoicesGet200Response.orderInformation) &&
        Objects.equals(this.invoiceHistory, invoicingV2InvoicesGet200Response.invoiceHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, submitTimeUtc, status, customerInformation, processingInformation, invoiceInformation, orderInformation, invoiceHistory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicingV2InvoicesGet200Response {\n");
    
    if (links != null) sb.append("    links: ").append(toIndentedString(links)).append("\n");
    if (id != null) sb.append("    id: ").append(toIndentedString(id)).append("\n");
    if (submitTimeUtc != null) sb.append("    submitTimeUtc: ").append(toIndentedString(submitTimeUtc)).append("\n");
    if (status != null) sb.append("    status: ").append(toIndentedString(status)).append("\n");
    if (customerInformation != null) sb.append("    customerInformation: ").append(toIndentedString(customerInformation)).append("\n");
    if (processingInformation != null) sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    if (invoiceInformation != null) sb.append("    invoiceInformation: ").append(toIndentedString(invoiceInformation)).append("\n");
    if (orderInformation != null) sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    if (invoiceHistory != null) sb.append("    invoiceHistory: ").append(toIndentedString(invoiceHistory)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      // return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

