package com.example.league.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.league.feignproxy.FootballProxy;

@Component
public class FootballService {

	@Autowired
	FootballProxy proxy;
	
	
	public String getPosition(String leagueID)
	{
		return proxy.getLeaguePosition(leagueID);
	}
	
}
