package WithBDD;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllEmp {
	
	@Test(enabled=false)
	public void getEmp()
	{
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
		.when()
			.get("employees")
		.prettyPrint();
	}
	
	@Test(enabled = false)
	public void createEmp()
	{
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body("{\n"
					+"   \"name\": \"Kavina123\",\n"
					+"   \"salary\": \"20000\",\n"
					+ "  \"age\": \"26\"\n"
					+ " }")
			.post("/employees")
		.prettyPrint();
	}

	@Test(enabled = false)
	public void updateEmp()
	{
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body("{\n"
					+"   \"name\": \"Kavina\",\n"
					+"   \"salary\": \"60000\",\n"
					+ "  \"age\": \"26\"\n"
					+ " }")
			.put("/employees/400")
			.prettyPrint();
	}
	
	@Test(enabled = false)
	public void deleteEmp()
	{
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
			.delete("employees/VZ6K3YJ")
			.prettyPrint();
	}
	
	
	@Test(enabled = true)
	public void createEmpFF()
	{
		File fjson = new File("postdata.json");
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body(fjson)
		.when()
			.post("employees")
		.then()
		.log()
		.all();
	}
}
