package udemy.json.Schema;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;

import udemy.json.domain.SchemaDomain;

public class JsonSchemaCreator {

	public static void main(String[] args) throws IOException {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			SchemaFactoryWrapper wrapper = new SchemaFactoryWrapper();
			
			objectMapper.acceptJsonFormatVisitor(objectMapper.constructType(SchemaDomain.class), wrapper);
			com.fasterxml.jackson.module.jsonSchema.JsonSchema schema = wrapper.finalSchema();
			schema.set$schema("http://json-schema.org/draft-03/schema#");
			
			
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
