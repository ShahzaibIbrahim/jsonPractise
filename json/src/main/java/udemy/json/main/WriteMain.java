package udemy.json.main;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.Student;

public class WriteMain {

	public static void main(String[] args) {
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Student std1 = new Student(1,null, "Ibrahim");
		
		
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/MapJsonRead3.JSON"),std1);
			System.out.println("done");
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		/*
		Map<String,Object> jsonMap = new HashMap<String,Object>();
		
		jsonMap.put("String","StringVal");
		jsonMap.put("Boolean", true);
		jsonMap.put("Date", LocalDateTime.now());
		jsonMap.put("Array", new String[] {"1","2","3"});
		
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/MapJson.JSON"),jsonMap);
			System.out.println("Done!");
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}

}
