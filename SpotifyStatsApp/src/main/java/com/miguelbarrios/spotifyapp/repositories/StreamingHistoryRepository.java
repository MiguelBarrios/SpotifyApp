package com.miguelbarrios.spotifyapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.miguelbarrios.spotifyapp.entities.StreamingHistory;

public interface StreamingHistoryRepository extends JpaRepository<StreamingHistory, Integer>{
	
	@Query("SELECT SUM(sh.msPlayed), sh.artist.artistName FROM StreamingHistory sh GROUP BY sh.artist.artistName" +
	       " ORDER BY SUM(sh.msPlayed)")
	List<Object[]> getMostListenTo();

}
