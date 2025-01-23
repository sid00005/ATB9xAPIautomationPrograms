package com.siddharth.ex01_samplkecheck;

import io.restassured.RestAssured;

public class APITesting002 {
    public static void main(String[] args) {

        //Gerkins Syntax
        // Given() -> Pre Req - UrL,headers,Auth<Body...
        //when -> http method - Get/post/put/patch,delete
        //then -> validation ->200 ok , firstname ==Siddharth


        // Full URL - https://api.zippopotam.us/IN/480001
        //base URI - https://api.zippopotam.us
        //base path - /IN/480001

        RestAssured

                .given()
                 .baseUri("https://api.zippopotam.us")
                 .basePath("/IN/480001")
                .when()
                  .get()
                .then().log().all().statusCode(200);




    }
}
