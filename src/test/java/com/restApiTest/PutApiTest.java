package com.restApiTest;

import org.junit.Before;
import org.junit.Test;
import com.reqres.qa.PutApi;

public class PutApiTest {

	PutApi putApi;

	@Before
	public void initClass() {

		putApi = new PutApi();
	}

	@Test
	public void postApiTest() {
		String response = putApi.putUserApi();
		System.out.println(response);

	}

}
