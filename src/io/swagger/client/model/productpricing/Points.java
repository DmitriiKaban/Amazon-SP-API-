/*
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.Error;
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer pricing information for Amazon Marketplace products.  For more information, refer to the [Product Pricing v2022-05-01 Use Case Guide](https://developer-docs.amazon.com/sp-api/docs/product-pricing-api-v2022-05-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-05-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model.productpricing;

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
 * The number of Amazon Points offered with the purchase of an item, and their monetary value.
 */
@ApiModel(description = "The number of Amazon Points offered with the purchase of an item, and their monetary value.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-05-31T10:41:51.838+03:00")
public class Points {
  @SerializedName("pointsNumber")
  private Integer pointsNumber = null;

  @SerializedName("pointsMonetaryValue")
  private MoneyType pointsMonetaryValue = null;

  public Points pointsNumber(Integer pointsNumber) {
    this.pointsNumber = pointsNumber;
    return this;
  }

   /**
   * The number of points.
   * @return pointsNumber
  **/
  @ApiModelProperty(value = "The number of points.")
  public Integer getPointsNumber() {
    return pointsNumber;
  }

  public void setPointsNumber(Integer pointsNumber) {
    this.pointsNumber = pointsNumber;
  }

  public Points pointsMonetaryValue(MoneyType pointsMonetaryValue) {
    this.pointsMonetaryValue = pointsMonetaryValue;
    return this;
  }

   /**
   * The monetary value of the points.
   * @return pointsMonetaryValue
  **/
  @ApiModelProperty(value = "The monetary value of the points.")
  public MoneyType getPointsMonetaryValue() {
    return pointsMonetaryValue;
  }

  public void setPointsMonetaryValue(MoneyType pointsMonetaryValue) {
    this.pointsMonetaryValue = pointsMonetaryValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Points points = (Points) o;
    return Objects.equals(this.pointsNumber, points.pointsNumber) &&
        Objects.equals(this.pointsMonetaryValue, points.pointsMonetaryValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointsNumber, pointsMonetaryValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Points {\n");
    
    sb.append("    pointsNumber: ").append(toIndentedString(pointsNumber)).append("\n");
    sb.append("    pointsMonetaryValue: ").append(toIndentedString(pointsMonetaryValue)).append("\n");
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

