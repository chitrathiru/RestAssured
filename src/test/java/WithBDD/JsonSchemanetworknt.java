package WithBDD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class JsonSchemanetworknt {
	
	@Test
	public  void jsonSchemaNetworknt() throws IOException
	{
		ObjectMapper objmap = new ObjectMapper();
		JsonSchemaFactory jsonfactory = JsonSchemaFactory.getInstance(VersionFlag.V4);
		File jsonfile = new File("src/test/resources/input.json");
		InputStream schemafile = new FileInputStream("src/test/resources/schema.json");
		
		JsonNode jnode = objmap.readTree(jsonfile);
		JsonSchema jsonschema = jsonfactory.getSchema(schemafile);
		Set<ValidationMessage> result = jsonschema.validate(jnode);
		
		if (result.isEmpty())
		{
			System.out.println("no error");
		}
		for (ValidationMessage message : result)
		{
			System.out.println("message  "+message);
		}
		
	}

}
