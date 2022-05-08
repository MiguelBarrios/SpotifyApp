package com.miguelbarrios.spotifyapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.entities.Artist;
import com.miguelbarrios.spotifyapp.repositories.ArtistRepository;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	private ArtistRepository artistRepo;
	
	@Override
	public Artist findByUsername(String username){
		Optional<Artist> option = artistRepo.findById(username);
		return option.isPresent() ? option.get() : null;
	}
}
