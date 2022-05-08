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
	public List<Object[]> getMostListenToArtists(int n) {
		List<Object[]> res = repo.getMostListenToArtists();
		for(Object[] cur : res) {
			System.out.println(Arrays.toString(cur));
		}
		return res;
		
	}
	
	@Override
	public List<Object[]> getMostListenToItems(int n) {
		List<Object[]> res = repo.getMostListenToItems();
		for(Object[] cur : res) {
			System.out.println(Arrays.toString(cur));
		}
		return res.subList(res.size() - (n + 1), res.size());
	}
	
	
	
}
