package com.miguelbarrios.spotifyapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miguelbarrios.spotifyapp.entities.StreamingHistory;

public interface StreamingHistoryRepository extends JpaRepository<StreamingHistory, Integer>{

}
