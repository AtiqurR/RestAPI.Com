package com.reqres.qa;

import io.restassured.RestAssured;

public class DeleteApi {
	
	public String deleteUserApi() {
		return RestAssured
				.given()
				.baseUri("https://reqres.in/")
				.when()
				.log().all()
				.delete("/api/users/2")
				.asPrettyString();
	}
	
	public int deleteApiStatusCode() {
		return RestAssured
				.given()
				.baseUri("https://reqres.in/")
				.when()
				.log().all()
				.delete("/api/users/2")
				.getStatusCode();
	}

}
