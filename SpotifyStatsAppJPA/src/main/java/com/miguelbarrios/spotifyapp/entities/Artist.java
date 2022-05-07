package com.miguelbarrios.spotifyapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {
	
	@Id
	@Column(name="name")
	private String artistName;
	
	public Artist() {}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	@Override
	public String toString() {
		return "Artist [artistName=" + artistName + "]";
	}

	
	
	
	
}
