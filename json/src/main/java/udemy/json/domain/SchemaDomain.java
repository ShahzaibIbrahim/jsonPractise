package udemy.json.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

public class SchemaDomain {

	@JsonProperty(required= true)
	@JsonPropertyDescription("Required")
	private String id;

	@JsonProperty(required= true)
	@JsonPropertyDescription("Required")
	private String name;
	

	@JsonProperty(required= true)
	@JsonPropertyDescription("Required")
	private String grade;
	

	@JsonProperty(required= true)
	@JsonPropertyDescription("Required")
	private boolean enabled;
	
	
	
	public SchemaDomain(String id, String name,  boolean enabled) {
		super();
		this.id = id;
		this.name = name;
		this.enabled = enabled;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	
}
