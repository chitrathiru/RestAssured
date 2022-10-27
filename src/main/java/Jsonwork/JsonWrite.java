package Jsonwork;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	JSONObject jsonwrite = new JSONObject();
	jsonwrite.put("name", "iniya");
	jsonwrite.put("age", 11);
	
	JSONArray array = new JSONArray();
	array.add("beautiful");
	array.add("fun");
	jsonwrite.put("qualities", array);
	
	FileWriter filewriter = new FileWriter("iniya.json");
	filewriter.write(jsonwrite.toJSONString());
	filewriter.close();
	}

}
