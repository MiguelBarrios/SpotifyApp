package com.miguelbarrios.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguelbarrios.entities.StreamingRecord;

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
}
