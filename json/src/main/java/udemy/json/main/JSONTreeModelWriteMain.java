package udemy.json.main;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


public class JSONTreeModelWriteMain {

	public static void main(String[] args) throws JsonProcessingException {
		
		ObjectMapper obj = new ObjectMapper();

		URL resource = JSONMainRead.class.getClassLoader().getResource("MapJsonRead.JSON");

		if (resource == null) {
			throw new IllegalArgumentException("file not found!");
		}

		JsonNode root = null;
		try {
			root = obj.readTree(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((ObjectNode) root).remove("name");
		
		System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(root));
		
	}
		
	

}
