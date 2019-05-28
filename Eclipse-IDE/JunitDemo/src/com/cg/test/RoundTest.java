package com.cg.test;

import com.cg.service.CalcSeries;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@DisplayName("TestRound2decimalPlaces")
@TestInstance(Lifecycle.PER_CLASS)
public class RoundTest {
	static CalcSeries ser;
	public RoundTest() {
System.out.println("RoundTest Constructor");
}

	@BeforeAll
	public static void beforeAll()
	{
		ser=new CalcSeries();
		System.out.println("@BeforeAll");
	}
	
	@AfterAll
	public static void afterAll()
	{
		ser=null;
		System.out.println("@AfterAll");
	}
	
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("@BeforeEach");
	}
	
	@AfterEach
	public void afterEach()
	{
		System.out.println("@AfterEach");
	}
	
	
	
	
	@Test
	@DisplayName("Test Round to 2 Decimal Places")
	public void roundTest1()
	{
	
		//	CalcSeries ser=new CalcSeries();
		System.out.println("RoundTest-1");
			double expected=56.84;
			assertEquals(expected,ser.round2NdecPlaces(56.83976, 2));
		
	}
	@Test
	@DisplayName("Test Round to 3 Decimal Places")
	public void roundTest2()
	{
	
		//	CalcSeries ser=new CalcSeries();
		System.out.println("RoundTest-2");
			double expected=56.840;
			assertEquals(expected,ser.round2NdecPlaces(56.83976,3));
		
	}
	@Test
	@Disabled
	@DisplayName("Test Round to 2 Decimal Places")
	
	public void roundTest3()
	{
	
			//CalcSeries ser=new CalcSeries();
		System.out.println("RoundTest-3");
			double expected=56.83;
			assertEquals(expected,ser.round2NdecPlaces(56.83323, 2));
		
	}
	@Test
	@DisplayName("Test Round to 1 Decimal Places")
	public void roundTest4()
	{
	
			//CalcSeries ser=new CalcSeries();
		System.out.println("RoundTest-4");
			double expected=56.8;
			assertEquals(expected,ser.round2NdecPlaces(56.8333, 1));
		
	}
	@Test
	@DisplayName("Test Round to 0 Decimal Places")
	public void roundTest5()
	{
	
		//	CalcSeries ser=new CalcSeries();
		System.out.println("RoundTest-5");
			double expected=57;
			assertEquals(expected,ser.round2NdecPlaces(56.83333, 0));
		
	}
}
