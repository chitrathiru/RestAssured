package JsonPathwithJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadingJsondoc {
	
	public static void readJson() throws IOException
	{
		File jsonfile = new File("src/test/resources/Bookstore.json");
		List<Object> pricelist = JsonPath.read(jsonfile,"$..price");
		
		for(Object price : pricelist)
		{
			System.out.println(price);
		}
	}
	
	//Parse 1 time and read multiple time
	public static void parseonetimeJson() throws IOException
	{
		InputStream jsonfile = new FileInputStream("src/test/resources/Bookstore.json");
		Object Parsejsondoc = Configuration.defaultConfiguration().jsonProvider().parse(jsonfile.readAllBytes());
		
		List<Object> categorylist = JsonPath.read(Parsejsondoc,"$..category");
		
		for(Object category : categorylist)
		{
			System.out.println(category);
		}
	}
	
	//best way to parse and read
	public static void fluentApi() throws IOException
	{
		File jsonfile = new File("src/test/resources/Bookstore.json");
		//DocumentContext Context = JsonPath.parse(jsonfile);
		//List<Object> categorylist = Context.read("$..category");
		
		Configuration config = Configuration.defaultConfiguration();
		List<Object> categorylist1 = JsonPath.using(config).parse(jsonfile).read("$..category");
	
	for (Object category : categorylist1)
	{
		System.out.println(category);
	}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
fluentApi();
}

}
