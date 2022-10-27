package JsonPathwithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;
import com.jayway.jsonpath.Predicate.PredicateContext;

public class MyCustomPredicate {
	File jsonfile = new File("src/test/resources/Bookstore.json");
	
	public void mycustomPredicate() throws IOException
	{
		Predicate bookswithISBN = new Predicate() {
			
			public boolean apply(PredicateContext ctx) {
				// TODO Auto-generated method stub
				
				boolean predicate = ctx.item(Map.class).containsKey("isbd");
				return predicate;
			}
		};
		
		List<Map<String,Object>> result = JsonPath.parse(jsonfile).read("$.store.book[?]",bookswithISBN);
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		MyCustomPredicate predicateobj = new MyCustomPredicate();
		predicateobj.mycustomPredicate();

	}

}
