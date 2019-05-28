package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.cg.service.CalcSeries;
import com.cg.service.Palindrome;

public class DynamicTestDemo {
static Palindrome ser=new Palindrome();
static CalcSeries ser2=new CalcSeries();

@TestFactory
Collection<DynamicTest> dynamicTestFromCollection()
{
	return Arrays.asList(
			DynamicTest.dynamicTest("1st dnamic test", ()->assertTrue(ser.checkPalindrome("madam"))),
			DynamicTest.dynamicTest("2nd dynamic test", ()->assertEquals(7.5, ser2.calcSeries(5, 5, 5)))
			);
			
}
}
