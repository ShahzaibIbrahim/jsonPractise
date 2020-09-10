package udemy.json.main;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.Student;

public class WriteStreamingApiMain {

	public static void main(String[] args) {

		try {
			ObjectMapper obj = new ObjectMapper();
			
			JsonFactory factory = new JsonFactory();
			
			JsonGenerator jsonGenerator = factory.createGenerator(System.out);
			
			jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
			jsonGenerator.setCodec(obj);
			
			jsonGenerator.writeStartObject();
			
			jsonGenerator.writeStringField("Name", "Shahzaib");
			
			Student std = new Student();
			std.setId(1); std.setName("Rayyan"); std.setLastname("Kashif");
			
			
			jsonGenerator.writeObjectField("Student", std);
			
			
			jsonGenerator.writeEndObject();
			
			jsonGenerator.close();
			

		} catch (Exception e) {

		}
	}

}
