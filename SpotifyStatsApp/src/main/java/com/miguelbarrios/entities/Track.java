package com.miguelbarrios.entities;

public class Track {
	
	private String artist;
	
	private String album;
	
	private String track;
	
	private String uri;
	
	public Track() {}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}


	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "Track [artist=" + artist + ", album=" + album + ", track=" + track + ", uri=" + uri + "]";
	}


}
