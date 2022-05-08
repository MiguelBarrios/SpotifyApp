package com.miguelbarrios.spotifyapp.services;

import java.util.List;

public interface StatisticsService {

	List<Object[]> getMostListenToArtists(int n);

	List<Object[]> getMostListenToItems(int n);

}
