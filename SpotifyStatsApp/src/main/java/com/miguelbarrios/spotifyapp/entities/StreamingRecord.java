package com.miguelbarrios.spotifyapp.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StreamingRecord {
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime endTime;
	
	private String trackName;
	
	private long msPlayed;
	
	private String artistName;
	
	public StreamingRecord() {}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public long getMsPlayed() {
		return msPlayed;
	}

	public void setMsPlayed(long msPlayed) {
		this.msPlayed = msPlayed;
	}



	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	@Override
	public String toString() {
		return "StreamingRecord [endTime=" + endTime + ", trackName=" + trackName + ", msPlayed=" + msPlayed
				+ ", artistName=" + artistName + "]";
	}
	
	
	
	
}
