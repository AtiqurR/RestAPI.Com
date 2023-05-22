package com.reqres.qa;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostApi {
	
	public String postUserApi() {
		return RestAssured
				.given()
				.baseUri("https://reqres.in")
				.when()
				.body(new File("C:\\Users\\Anik\\eclipse-workspace\\RestAPI.Com\\inputFiles\\user.json")).contentType(ContentType.JSON)
				.post("/api/users")
				.asPrettyString();
	}
	
//	public int postApiStatusCode() {
//		return RestAssured
//				.given()
//				.baseUri("https://reqres.in/")
//				.when()
//				.body(new File("C:\\Users\\Anik\\eclipse-workspace\\RestAPI.Com\\inputFiles\\user.json"))
//				.log().all()
//				.get("/api/users")
//				.getStatusCode();
//	}


}
