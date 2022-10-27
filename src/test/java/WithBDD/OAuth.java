package WithBDD;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class OAuth {
	
	@Test
	public void oauth()
	{
		//https://api.github.com/user/repos
				String token = "sasasasasa";
				given()
				.auth()
				.oauth2(token)
				.when()
				.get("https://api.github.com/user/repos")
				.then()
				.log()
				.body();
	}

}
