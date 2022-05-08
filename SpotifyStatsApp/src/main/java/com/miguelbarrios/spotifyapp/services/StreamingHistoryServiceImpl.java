package com.miguelbarrios.spotifyapp.services;

import java.util.ArrayList;
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
		
		List<StreamingHistory> finRecords = new ArrayList<>();
		System.out.println("***Saving artists");
		for(StreamingRecord record : history) {
			Artist artist = artistService.findByUsername(record.getArtistName());
			if(artist == null) {
				Artist tmp = new Artist();
				tmp.setArtistName(record.getArtistName());
				artist = artistService.save(tmp);
			}
		
			StreamingHistory streaminghistoryRecord = new StreamingHistory();
			streaminghistoryRecord.setArtist(artist);
			streaminghistoryRecord.setUser(user);
			streaminghistoryRecord.setEndTime(record.getEndTime());
			streaminghistoryRecord.setMsPlayed(record.getMsPlayed());
			streaminghistoryRecord.setTrackName(record.getTrackName());			
			finRecords.add(streaminghistoryRecord);
		}
		
		System.out.println("*** Saving records");
		historyRepo.saveAllAndFlush(finRecords);

		
		
		return finRecords;
	}
}
