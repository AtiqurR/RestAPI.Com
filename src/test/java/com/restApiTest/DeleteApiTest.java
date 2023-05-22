package com.restApiTest;

import org.junit.Before;
import org.junit.Test;

import com.reqres.qa.DeleteApi;

public class DeleteApiTest {
	
    DeleteApi deleteApi;
	
	@Before
	public void initClass() {
	deleteApi = new DeleteApi();
	}
	
	@Test
	public void deleteUserApiTest() {
		String response = deleteApi.deleteUserApi();
		System.out.println(response);
		
		int statusCode = deleteApi.deleteApiStatusCode();
		System.out.println("PostApi Status Code: " +statusCode);
	}


}
