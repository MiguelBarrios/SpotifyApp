package com.miguelbarrios.spotifyapp.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.miguelbarrios.spotifyapp.MusicStats;
import com.miguelbarrios.spotifyapp.entities.Album;
import com.miguelbarrios.spotifyapp.entities.Show;
import com.miguelbarrios.spotifyapp.entities.StreamingRecord;
import com.miguelbarrios.spotifyapp.entities.Track;
import com.miguelbarrios.spotifyapp.entities.User;
import com.miguelbarrios.spotifyapp.services.StatisticsService;
import com.miguelbarrios.spotifyapp.services.StreamingHistoryService;
import com.miguelbarrios.spotifyapp.services.UserService;
import com.miguelbarrios.spotifyapp.utilities.Utilities;

@RestController
@RequestMapping("api")
public class DataController {
	
	@Autowired
	private StreamingHistoryService historyService;
	
	@Autowired 
	private StatisticsService statsService;
	
	@Autowired 
	private UserService userService;

	@GetMapping("ping")
	public  String test() {
		return "success test";
	}
	
	//TODO: tmp
	@GetMapping("stats")
	public void genStats() {
		User user = userService.findByUserName("lochnessbarrios");
		statsService.getTotalTimeOnSpotify();

	}
	
	
	@GetMapping("uploadstreaminghistory")
	public void upload(@RequestBody List<StreamingRecord> records, HttpServletResponse resp) {
		
		User user = userService.findByUserName("lochnessbarrios");
		boolean didUpload = historyService.uploadStreamingHistory(records, user);
		if(!didUpload) {
			resp.setStatus(400);
		}

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
