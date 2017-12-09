package guru.springframework.springrestclientexamples.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Name implements Serializable{
	
	private String title;
	private String first;
	private String last;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
