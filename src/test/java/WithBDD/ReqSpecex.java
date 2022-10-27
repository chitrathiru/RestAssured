package WithBDD;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import  io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.specification.RequestSpecification;

public class ReqSpecex {

	RequestSpecification reqspec ;
	
	@BeforeSuite
	public void setRequestSpec()
	{
		reqspec = given()
		.baseUri("http://localhost:3000/")
		.basePath("employees/");
	}
	@Test
	public void getEmp()
	{
		RestAssured
		.given()
		.spec(reqspec)
		.when()
			.get()
		.prettyPrint();
	}
	
	@Test
	public void getEmp400()
	{
		RestAssured
		.given()
		.spec(reqspec)
		.when()
			.get("400")
		.prettyPrint();
	}
}
