package guru.springframework.springrestclientexamples.service;

import java.util.List;

import guru.springframework.springrestclientexamples.domain.User;

public interface ApiService {

	public List<User> getUserList(Integer limit);
	
}
