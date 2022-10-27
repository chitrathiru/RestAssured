package WithBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ApiKeyAuth {
	
	@Test
	public void apiKeyAuth()
	{
	
	RestAssured
	.given()
	.baseUri("https://api.openweathermap.org/data/2.5/forecast/daily")
	.queryParam("q", "Delhi")
	.queryParam("appid", "fe9c5cddb7e01d747b4611c3fc9eaf2c")
	//.header("appid", "fe9c5cddb7e01d747b4611c3fc9eaf2c")
	.when()
	.get()
	.then()
	.log()
	.body();
	
	
	//https://api.openweathermap.org/data/2.5/forecast/daily?q=Delhi & appid=fe9c5cddb7e01d747b4611c3fc9eaf2c

	}
}
