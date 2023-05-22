package com.reqres.qa;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PutApi {
	
	public String putUserApi() {
		return RestAssured
				.given()
				.baseUri("https://reqres.in/")
				.when()
				.body(new File("C:\\Users\\Anik\\eclipse-workspace\\RestAPI.Com\\inputFiles\\user.json")).contentType(ContentType.JSON)
				.log().all()
				.put("/api/users/2")
				.asPrettyString();
	}

}
