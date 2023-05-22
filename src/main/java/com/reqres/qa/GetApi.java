package com.reqres.qa;

import io.restassured.RestAssured;

public class GetApi {
	
	public String getUserApi() {
		return RestAssured
				.given()
				.baseUri("https://reqres.in/")
				.when()
				.log().all()
				.get("/api/users?page=2")
				.asPrettyString();
	}
	
	public int getApiStatusCode() {
		return RestAssured
				.given()
				.baseUri("https://reqres.in/")
				.when()
				.log().all()
				.get("/api/users?page=2")
				.getStatusCode();
	}

}
