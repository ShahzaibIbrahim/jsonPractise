package udemy.json.main;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.Student;

public class ReadStreamingApiMain {

	public static void main(String[] args) throws IOException {

		try {
			ObjectMapper obj = new ObjectMapper();
			JsonFactory factory = new JsonFactory();
			URL resource = ReadMain.class.getClassLoader().getResource("MapJsonRead.JSON");

			if (resource == null) {
				throw new IllegalArgumentException("file not found!");
			}

			JsonParser parser = factory.createParser(resource);
		//	System.out.println(parser.getCurrentToken());
			while (parser.nextToken() != null) {

				System.out.println(parser.getCurrentToken());
				
				
				String fieldName = parser.getCurrentName();
				System.out.println(fieldName + "\n\n");
				
				if ("Student".equals(fieldName)) {
					while (parser.nextToken() != JsonToken.END_OBJECT) {
						String nameField = parser.getCurrentName();
						parser.nextToken();
						
						if (nameField.equals("name"))
							System.out.println("name: " + parser.getValueAsString());
					}
				}
				
				parser.nextToken();

				// if(!token.equals(JsonToken.START_OBJECT) &&
				// !token.equals(JsonToken.END_OBJECT))
				// System.out.println(parser.getCurrentName()+ ": "+parser.getValueAsString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
