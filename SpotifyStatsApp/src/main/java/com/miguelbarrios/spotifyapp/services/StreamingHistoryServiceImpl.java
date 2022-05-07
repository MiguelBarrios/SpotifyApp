package com.miguelbarrios.spotifyapp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.entities.StreamingHistory;
import com.miguelbarrios.spotifyapp.repositories.StreamingHistoryRepository;

@Service
public class StreamingHistoryServiceImpl implements StreamingHistoryService {

	@Autowired
	private StreamingHistoryRepository historyRepo;
	
	@Override
	public StreamingHistory findById(int id) {
	
		Optional<StreamingHistory> option = historyRepo.findById(id);
		
		return option.isPresent() ? option.get() : null;
	}
}
