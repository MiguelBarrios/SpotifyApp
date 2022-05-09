package com.miguelbarrios.spotifyapp.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.spotifyapp.entities.PlayBackRecord;
import com.miguelbarrios.spotifyapp.entities.StreamingHistory;
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
		return res.subList(res.size() - (n + 1), res.size());
		
	}
	
	@Override
	public List<Object[]> getMostListenToItems(int n) {
		List<Object[]> res = repo.getMostListenToItems();
		for(Object[] cur : res) {
			System.out.println(Arrays.toString(cur));
		}
		return res.subList(res.size() - (n + 1), res.size());
	}
	
	@Override
	public void mostRepeatedPlayback(long threshold) {

		List<Object[]> records = repo.playBackTotalBySong(threshold);
		for(Object[] arr : records) {
			System.out.println(Arrays.toString(arr));
		}
//		List<PlayBackRecord> results = new ArrayList<>();
//		List<StreamingHistory> history = repo.findAll();
//		String prevTrackName = history.get(0).getTrackName();
//		String prevTrackArtist = history.get(0).getArtist().getArtistName();
//		LocalDateTime prevPlaybackDate = history.get(0).getEndTime();
//		int playbacks = 0;
//		for(int i = 1; i < history.size(); ++i) {
//			StreamingHistory record = history.get(i);
//			String curTrackName = record.getTrackName();
//			String curTrackArtist = record.getArtist().getArtistName();
//			LocalDateTime curPlayBackDate = record.getEndTime();
//			if(prevTrackName.equals(curTrackName)) {
//				if(prevTrackArtist.equals(curTrackArtist)) {
//					++playbacks;
//				}
//			}
//			else {
//				if(playbacks > 2) {
//					PlayBackRecord res = new PlayBackRecord(prevTrackName, prevTrackArtist,playbacks, prevPlaybackDate);
//					results.add(res);
//				}
//				
//				playbacks = 1;
//				prevTrackName = curTrackName;
//				prevTrackArtist = curTrackArtist; 
//				prevPlaybackDate = curPlayBackDate;
//				
//			}
//		}
//		
//		results.forEach(System.out::println);
	}
	
	
	
}
