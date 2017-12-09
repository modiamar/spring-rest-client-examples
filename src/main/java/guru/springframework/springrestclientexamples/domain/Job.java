package guru.springframework.springrestclientexamples.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Job implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9175701638802828072L;
	private String title;
	private String company;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
