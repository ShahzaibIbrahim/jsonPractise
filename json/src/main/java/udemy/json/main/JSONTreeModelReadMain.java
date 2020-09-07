package udemy.json.main;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.JsonObject;
public class JSONTreeModelReadMain {

	public static void main(String[] args) throws IOException {

		ObjectMapper obj = new ObjectMapper();

		URL resource = JSONMainRead.class.getClassLoader().getResource("Deserialize.JSON");

		if (resource == null) {
			throw new IllegalArgumentException("file not found!");
		}

		JsonObject jsonObj = obj.readValue(resource, JsonObject.class);
		
		System.out.println(jsonObj);
	}
}
