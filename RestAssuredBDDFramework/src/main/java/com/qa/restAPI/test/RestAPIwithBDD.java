package com.qa.restAPI.test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class RestAPIwithBDD {
	
	@Test
	public void testNosOfCircuits2017() {
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").
		then().
			assertThat().
			statusCode(200).
			and().
			
			body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
			and().
			
			header("Content-Length", equalTo("4551"));
	}

}
