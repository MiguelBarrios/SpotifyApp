package com.miguelbarrios.spotifyapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.entities.Artist;
import com.miguelbarrios.spotifyapp.repositories.ArtistRepository;

public interface ArtistService {

	Artist findByUsername(String username);
	
}
