package WithBDD;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.setFirst_name("Chitra");
		emp.setLast_name("Thiru");
		emp.setEmail("2133@gmail.com");
		emp.setSkills(Arrays.asList("Java","Selenium"));
		
		System.out.println(emp.getFirst_name());
		System.out.println(emp.getLast_name());
		System.out.println(emp.getEmail());
		System.out.println(emp.getSkills());
		
		ObjectMapper objmap = new ObjectMapper();
		String empjson = objmap.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
System.out.println(empjson);
	}

}
