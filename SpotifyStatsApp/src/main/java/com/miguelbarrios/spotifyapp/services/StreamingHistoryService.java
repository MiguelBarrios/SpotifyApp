package com.miguelbarrios.spotifyapp.services;

import java.util.List;

import com.miguelbarrios.spotifyapp.entities.StreamingHistory;
import com.miguelbarrios.spotifyapp.entities.StreamingRecord;
import com.miguelbarrios.spotifyapp.entities.User;

public interface StreamingHistoryService {

	StreamingHistory findById(int id);

	boolean uploadStreamingHistory(List<StreamingRecord> history, User user);

}
