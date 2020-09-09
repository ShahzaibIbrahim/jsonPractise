package udemy.json.main;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.Student;

public class ReadMain {

	public static void main(String[] args) throws IOException {

		try {

			ObjectMapper obj = new ObjectMapper();

			URL resource = ReadMain.class.getClassLoader().getResource("MapJsonRead.JSON");

			if (resource == null) {
				throw new IllegalArgumentException("file not found!");
			}

			Student std = obj.readValue(resource, Student.class);

			System.out.println(std);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
