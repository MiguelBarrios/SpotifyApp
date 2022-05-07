package com.miguelbarrios.spotifyapp.entities;

public class Album {
	private String artist;
	
	private String album;
	
	private String uri;
	
	public Album() {}

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

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "Album [artist=" + artist + ", album=" + album + ", uri=" + uri + "]";
	}
	
	
}
