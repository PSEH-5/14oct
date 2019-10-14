package com.example.league.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.league.service.FootballService;

@Controller
public class DefaultController {

	@Autowired
	FootballService service;
	
	@GetMapping("/")
	public String defaultGet() {
		
		return "home";
	}
	
	@GetMapping("/{leagueID}")
	public String defaultGet(@PathVariable String leagueID) {
		
		return service.getPosition(leagueID);
	}
	
	
}
