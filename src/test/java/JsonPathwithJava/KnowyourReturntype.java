package JsonPathwithJava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class KnowyourReturntype {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Definite path - know what your json path will return - Store it in corresponding data type
		//Indefinite path - Doesn't know what Json path will return - Store it in List object
		
		//Indefinite path - Deepscan,Multiple array[0,2] or[0:2] or [*],?(Filter expression
		
		File jsonfile = new File("src/test/resources/Bookstore.json");
		List<Object> authorlist = JsonPath.read(jsonfile, "$..author");
		String author1 = JsonPath.read(jsonfile,"$store.book[0].author");
		System.out.println(author1);
		
		for (Object author : authorlist)
		{
			System.out.println(author);
		}
		

	}

}
