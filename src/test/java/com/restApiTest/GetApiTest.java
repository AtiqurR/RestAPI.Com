package com.restApiTest;

import org.junit.Before;
import org.junit.Test;

import com.reqres.qa.GetApi;

public class GetApiTest {
	
	GetApi getApi;
	
	@Before
	public void initClass() {
		getApi = new GetApi();
	}
	
	@Test
	public void getApiTest() {
		String response =getApi.getUserApi();
		System.out.println(response);
		
		int statusCode = getApi.getApiStatusCode();
		System.out.println("GetAPI Status Code: " +statusCode);
	}

}
