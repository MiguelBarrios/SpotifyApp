package com.miguelbarrios.spotifyapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.miguelbarrios.spotifyapp.entities.StreamingHistory;

public interface StreamingHistoryRepository extends JpaRepository<StreamingHistory, Integer>{
	
	@Query("SELECT SUM(sh.msPlayed), sh.artist.artistName FROM StreamingHistory sh " + 
	       "GROUP BY sh.artist.artistName " +
	       "ORDER BY SUM(sh.msPlayed)")
	List<Object[]> getMostListenToArtists();
	
	@Query("SELECT SUM(sh.msPlayed), sh.artist.artistName, sh.trackName FROM StreamingHistory sh " + 
		       "GROUP BY sh.trackName " +
		       "ORDER BY SUM(sh.msPlayed)")
	List<Object[]> getMostListenToItems();
	
	
	@Query("SELECT sh.trackName, sh.artist.artistName, COUNT(CONCAT(sh.trackName, sh.artist.artistName)), SUM(sh.msPlayed), sh.endTime " +
	        "FROM StreamingHistory sh "+ 
			"WHERE sh.msPlayed > :threshold " + 
			"GROUP BY CONCAT(sh.trackName, sh.artist.artistName)" + 
			"ORDER BY COUNT(CONCAT(sh.trackName, sh.artist.artistName))")
	List<Object[]> playBackTotalBySong( @Param("threshold") Long threshold);
	
	

}
