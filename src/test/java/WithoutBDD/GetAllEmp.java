package WithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmp {
	
	@Test(enabled = false)
	public void getAllEmp()
	{
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification rs = RestAssured.given();
		Response resp = rs.request(Method.GET, "employees");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.getStatusLine());
	}
	
	@Test(enabled=false)
	public void createEmp()
	{
		RestAssured.baseURI ="http://localhost:3000/";
		RequestSpecification  rs = RestAssured.given().header("Content-Type","application/json")
				.body("{\r\n"
				+ "        \"name\": \"Kanak\",\r\n"
				+ "        \"salary\": \"20000\",\r\n"
				+ "        \"age\": \"49\"\r\n"
				+"\r\n"
				+ " }");
		Response resp = rs.request(Method.POST,"Employees");
		System.out.println(resp.asPrettyString());
		System.out.println(resp.getStatusLine());
		
		
	}
	
	@Test(enabled = false)
	public void updateEmp()
	{
		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification rs = RestAssured.given()
								.header("Content-Type","application/json")
								.body("{\n"
										+ "\"name\": \"Kavina\",\n"
										+ "\"salary\": \"20000\",\n"
										+ "\"age\": \"26\"\n"
										+ "}");
		Response resp = rs.request(Method.PUT,"Employees/400");
		System.out.println(resp.asPrettyString());
		
	}
	
	@Test
	public void deleteEmp()
	{
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification rs = RestAssured.given();
		Response resp = rs.request(Method.DELETE,"Employees/irx2anI");
		System.out.println(resp.asPrettyString());
		
	}
	
	
	
	}


