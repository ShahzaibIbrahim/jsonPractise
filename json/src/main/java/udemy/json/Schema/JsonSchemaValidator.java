package udemy.json.Schema;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonschema.main.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import udemy.json.domain.SchemaDomain;
import udemy.json.main.ReadMain;

public class JsonSchemaValidator {
	public static void main(String[] args) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();

		SchemaDomain dom = new SchemaDomain("", "Shahzaib", true);

		try {
			SchemaFactoryWrapper wrapper = new SchemaFactoryWrapper();

			// objectMapper.acceptJsonFormatVisitor(objectMapper.constructType(SchemaDomain.class),
			// wrapper);
			// JsonSchema schema = wrapper.finalSchema();

			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dom));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			URL resource = ReadMain.class.getClassLoader().getResource("ValidationSchema.JSON");

			if (resource == null) {
				throw new IllegalArgumentException("file not found!");
			}

			JsonNode node = objectMapper.readTree(resource);
			
			JsonSchemaFactory factory = JsonSchemaFactory.newBuilder().freeze();
			JsonSchema schema = factory.getJsonSchema(node);
					
			URL actualFile = ReadMain.class.getClassLoader().getResource("MapJsonRead5.JSON");
			
			JsonNode validate = objectMapper.readTree(actualFile);
			
			System.out.println(schema.validInstance(validate));

					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
