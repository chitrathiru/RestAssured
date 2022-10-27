package JsonPathwithJava;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

import groovyjarjarantlr4.v4.parse.ANTLRParser.optionsSpec_return;

public class ConfigurationExample {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String json = "[\r\n"
						+"   {\r\n"
						+"     \"name\" : \"john\",\r\n"
				       + "     \"gender\" : \"male\",\r\n"
						+"   },\r\n"
				       +" {\r\n"
				       +"     \"name\" : \"ben\",\r\n"
				       +"   },\r\n"
				       +"]";
		Configuration config = Configuration.defaultConfiguration();
		config = config.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
		
		
		//if you know the configuration before
		/*Configuration config1 = Configuration
								.builder()
								.options(Option.DEFAULT_PATH_LEAF_TO_NULL)
								.build();*/
		String result = JsonPath
		.using(config)
		.parse(json)
		.read("$.[1].gender");
		System.out.println(result);
		
		config = config.addOptions(Option.ALWAYS_RETURN_LIST);
		
		List<Object> result1 = JsonPath
				.using(config)
				.parse(json)
				.read("$.[1].name");
				System.out.println(result1);
		

	}

}
