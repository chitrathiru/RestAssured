package Jsonwork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser parseobj = new JSONParser();
		FileReader fr = new FileReader("iniya.json");
		JSONObject jsonobj = (JSONObject) parseobj.parse(fr);
		String name = (String)jsonobj.get("name");
		Long age = (Long) jsonobj.get("age");
		JSONArray qualities = (JSONArray)jsonobj.get("qualities");
		Iterator iterator = qualities.iterator();
		System.out.println("name    "+name);
		System.out.println("age    "+age);
		while (iterator.hasNext())
		{
			System.out.println("qualities    "+iterator.next());
		}
		
		
	}

}
