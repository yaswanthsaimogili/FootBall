package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public boolean sigin(User user) {
		User user1= userRepository.getByUserName(user.getUserName());
		if(user1.getPassword().equals(user1.getPassword())) {
			return true;
		}
		else {
			return false;
		}
	}
	public User registerUser(User user) {
		String k=user.getUserName();
		for(User user1:userRepository.findAll()) {
			if(user1.getUserName().equals(k)) {
				//TODO Exception
				return null;
			}
		}
		return userRepository.save(user);
	}
	
	
}
