package com.miguelbarrios.spotifyapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artist {
	
	@Id
	private String name;
	
	public Artist() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Artist [name=" + name + "]";
	}
	
	
}
