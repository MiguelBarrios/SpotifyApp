package com.miguelbarrios.spotifyapp.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Utilities {

	public static List<String> toJson(List<Object> list, ObjectMapper mapper){
	
		return list.stream().map((n) -> {
			try {
				return mapper.writeValueAsString(n);
			} catch (JsonProcessingException e1) 
			{ 
				e1.printStackTrace(); 
			}
			return "";
		}).collect(Collectors.toList());
	}
	
//	public static <T> void fetchObjectList(Class<T> classType) {
//		List<Track> tracks = tracksJson.stream().map((n) -> {
//			try {
//				return objectMapper.readValue(n, Track.class);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} 
//			return null;
//		}).collect(Collectors.toList());
//		   
//	}
	
	public static <T> List<T> convert(Class<T> classType, List<Object> list, ObjectMapper mapper) {
				
		List<T> items = new ArrayList<>();
		for(Object obj : list) {
			try {
				String json = mapper.writeValueAsString(obj);
				T item = mapper.readValue(json, classType);
				items.add(item);
				
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		
		return items;
	}
}
