package com.miguelbarrios.spotifyapp;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.miguelbarrios.spotifyapp.entities.Album;
import com.miguelbarrios.spotifyapp.entities.Show;
import com.miguelbarrios.spotifyapp.entities.Track;

public class MusicStats {

	private List<Track> tracks;

	private List<Album> albums;

	private List<Show> shows;

	public MusicStats(List<Track> tracks, List<Album> albums, List<Show> shows) {
		this.tracks = tracks;
		this.albums = albums;
		this.shows = shows;
	}

	public Map<String, Integer> mostSongsByArtist() {

		Map<String, Integer> map = new TreeMap<>();
		for (Track track : tracks) {
			String artist = track.getArtist();
			if (!map.containsKey(artist)) {
				map.put(artist, 0);
			}

			map.put(artist, map.get(artist) + 1);
		}
		
		Map sortedMap = sortByValues(map);

		return sortedMap;

	}

	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
		Comparator<K> valueComparator = new Comparator<K>() {
			public int compare(K k1, K k2) {
				int compare = map.get(k2).compareTo(map.get(k1));
				if (compare == 0)
					return 1;
				else
					return compare;
			}
		};

		Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}

}
