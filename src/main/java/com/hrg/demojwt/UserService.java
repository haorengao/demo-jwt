package com.hrg.demojwt;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public User findUserById(String userId) {
		
		User user = new User("1","hrg", "123456");
		
		return user;
	}

	public User findByUsername(User user) {
		
		return new User("1","hrg", "123456");
	}

}
