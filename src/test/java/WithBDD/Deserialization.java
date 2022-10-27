package WithBDD;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class Deserialization {
	File json = new File("src/test/resources/input.json");
	/*String json = "{\r\n"
				  + "   \"first_name\" : \"Kanak\",\r\n"
				  + "   \"last_name\" : \"Nat\",\r\n"
				  + "   \"email\" : \"123@gmail.com\",\r\n"
				  + "   \"skills\" : [\"Java\",\"Selenium\" ]\r\n"
				  + "}";*/
	
	public void objectMapper() throws IOException  {
		ObjectMapper mapper = new ObjectMapper();
		
		Employee emp = mapper.readValue(json, Employee.class);
		
	
		
		System.out.println(emp.getFirst_name());
		System.out.println(emp.getLast_name());
		System.out.println(emp.getEmail());
		System.out.println(emp.getSkills());
		
	}
	public void usingJsonpath() throws IOException
	{
		JacksonMappingProvider mappingProvider = new JacksonMappingProvider();
		Configuration config = Configuration.builder().mappingProvider(mappingProvider).build();
		 Employee emp = JsonPath.using(config).parse(json).read("$",Employee.class);
		 System.out.println(emp.getFirst_name());
			System.out.println(emp.getLast_name());
			System.out.println(emp.getEmail());
			System.out.println(emp.getSkills());
	}
	
	public void usingRAJsonpath()
	{
		io.restassured.path.json.JsonPath jsonpath =  io.restassured.path.json.JsonPath.from(json);
		Employee emp = jsonpath.getObject("$", Employee.class);
		System.out.println(emp.getFirst_name());
		System.out.println(emp.getLast_name());
		System.out.println(emp.getEmail());
		System.out.println(emp.getSkills());
	}
	
	public void usingASFunction()
	{
		Map<String,Object> response = RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("Employees/400")
		.then()
		.extract()
		.body()
		.as(new TypeRef<Map<String,Object>>() {
		});
		System.out.println(response);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		
		Deserialization deserialization = new Deserialization();
		//deserialization.objectMapper();
		
		//deserialization.usingJsonpath();
		//deserialization.usingRAJsonpath();
		deserialization.usingASFunction();
	}

}
