package com.miguelbarrios.spotifyapp.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.entities.Artist;
import com.miguelbarrios.spotifyapp.repositories.ArtistRepository;

public interface ArtistService {

	Artist save(Artist artist);

	Artist findByName(String name);

	List<Artist> saveAll(Collection<Artist> artists);
	
}
