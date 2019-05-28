package com.cg.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import com.cg.service.CalcSeries;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeAll;

@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)
public class CalcSeriesTest {

	public CalcSeriesTest() {
		System.out.println("CalcSeries constructor");
	}

	private static CalcSeries ser;
	@BeforeAll
	public static void beforeAll()
	{
		ser=new CalcSeries();
	}
	
	@Test
	public void testCacl1() {
		//CalcSeries ser = new CalcSeries();
		assumeTrue(ser!=null);
		double expected = 10.0;
		assertEquals(expected, ser.calcSeries(5, 5, 10));
	}

	@Test
	public void testCacl2() {
		//CalcSeries ser = new CalcSeries();
		assumeTrue(ser!=null);
		double expected = 7.5;
		assertEquals(expected, ser.calcSeries(5, 5, 5));
	}

}
