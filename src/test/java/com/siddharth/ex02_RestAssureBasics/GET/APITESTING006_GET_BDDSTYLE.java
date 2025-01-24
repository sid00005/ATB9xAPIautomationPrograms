package com.siddharth.ex02_RestAssureBasics.GET;

import io.restassured.RestAssured;

public class APITESTING006_GET_BDDSTYLE {
    public static void main(String[] args) {

        String pincode = "560016";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);

         pincode = "-1";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(404);


    }
}
