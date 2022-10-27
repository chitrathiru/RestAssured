package WithBDD;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class GenerateJsonFile {
	
	public  static void  main(String args[]) throws IOException
	{
		ExamplePOJO emp = new ExamplePOJO();
		emp.setFirst_name("Chitra");
		emp.setLast_name("Thiru");
		emp.setEmail("abc@gmail.com");
		emp.setPhone(12345678);
		
		JSONObject jsonobj = new JSONObject();
		jsonobj.put("first_name", emp.getFirst_name());
		jsonobj.put("Last_name", emp.getLast_name());
		jsonobj.put("Email", emp.getEmail());
		jsonobj.put("Phone", emp.getPhone());
		
		FileWriter writefile = new FileWriter("Sheelaexample.json");
		writefile.write(jsonobj.toJSONString());
		writefile.close();
		
	}

}
