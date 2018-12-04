/*
 * LocationIQ
 * LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.locationiq.client.model;

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
 * Address
 */

public class Address {
  public static final String SERIALIZED_NAME_HOUSE_NUMBER = "house_number";
  @SerializedName(SERIALIZED_NAME_HOUSE_NUMBER)
  private String houseNumber = null;

  public static final String SERIALIZED_NAME_ROAD = "road";
  @SerializedName(SERIALIZED_NAME_ROAD)
  private String road = null;

  public static final String SERIALIZED_NAME_RESIDENTIAL = "residential";
  @SerializedName(SERIALIZED_NAME_RESIDENTIAL)
  private String residential = null;

  public static final String SERIALIZED_NAME_BOROUGH = "borough";
  @SerializedName(SERIALIZED_NAME_BOROUGH)
  private String borough = null;

  public static final String SERIALIZED_NAME_NEIGHBOURHOOD = "neighbourhood";
  @SerializedName(SERIALIZED_NAME_NEIGHBOURHOOD)
  private String neighbourhood = null;

  public static final String SERIALIZED_NAME_QUARTER = "quarter";
  @SerializedName(SERIALIZED_NAME_QUARTER)
  private String quarter = null;

  public static final String SERIALIZED_NAME_HAMLET = "hamlet";
  @SerializedName(SERIALIZED_NAME_HAMLET)
  private String hamlet = null;

  public static final String SERIALIZED_NAME_SUBURB = "suburb";
  @SerializedName(SERIALIZED_NAME_SUBURB)
  private String suburb = null;

  public static final String SERIALIZED_NAME_ISLAND = "island";
  @SerializedName(SERIALIZED_NAME_ISLAND)
  private String island = null;

  public static final String SERIALIZED_NAME_VILLAGE = "village";
  @SerializedName(SERIALIZED_NAME_VILLAGE)
  private String village = null;

  public static final String SERIALIZED_NAME_TOWN = "town";
  @SerializedName(SERIALIZED_NAME_TOWN)
  private String town = null;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city = null;

  public static final String SERIALIZED_NAME_CITY_DISTRICT = "city_district";
  @SerializedName(SERIALIZED_NAME_CITY_DISTRICT)
  private String cityDistrict = null;

  public static final String SERIALIZED_NAME_COUNTY = "county";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private String county = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state = null;

  public static final String SERIALIZED_NAME_STATE_DISTRICT = "state_district";
  @SerializedName(SERIALIZED_NAME_STATE_DISTRICT)
  private String stateDistrict = null;

  public static final String SERIALIZED_NAME_POSTCODE = "postcode";
  @SerializedName(SERIALIZED_NAME_POSTCODE)
  private String postcode = null;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country = null;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode = null;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode = null;

  public Address houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

   /**
   * Get houseNumber
   * @return houseNumber
  **/
  @ApiModelProperty(value = "")
  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public Address road(String road) {
    this.road = road;
    return this;
  }

   /**
   * Get road
   * @return road
  **/
  @ApiModelProperty(value = "")
  public String getRoad() {
    return road;
  }

  public void setRoad(String road) {
    this.road = road;
  }

  public Address residential(String residential) {
    this.residential = residential;
    return this;
  }

   /**
   * Get residential
   * @return residential
  **/
  @ApiModelProperty(value = "")
  public String getResidential() {
    return residential;
  }

  public void setResidential(String residential) {
    this.residential = residential;
  }

  public Address borough(String borough) {
    this.borough = borough;
    return this;
  }

   /**
   * Get borough
   * @return borough
  **/
  @ApiModelProperty(value = "")
  public String getBorough() {
    return borough;
  }

  public void setBorough(String borough) {
    this.borough = borough;
  }

  public Address neighbourhood(String neighbourhood) {
    this.neighbourhood = neighbourhood;
    return this;
  }

   /**
   * Get neighbourhood
   * @return neighbourhood
  **/
  @ApiModelProperty(value = "")
  public String getNeighbourhood() {
    return neighbourhood;
  }

  public void setNeighbourhood(String neighbourhood) {
    this.neighbourhood = neighbourhood;
  }

