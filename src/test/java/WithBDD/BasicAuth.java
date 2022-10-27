package WithBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BasicAuth {
	
	@Test
	public void basicAuth()
	{
		RestAssured
		.given()
		.auth()
		.basic("postman", "password")
		.baseUri("https://postman-echo.com/")
		.when()
		.get("basic-auth")
		.then()
		.statusCode(200);
		
	}

}
