/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Replenishment
 * The Selling Partner API for Replenishment (Replenishment API) provides programmatic access to replenishment program metrics and offers. These programs provide recurring delivery of any replenishable item at a frequency chosen by the customer.  The Replenishment API is available worldwide wherever Amazon Subscribe & Save is available or is supported. The API is available to vendors and FBA selling partners.
 *
 * OpenAPI spec version: 2022-11-07
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.replenishment;

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
 * Use these parameters to sort the response.
 */
@ApiModel(description = "Use these parameters to sort the response.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:53.825+03:00")
public class ListOffersRequestSort {
  @SerializedName("order")
  private SortOrder order = null;

  @SerializedName("key")
  private ListOffersSortKey key = null;

  public ListOffersRequestSort order(SortOrder order) {
    this.order = order;
    return this;
  }

   /**
   * The sort order.
   * @return order
  **/
  @ApiModelProperty(required = true, value = "The sort order.")
  public SortOrder getOrder() {
    return order;
  }

  public void setOrder(SortOrder order) {
    this.order = order;
  }

  public ListOffersRequestSort key(ListOffersSortKey key) {
    this.key = key;
    return this;
  }

   /**
   * The attribute to use to sort the results.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The attribute to use to sort the results.")
  public ListOffersSortKey getKey() {
    return key;
  }

  public void setKey(ListOffersSortKey key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOffersRequestSort listOffersRequestSort = (ListOffersRequestSort) o;
    return Objects.equals(this.order, listOffersRequestSort.order) &&
        Objects.equals(this.key, listOffersRequestSort.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOffersRequestSort {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
