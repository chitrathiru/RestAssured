package WithBDD;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValidation {
	
	@Test(enabled = false)
	public void schemaValidationInClassPath()
	{
		File jsonfile = new File("src/test/resources/input.json");
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body(jsonfile)
		.when()
			.post("employees")
		.then()
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
		
		
		
	}
	
	@Test(enabled = true)
	public void schemaValidation()
	{
		File jsonfile = new File("src/test/resources/input.json");
		File schemafile = new File("/Users/chitra/Desktop/Chitra-QA/datafiles/schema.json");
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body(jsonfile)
		.when()
			.post("employees")
		.then()
			.body(JsonSchemaValidator.matchesJsonSchema(schemafile));
		
	}

}
