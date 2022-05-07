package com.miguelbarrios.spotifyapp.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;

@Entity
@Table(name="streaming_history")
public class StreamingHistory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="end_time")
	private LocalDateTime endTime;
	
	@Column(name="track_name")
	private String trackName;
	
	@Column(name="ms_played")
	private long msPlayed;
	
	@ManyToOne
	@JoinColumn(name="artist_name")
	private Artist artist;
	
	@ManyToOne
	@JoinColumn(name="user_username")
	private User user;
	
	public StreamingHistory() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "StreamingHistory [id=" + id + ", endTime=" + endTime + ", trackName=" + trackName + ", msPlayed="
				+ msPlayed + "]";
	}
	
	
}
