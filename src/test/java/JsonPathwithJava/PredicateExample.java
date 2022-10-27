package JsonPathwithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class PredicateExample {
	
	public void inlinePredicate() throws IOException
	{
		File jsonfile = new File("src/test/resources/Bookstore.json");
		List<Object> result = JsonPath.parse(jsonfile)
		.read("$.store.book[?(@.price<10)].author");
		System.out.println(result);
	}
	
	//price should be less than 10 and category is fiction
	
	//[?(@.price<10 && @.category=='fiction')]
	
	//price should be less than 10 or category is fiction
	//[?(@.price>10 || @.category=='fiction')]
	//not in - [?(!(@.price>10 || @.category=='fiction'))]
	
	public static void main(String args[]) throws IOException
	{
		PredicateExample example= new PredicateExample();
		example.inlinePredicate();
		
	}

}
