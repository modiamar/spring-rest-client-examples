package guru.springframework.springrestclientexamples.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Billings implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -3445219813729685325L;
	
	
	private Card card;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}