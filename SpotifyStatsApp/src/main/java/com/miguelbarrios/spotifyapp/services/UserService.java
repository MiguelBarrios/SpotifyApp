package com.miguelbarrios.spotifyapp.services;

import com.miguelbarrios.spotifyapp.entities.User;

public interface UserService {

	User findByUserName(String username);

}
