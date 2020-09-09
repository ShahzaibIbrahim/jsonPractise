package udemy.json.main;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.SerializedObject;

public class WriteSerializerMain {

	public static void main(String[] args) {
		SerializedObject obj = new SerializedObject();
		obj.setId(1);
		obj.setKey1("123");
		obj.setKey2("345");
		
		
		ObjectMapper objMapper = new ObjectMapper();
		
		try {
			System.out.println(objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
