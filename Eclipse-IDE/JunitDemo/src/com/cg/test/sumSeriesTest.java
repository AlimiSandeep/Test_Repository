package com.cg.test;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.cg.service.CalcSeries;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@RunWith(JUnitPlatform.class)
public class sumSeriesTest {

	
	static CalcSeries ser;
	@BeforeAll
	public static void beforeAll()
	{
		ser=new CalcSeries();
	}
	
	
	@AfterAll
	public static void afterAll()
	{
		ser=null;
	}
	
	
	@Test
		public void sumSeriesTest1()
		{
			assertTimeout(Duration.ofMillis(10), ()->{ser.sumSeries(100000000);});
		}

}
