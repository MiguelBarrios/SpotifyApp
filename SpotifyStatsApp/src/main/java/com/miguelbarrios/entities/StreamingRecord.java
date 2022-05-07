package com.miguelbarrios.entities;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StreamingRecord { //2021-04-15 13:46
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime endTime;
	
	private String artistName;
	
	private String trackName;
	
	private long msPlayed;
	
	public StreamingRecord() {}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
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

	public long getMsPlayed() {
		return msPlayed;
	}

	public void setMsPlayed(long msPlayed) {
		this.msPlayed = msPlayed;
	}

	@Override
	public String toString() {
		return "StreamingRecord [endTime=" + endTime + ", artistName=" + artistName + ", trackName=" + trackName
				+ ", msPlayed=" + msPlayed + "]";
	}
	
	
	
	
	
}
//{
//    "endTime" : "2021-04-15 13:46",
//    "artistName" : "Mike Posner",
//    "trackName" : "I Took A Pill In Ibiza - Seeb Remix",
//    "msPlayed" : 128912
//  }