package com.miguelbarrios.spotifyapp.services;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.entities.Artist;
import com.miguelbarrios.spotifyapp.repositories.ArtistRepository;

@Service
public class ArtistServiceImpl implements ArtistService {

	@Autowired
	private ArtistRepository artistRepo;
	
	@Override
	public Artist findByName(String name) {
		Artist artist = artistRepo.findByArtistName(name);
		return artist;
	}
	
	@Override
	public Artist save(Artist artist) {
		return artistRepo.saveAndFlush(artist);
	}
	
	@Override
	public List<Artist> saveAll(Collection<Artist> artists){
		return artistRepo.saveAllAndFlush(artists);
	}
}
