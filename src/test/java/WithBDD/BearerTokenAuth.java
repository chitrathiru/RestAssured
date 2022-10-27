package WithBDD;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BearerTokenAuth {
	
	@Test
	public void bearerToken()
	{
		//https://api.github.com/user/repos
		String token = "sasasasasa";
		given()
		.header("Authorization","Bearer" + token)
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.log()
		.body();
		
	}

}
