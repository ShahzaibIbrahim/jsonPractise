package udemy.json.domain;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class UdemyJsonSerializer extends JsonSerializer<JsonObject>{

	@Override
	public void serialize(JsonObject value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		
		gen.setPrettyPrinter(new DefaultPrettyPrinter());
		
		gen.writeStartObject();
		
		gen.writeFieldName("Custom Serialize");
		gen.writeString("Udemy Json");

		gen.writeStringField("key 1", value.getKey1());
		gen.writeStringField("key 2", value.getKey2());
		gen.writeStringField("id", ""+ value.getId());
		
		gen.writeEndObject();
	}

}
