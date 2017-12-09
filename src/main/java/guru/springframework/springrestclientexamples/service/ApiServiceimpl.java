package guru.springframework.springrestclientexamples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import guru.springframework.springrestclientexamples.domain.User;
import guru.springframework.springrestclientexamples.domain.UserData;


@Service
public class ApiServiceimpl implements ApiService {
	
	private RestTemplate restTemplate;
	private final String api_url;
	
	public ApiServiceimpl(RestTemplate restTemplate, @Value("${api.url}") String api_url) {
		super();
		this.restTemplate = restTemplate;
		this.api_url = api_url;
	}

	@Override
	public List<User> getUserList(Integer limit) {
		UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
				.fromUriString(api_url)
				.queryParam("limit", limit);
		
		// url + limit ,UserData class is the object
		UserData userData = restTemplate.getForObject(uriComponentsBuilder.toUriString(), UserData.class);
		return userData.getData();
	}

	

}
