package demoapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value{

	@JsonProperty("quote")
	private String quote;

	@JsonProperty("id")
	private int id;

	public String getQuote(){
		return quote;
	}

	public int getId(){
		return id;
	}
}