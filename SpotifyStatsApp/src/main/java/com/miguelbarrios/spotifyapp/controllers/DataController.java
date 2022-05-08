package com.miguelbarrios.spotifyapp.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.miguelbarrios.spotifyapp.MusicStats;
import com.miguelbarrios.spotifyapp.entities.Album;
import com.miguelbarrios.spotifyapp.entities.Show;
import com.miguelbarrios.spotifyapp.entities.StreamingHistory;
import com.miguelbarrios.spotifyapp.entities.StreamingRecord;
import com.miguelbarrios.spotifyapp.entities.Track;
import com.miguelbarrios.spotifyapp.entities.User;
import com.miguelbarrios.spotifyapp.services.StreamingHistoryService;
import com.miguelbarrios.spotifyapp.services.UserService;
import com.miguelbarrios.spotifyapp.utilities.Utilities;

@RestController
@RequestMapping("api")
public class DataController {
	
	@Autowired
	private StreamingHistoryService historyService;
	
	@Autowired 
	private UserService userService;

	@GetMapping("ping")
	public  String test() {
		return "success test";
	}
	
	
	@GetMapping("uploadstreaminghistory")
	public List<StreamingHistory> upload(@RequestBody List<StreamingRecord> records) {
		
		User user = userService.findByUserName("lochnessbarrios");
		List<StreamingHistory> history = historyService.uploadStreamingHistory(records, user);
		return history;
	}
	
	
	@GetMapping("dataupload")
	public Map<String, Integer> dataupload(@RequestBody Map<String, List<Object>> map) {
		
		ObjectMapper mapper = new ObjectMapper();
	
		List<Track> tracks =  Utilities.convert(Track.class, map.get("tracks"), mapper);
		List<Album> albums =  Utilities.convert(Album.class, map.get("albums"), mapper);
		List<Show> shows = Utilities.convert(Show.class, map.get("shows"), mapper);
		
		MusicStats stats = new MusicStats(tracks, albums, shows);
		Map<String, Integer> numSongs = stats.mostSongsByArtist();
		

		return numSongs;
	}
	
}
