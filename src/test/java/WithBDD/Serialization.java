package WithBDD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import  io.restassured.RestAssured;

public class Serialization {
	@Test
	public void serial()
	{
		Map<String,Object> mapobj = new HashMap<String, Object>();
		List<String> lisobj = new ArrayList<String>();
		lisobj.add("Java");
		lisobj.add("Selenium");
		
		
		mapobj.put("First_name", "Chitra");
		mapobj.put("Last_name", "Thiruvengadam");
		mapobj.put("Email","chitra@gmail.com");
		mapobj.put("Skill", lisobj);
		
		System.out.println(mapobj);
		
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body(mapobj)
			.log()
			.all()
		.when()	
			.post("employees")
		.then()
			.log()
			.all();
		
	
				

		
	}

}
