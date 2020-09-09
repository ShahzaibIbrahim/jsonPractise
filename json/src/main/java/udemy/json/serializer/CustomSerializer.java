package udemy.json.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import udemy.json.domain.SerializedObject;

public class CustomSerializer extends JsonSerializer<SerializedObject> {

	@Override
	public void serialize(SerializedObject value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException {

		gen.setPrettyPrinter(new DefaultPrettyPrinter());

		gen.writeStartObject();

		gen.writeFieldName("Custom Serialize");
		gen.writeString("Udemy Json");

		gen.writeStringField("key 1", value.getKey1());
		gen.writeStringField("key 2", value.getKey2());
		gen.writeStringField("id", "" + value.getId());

		gen.writeEndObject();
	}

}
