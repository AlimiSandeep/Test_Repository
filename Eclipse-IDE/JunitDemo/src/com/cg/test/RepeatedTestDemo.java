package com.cg.test;

import com.cg.service.CalcSeries;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
public class RepeatedTestDemo {
	
	
@RepeatedTest(3)
public void testCalcSeries()
{
	CalcSeries ser=new CalcSeries();
	double actual=ser.calcSeries(100000, 100000, 50000000);
	assertEquals(25100000.0, actual);
}
}
