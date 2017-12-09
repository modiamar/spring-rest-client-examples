package guru.springframework.springrestclientexamples.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.springrestclientexamples.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceimplTest {
	
	@Autowired
	private ApiService apiService;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetUsers() {
		List<User> userList = apiService.getUserList(3);
		assertEquals(4, userList.size());
		
	}

}
