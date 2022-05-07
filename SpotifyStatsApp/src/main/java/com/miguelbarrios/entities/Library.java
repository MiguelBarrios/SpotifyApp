package com.miguelbarrios.entities;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Library {
	
	
	private Map<String,List<String>> tracks; 
	
	
	public Library() {}


	public Map<String, List<String>> getTracks() {
		return tracks;
	}


	public void setTracks(Map<String, List<String>> tracks) {
		this.tracks = tracks;
	}


	@Override
	public String toString() {
		return "Library [tracks=" + tracks + "]";
	}


	
	


	
	
}
