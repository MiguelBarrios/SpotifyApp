package com.miguelbarrios.spotifyapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.entities.Artist;
import com.miguelbarrios.spotifyapp.entities.StreamingHistory;
import com.miguelbarrios.spotifyapp.entities.StreamingRecord;
import com.miguelbarrios.spotifyapp.entities.User;
import com.miguelbarrios.spotifyapp.repositories.StreamingHistoryRepository;

@Service
public class StreamingHistoryServiceImpl implements StreamingHistoryService {

	@Autowired
	private StreamingHistoryRepository historyRepo;
	
	@Autowired
	private ArtistService artistService;
	
	@Autowired
	private UserService userService;
	
	@Override
	public StreamingHistory findById(int id) {
	
		Optional<StreamingHistory> option = historyRepo.findById(id);
		
		return option.isPresent() ? option.get() : null;
	}
	
	@Override
	public List<StreamingHistory> uploadStreamingHistory(List<StreamingRecord> history, User user) {
		StreamingRecord cur = history.get(2);
		Artist artist = artistService.findByUsername(cur.getArtistName());
		StreamingHistory record = new StreamingHistory();
		record.setArtist(artist);
		record.setUser(user);
		record.setEndTime(cur.getEndTime());
		record.setMsPlayed(cur.getMsPlayed());
		record.setTrackName(cur.getTrackName());
		System.out.println(record);
		
		return null;
	}
}
