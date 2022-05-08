package com.miguelbarrios.spotifyapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.entities.User;
import com.miguelbarrios.spotifyapp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public User findByUserName(String username) {
		Optional<User> user = userRepo.findById(username);
		return user.isPresent() ? user.get() : null;
	}
	
}
