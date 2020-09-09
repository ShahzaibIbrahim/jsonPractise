package udemy.json.main;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadTreeModelMain {

	public static void main(String[] args) throws IOException {
		ObjectMapper obj = new ObjectMapper();

		URL resource = ReadMain.class.getClassLoader().getResource("MapJsonRead.JSON");

		if (resource == null) {
			throw new IllegalArgumentException("file not found!");
		}

		JsonNode node = obj.readTree(resource);
		
		System.out.println(node.get("userId").asText());
		
		
	}
}
