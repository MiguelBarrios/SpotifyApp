package com.miguelbarrios.spotifyapp.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.repositories.StreamingHistoryRepository;

@Service
public class StatisticsServiceImpl implements StatisticsService {

	@Autowired
	private StreamingHistoryRepository repo;
	
	@Override
	public void getTotalTimeOnSpotify() {
		List<Object[]> res = repo.getMostListenTo();
		for(Object[] cur : res) {
			System.out.println(Arrays.toString(cur));
		}
		
	}
	
	public void getTop25Artist() {
		
	}
	
}
