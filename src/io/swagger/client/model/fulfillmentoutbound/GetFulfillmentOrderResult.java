/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.fulfillmentoutbound;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetFulfillmentOrderResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:32.042+03:00")
public class GetFulfillmentOrderResult {
  @SerializedName("fulfillmentOrder")
  private FulfillmentOrder fulfillmentOrder = null;

  @SerializedName("fulfillmentOrderItems")
  private FulfillmentOrderItemList fulfillmentOrderItems = null;

  @SerializedName("fulfillmentShipments")
  private FulfillmentShipmentList fulfillmentShipments = null;

  @SerializedName("returnItems")
  private ReturnItemList returnItems = null;

  @SerializedName("returnAuthorizations")
  private ReturnAuthorizationList returnAuthorizations = null;

  @SerializedName("paymentInformation")
  private PaymentInformationList paymentInformation = null;

  public GetFulfillmentOrderResult fulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
    return this;
  }

   /**
   * Get fulfillmentOrder
   * @return fulfillmentOrder
  **/
  @ApiModelProperty(required = true, value = "")
  public FulfillmentOrder getFulfillmentOrder() {
    return fulfillmentOrder;
  }

  public void setFulfillmentOrder(FulfillmentOrder fulfillmentOrder) {
    this.fulfillmentOrder = fulfillmentOrder;
  }

  public GetFulfillmentOrderResult fulfillmentOrderItems(FulfillmentOrderItemList fulfillmentOrderItems) {
    this.fulfillmentOrderItems = fulfillmentOrderItems;
    return this;
  }

   /**
   * Get fulfillmentOrderItems
   * @return fulfillmentOrderItems
  **/
  @ApiModelProperty(required = true, value = "")
  public FulfillmentOrderItemList getFulfillmentOrderItems() {
    return fulfillmentOrderItems;
  }

  public void setFulfillmentOrderItems(FulfillmentOrderItemList fulfillmentOrderItems) {
    this.fulfillmentOrderItems = fulfillmentOrderItems;
  }

  public GetFulfillmentOrderResult fulfillmentShipments(FulfillmentShipmentList fulfillmentShipments) {
    this.fulfillmentShipments = fulfillmentShipments;
    return this;
  }

   /**
   * Get fulfillmentShipments
   * @return fulfillmentShipments
  **/
  @ApiModelProperty(value = "")
  public FulfillmentShipmentList getFulfillmentShipments() {
    return fulfillmentShipments;
  }

  public void setFulfillmentShipments(FulfillmentShipmentList fulfillmentShipments) {
    this.fulfillmentShipments = fulfillmentShipments;
  }

  public GetFulfillmentOrderResult returnItems(ReturnItemList returnItems) {
    this.returnItems = returnItems;
    return this;
  }

   /**
   * Get returnItems
   * @return returnItems
  **/
  @ApiModelProperty(required = true, value = "")
  public ReturnItemList getReturnItems() {
    return returnItems;
  }

  public void setReturnItems(ReturnItemList returnItems) {
    this.returnItems = returnItems;
  }

  public GetFulfillmentOrderResult returnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
    this.returnAuthorizations = returnAuthorizations;
    return this;
  }

   /**
   * Get returnAuthorizations
   * @return returnAuthorizations
  **/
  @ApiModelProperty(required = true, value = "")
  public ReturnAuthorizationList getReturnAuthorizations() {
    return returnAuthorizations;
  }

  public void setReturnAuthorizations(ReturnAuthorizationList returnAuthorizations) {
    this.returnAuthorizations = returnAuthorizations;
  }

  public GetFulfillmentOrderResult paymentInformation(PaymentInformationList paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public PaymentInformationList getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(PaymentInformationList paymentInformation) {
    this.paymentInformation = paymentInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFulfillmentOrderResult getFulfillmentOrderResult = (GetFulfillmentOrderResult) o;
    return Objects.equals(this.fulfillmentOrder, getFulfillmentOrderResult.fulfillmentOrder) &&
        Objects.equals(this.fulfillmentOrderItems, getFulfillmentOrderResult.fulfillmentOrderItems) &&
        Objects.equals(this.fulfillmentShipments, getFulfillmentOrderResult.fulfillmentShipments) &&
        Objects.equals(this.returnItems, getFulfillmentOrderResult.returnItems) &&
        Objects.equals(this.returnAuthorizations, getFulfillmentOrderResult.returnAuthorizations) &&
        Objects.equals(this.paymentInformation, getFulfillmentOrderResult.paymentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentOrder, fulfillmentOrderItems, fulfillmentShipments, returnItems, returnAuthorizations, paymentInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFulfillmentOrderResult {\n");
    
    sb.append("    fulfillmentOrder: ").append(toIndentedString(fulfillmentOrder)).append("\n");
    sb.append("    fulfillmentOrderItems: ").append(toIndentedString(fulfillmentOrderItems)).append("\n");
    sb.append("    fulfillmentShipments: ").append(toIndentedString(fulfillmentShipments)).append("\n");
    sb.append("    returnItems: ").append(toIndentedString(returnItems)).append("\n");
    sb.append("    returnAuthorizations: ").append(toIndentedString(returnAuthorizations)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

