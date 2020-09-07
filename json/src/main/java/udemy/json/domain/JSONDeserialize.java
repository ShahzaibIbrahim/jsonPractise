package udemy.json.domain;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class JSONDeserialize extends JsonDeserializer<JsonObject>{

	@Override
	public JsonObject deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		
		
		ObjectCodec codec = p.getCodec();
		JsonNode root = codec.readTree(p);
		
		
		JsonObject obj = new JsonObject();
		obj.setId(root.get("id").asInt());
		obj.setKey1(root.get("key 1").asText());
		obj.setKey2(root.get("key 2").asText());
		
		
		return obj;
	}

}
