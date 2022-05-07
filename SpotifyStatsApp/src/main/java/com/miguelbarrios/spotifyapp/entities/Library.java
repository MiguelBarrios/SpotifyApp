package com.miguelbarrios.spotifyapp.entities;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Library {
	
	
	private Map<String,List<Track>> tracks; 
	
	private Map<String, List<Object>> albums;
	
	private Map<String, List<Object>> shows;
	
	private Map<String, List<Object>> episodes;
	
	private Map<String, List<Object>> bannedTracks;
	
	private Map<String, List<Object>> artists;
	
	private Map<String, List<Object>> bannedArtists;
	
	private Map<String, List<Object>> other;
	
	public Library() {}

	public Map<String, List<Track>> getTracks() {
		return tracks;
	}

	public void setTracks(Map<String, List<Track>> tracks) {
		this.tracks = tracks;
	}

	public Map<String, List<Object>> getAlbums() {
		return albums;
	}

	public void setAlbums(Map<String, List<Object>> albums) {
		this.albums = albums;
	}

	public Map<String, List<Object>> getShows() {
		return shows;
	}

	public void setShows(Map<String, List<Object>> shows) {
		this.shows = shows;
	}

	public Map<String, List<Object>> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(Map<String, List<Object>> episodes) {
		this.episodes = episodes;
	}

	public Map<String, List<Object>> getBannedTracks() {
		return bannedTracks;
	}

	public void setBannedTracks(Map<String, List<Object>> bannedTracks) {
		this.bannedTracks = bannedTracks;
	}

	public Map<String, List<Object>> getArtists() {
		return artists;
	}

	public void setArtists(Map<String, List<Object>> artists) {
		this.artists = artists;
	}

	public Map<String, List<Object>> getBannedArtists() {
		return bannedArtists;
	}

	public void setBannedArtists(Map<String, List<Object>> bannedArtists) {
		this.bannedArtists = bannedArtists;
	}

	public Map<String, List<Object>> getOther() {
		return other;
	}

	public void setOther(Map<String, List<Object>> other) {
		this.other = other;
	}

	@Override
	public String toString() {
		return "Library [tracks=" + tracks + ", albums=" + albums + ", shows=" + shows + ", episodes=" + episodes
				+ ", bannedTracks=" + bannedTracks + ", artists=" + artists + ", bannedArtists=" + bannedArtists
				+ ", other=" + other + "]";
	}
}
