package com.siddharth.ex02_RestAssureBasics.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITESTING007_GET_BDDSTYLe {



    @Test
    public void test_Get_Req_Positive() {

        String pincode = "560016";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when().log().all().get()
                .then().log().all().statusCode(200);






    }
        @Test
        public void test_Get_Req_NEGATIVE() {
        pincode = "-1";
        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when().log().all().get()
                .then().log().all().statusCode(404);
    }





}
