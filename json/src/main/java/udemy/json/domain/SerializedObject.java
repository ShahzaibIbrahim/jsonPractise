package udemy.json.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import udemy.json.serializer.*;

@JsonSerialize(using=CustomSerializer.class)
@JsonDeserialize(using=CustomDeserializer.class)
public class SerializedObject {
	
	private int id;
	private String key1;
	private String key2;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKey1() {
		return key1;
	}
	public void setKey1(String key1) {
		this.key1 = key1;
	}
	public String getKey2() {
		return key2;
	}
	public void setKey2(String key2) {
		this.key2 = key2;
	}
	
	
	@Override
	public String toString() {
		return "JsonObject [id=" + id + ", key1=" + key1 + ", key2=" + key2 + "]";
	}
	

}
