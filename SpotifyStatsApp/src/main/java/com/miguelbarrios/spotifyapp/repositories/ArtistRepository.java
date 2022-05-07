package com.miguelbarrios.spotifyapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miguelbarrios.spotifyapp.entities.Artist;

public interface ArtistRepository extends JpaRepository<Artist, String> {

}
