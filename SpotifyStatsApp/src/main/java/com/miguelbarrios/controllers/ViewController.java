package com.miguelbarrios.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping(path = { "/", "home.do" })
	public String home() {
		return "index";
	}
}