  public Address quarter(String quarter) {
    this.quarter = quarter;
    return this;
  }

   /**
   * Get quarter
   * @return quarter
  **/
  @ApiModelProperty(value = "")
  public String getQuarter() {
    return quarter;
  }

  public void setQuarter(String quarter) {
    this.quarter = quarter;
  }

  public Address hamlet(String hamlet) {
    this.hamlet = hamlet;
    return this;
  }

   /**
   * Get hamlet
   * @return hamlet
  **/
  @ApiModelProperty(value = "")
  public String getHamlet() {
    return hamlet;
  }

  public void setHamlet(String hamlet) {
    this.hamlet = hamlet;
  }

  public Address suburb(String suburb) {
    this.suburb = suburb;
    return this;
  }

   /**
   * Get suburb
   * @return suburb
  **/
  @ApiModelProperty(value = "")
  public String getSuburb() {
    return suburb;
  }

  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }

  public Address island(String island) {
    this.island = island;
    return this;
  }

   /**
   * Get island
   * @return island
  **/
  @ApiModelProperty(value = "")
  public String getIsland() {
    return island;
  }

  public void setIsland(String island) {
    this.island = island;
  }

  public Address village(String village) {
    this.village = village;
    return this;
  }

   /**
   * Get village
   * @return village
  **/
  @ApiModelProperty(value = "")
  public String getVillage() {
    return village;
  }

  public void setVillage(String village) {
    this.village = village;
  }

  public Address town(String town) {
    this.town = town;
    return this;
  }

   /**
   * Get town
   * @return town
  **/
  @ApiModelProperty(value = "")
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Address cityDistrict(String cityDistrict) {
    this.cityDistrict = cityDistrict;
    return this;
  }

   /**
   * Get cityDistrict
   * @return cityDistrict
  **/
  @ApiModelProperty(value = "")
  public String getCityDistrict() {
    return cityDistrict;
  }

  public void setCityDistrict(String cityDistrict) {
    this.cityDistrict = cityDistrict;
  }

  public Address county(String county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @ApiModelProperty(value = "")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public Address state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Address stateDistrict(String stateDistrict) {
    this.stateDistrict = stateDistrict;
    return this;
  }

   /**
   * Get stateDistrict
   * @return stateDistrict
  **/
  @ApiModelProperty(value = "")
  public String getStateDistrict() {
    return stateDistrict;
  }

  public void setStateDistrict(String stateDistrict) {
    this.stateDistrict = stateDistrict;
  }

  public Address postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

   /**
   * Get postcode
   * @return postcode
  **/
  @ApiModelProperty(value = "")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public Address country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Address countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Address stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @ApiModelProperty(value = "")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.houseNumber, address.houseNumber) &&
        Objects.equals(this.road, address.road) &&
        Objects.equals(this.residential, address.residential) &&
        Objects.equals(this.borough, address.borough) &&
        Objects.equals(this.neighbourhood, address.neighbourhood) &&
        Objects.equals(this.quarter, address.quarter) &&
        Objects.equals(this.hamlet, address.hamlet) &&
        Objects.equals(this.suburb, address.suburb) &&
        Objects.equals(this.island, address.island) &&
        Objects.equals(this.village, address.village) &&
        Objects.equals(this.town, address.town) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.cityDistrict, address.cityDistrict) &&
        Objects.equals(this.county, address.county) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.stateDistrict, address.stateDistrict) &&
        Objects.equals(this.postcode, address.postcode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.stateCode, address.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(houseNumber, road, residential, borough, neighbourhood, quarter, hamlet, suburb, island, village, town, city, cityDistrict, county, state, stateDistrict, postcode, country, countryCode, stateCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    road: ").append(toIndentedString(road)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    borough: ").append(toIndentedString(borough)).append("\n");
    sb.append("    neighbourhood: ").append(toIndentedString(neighbourhood)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
    sb.append("    hamlet: ").append(toIndentedString(hamlet)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    island: ").append(toIndentedString(island)).append("\n");
    sb.append("    village: ").append(toIndentedString(village)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    cityDistrict: ").append(toIndentedString(cityDistrict)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateDistrict: ").append(toIndentedString(stateDistrict)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

