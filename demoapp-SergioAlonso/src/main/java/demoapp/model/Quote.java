package demoapp.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	@JsonProperty("value")
	private String value;

	@JsonProperty("url")
	private String url;

	public String getValue(){
		return value;
	}

	public String getUrl(){
		return url;
	}
}