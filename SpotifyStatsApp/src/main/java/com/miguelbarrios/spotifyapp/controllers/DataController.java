package com.miguelbarrios.spotifyapp.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.miguelbarrios.spotifyapp.entities.StreamingRecord;
import com.miguelbarrios.spotifyapp.entities.Track;
import com.miguelbarrios.spotifyapp.utilities.Utilities;

@RestController
@RequestMapping("api")
public class DataController {

	@GetMapping("ping")
	public  String test() {
		return "success test";
	}
	
	@GetMapping("streaminghistoryupload")
	public List<StreamingRecord> streamingHistUpload(@RequestBody List<StreamingRecord> records) {
		System.out.println(records);
		return records;
	}
	
	@GetMapping("dataupload")
	public String dataupload(@RequestBody Map<String, List<Object>> map) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		
		List<Track> tracks =  Utilities.convert(Track.class, map.get("tracks"), mapper);
		
		tracks.forEach(System.out::println);
		
//		//TODO: temporary workaround, come back and figure out how do with DI
//		List<String> tracksJson = Utilities.toJson(map.get("tracks"), mapper);
//		List<String> albumsJson = Utilities.toJson(map.get("albums"), mapper);
//
//		ObjectMapper objectMapper = new ObjectMapper();
//		
//		List<Track> tracks = tracksJson.stream().map((n) -> {
//			try {
//				return objectMapper.readValue(n, Track.class);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} 
//			return null;
//		}).collect(Collectors.toList());
//		
//		tracks.forEach(System.out::println);

		return "success";
	}
	

	
	@GetMapping("libraryupload")
	public String libraryUpload(@RequestBody Map<String, List<Object>>  map) {
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		List<Object> objects = map.get("tracks");
		objects.forEach(System.out::println);
		System.out.println(objects.size());
		

		
//		String json = map.get("tracks").toString();
//		System.out.println(json);
//		System.out.println("json: " + json);
//		ObjectMapper objectMapper = new ObjectMapper();
//		objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
//
//		try {
//			Track[] tracks = objectMapper.readValue(json, Track[].class);
//			System.out.println(tracks.length);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		return "success";
	}
}
