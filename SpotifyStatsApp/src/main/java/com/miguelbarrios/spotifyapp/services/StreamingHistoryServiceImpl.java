package com.miguelbarrios.spotifyapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.entities.Artist;
import com.miguelbarrios.spotifyapp.entities.StreamingHistory;
import com.miguelbarrios.spotifyapp.entities.StreamingRecord;
import com.miguelbarrios.spotifyapp.repositories.ArtistRepository;
import com.miguelbarrios.spotifyapp.repositories.StreamingHistoryRepository;
import com.miguelbarrios.spotifyapp.repositories.UserRepository;

@Service
public class StreamingHistoryServiceImpl implements StreamingHistoryService {

	@Autowired
	private StreamingHistoryRepository historyRepo;
	
	@Autowired 
	private ArtistRepository artistRepo;
	
	@Autowired 
	private UserRepository userRepo;
	
	@Override
	public StreamingHistory findById(int id) {
	
		Optional<StreamingHistory> option = historyRepo.findById(id);
		
		return option.isPresent() ? option.get() : null;
	}
	
	@Override
	public List<StreamingHistory> uploadStreamingHistory(List<StreamingRecord> history) {
		StreamingRecord cur = history.get(2);
		
		return null;
	}
}
