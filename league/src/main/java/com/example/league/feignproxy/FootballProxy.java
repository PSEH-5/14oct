package com.example.league.feignproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url="${url}", name="football")
public interface FootballProxy {

	
	
	@RequestMapping(method = RequestMethod.GET, value ="/${getcountries.url}" ,consumes="application.json")
    String getCountries();

	
	@RequestMapping(method = RequestMethod.GET, value ="/${getleague.position.url}" )
    String getLeaguePosition(@PathVariable String leagueID);

  
	
}
