package WithBDD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestSchemaVal {
	
	@Test
	public void hamcrestVal() throws IOException
	
	{
		File jsonfile = new File("src/test/resources/input.json");
		String Stringcontent = FileUtils.readFileToString(jsonfile,"UTF-8");
		File schemafile = new File("src/test/resources/schema.json");
		
		MatcherAssert.assertThat(Stringcontent, JsonSchemaValidator.matchesJsonSchema(schemafile));
			
	}

}
