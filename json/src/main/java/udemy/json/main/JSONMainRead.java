package udemy.json.main;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.Student;

public class JSONMainRead {

	public static void main(String[] args) throws IOException {
		ObjectMapper obj = new ObjectMapper();
		
		String studentJSON = "{" + 
				"  \"name\" : \"Shahzaib\", " +
				"  \"lastname\" : \"Ibrahim\", " + 
				"  \"userId\" : 1 " + 
				"}";
		
		try {
			
	//		ClassLoader classLoader = JSONMainRead.class.getClassLoader();

			URL resource = JSONMainRead.class.getClassLoader().getResource("MapJsonRead.JSON");
			
			if (resource == null) {
			    throw new IllegalArgumentException("file not found!");
			} 
			
			//File file = new File("/MapJsonRead.JSON");
			Student std = obj.readValue(resource,Student.class);
			
			System.out.println(std);
			//System.out.println(std);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
