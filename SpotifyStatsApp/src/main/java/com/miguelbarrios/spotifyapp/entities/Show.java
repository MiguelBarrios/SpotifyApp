package com.miguelbarrios.spotifyapp.entities;

public class Show {
	
	private String name;
	
	private String publisher;
	
	private String uri;
	
	public Show() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	public String toString() {
		return "Show [name=" + name + ", publisher=" + publisher + ", uri=" + uri + "]";
	}
	
	
}
