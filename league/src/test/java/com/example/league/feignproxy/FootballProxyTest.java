package com.example.league.feignproxy;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FootballProxyTest {

	@Autowired
	FootballProxy proxy;
		
	@Test
	public void contextLoads() {
		Assert.isTrue(proxy!=null);
//		String countries = proxy.getCountries();
//		Assert.isTrue(countries.length()>20);
	}
	
	
	@Test
	public void getLeaguePosition()
	{
		String position = proxy.getLeaguePosition("148");
		System.out.println("position "+ position);
		Assert.isTrue(position.length()>20);
		
	}
}
