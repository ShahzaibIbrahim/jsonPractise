package udemy.json.main;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.SerializedObject;

public class ReadSerializerMain {

	public static void main(String[] args) throws IOException {

		ObjectMapper obj = new ObjectMapper();

		URL resource = ReadMain.class.getClassLoader().getResource("Deserialize.JSON");

		if (resource == null) {
			throw new IllegalArgumentException("file not found!");
		}

		SerializedObject jsonObj = obj.readValue(resource, SerializedObject.class);

		System.out.println(jsonObj);
	}
}
