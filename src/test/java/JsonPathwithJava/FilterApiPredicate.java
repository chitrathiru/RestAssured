package JsonPathwithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterApiPredicate {
	File jsonfile = new File("src/test/resources/Bookstore.json");

	public void filterApi() throws IOException
	{
		Filter filterprice = Filter.filter(Criteria.where("price").lt(10));
		List<Object> pricelist = JsonPath.parse(jsonfile).read("$.store.book[?]",filterprice);
		System.out.println(pricelist);
		
	}
	
	public void secondFilter() throws IOException
	{
		Filter andfilter  = Filter.filter(Criteria
				     .where("price")
				     .lt(10)
				     .and("category")
				     .is("fiction")
				
				);
		List<Map<String,Object>> andfiltervar = JsonPath.parse(jsonfile).read("$.store.book[?]",andfilter);
		System.out.println(andfiltervar);
		
		//if you are going to perform any function from the result use List<Map<String,Object>>
	System.out.println(andfiltervar.get(0).get("author"));
		
	}
	
	public static void main(String[] args) throws IOException {
		
		FilterApiPredicate filterexample = new FilterApiPredicate();
		//filterexample.filterApi();
		filterexample.secondFilter();
		// TODO Auto-generated method stub

	}

}
