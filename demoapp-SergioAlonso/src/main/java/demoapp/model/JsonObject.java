package demoapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonObject{

	@JsonProperty("type")
	private String type;

	@JsonProperty("value")
	private Value value;

	public String getType(){
		return type;
	}

	public Value getValue(){
		return value;
	}
}