package com.miguelbarrios.spotifyapp.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class PlayBackRecord {
	
	private String artistName;
	
	private String trackName;
	
	private Integer count;
	
	private LocalDateTime date;

	public PlayBackRecord(String artistName, String trackName, Integer count, LocalDateTime date) {
		super();
		this.artistName = artistName;
		this.trackName = trackName;
		this.count = count;
		this.date = date;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artistName, trackName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayBackRecord other = (PlayBackRecord) obj;
		return Objects.equals(artistName, other.artistName) && Objects.equals(trackName, other.trackName);
	}

	@Override
	public String toString() {
		return "PlayBackRecord [artistName=" + artistName + ", trackName=" + trackName + ", count=" + count + ", date="
				+ date + "]";
	}


	

}
