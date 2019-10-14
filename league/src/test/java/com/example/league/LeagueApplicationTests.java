package com.example.league;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.example.league.feignproxy.FootballProxy;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeagueApplicationTests {
	@Autowired
	FootballProxy proxy;
		
	@Test
	public void contextLoads() {
		Assert.isTrue(proxy!=null);
		String countries = proxy.getCountries();
		Assert.isTrue(countries.length()>20);
	}

	
}
