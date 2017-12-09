package guru.springframework.springrestclientexamples.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6240612822572531792L;
	private String street;
	private String city;
	private String state;
	private String postcode;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
