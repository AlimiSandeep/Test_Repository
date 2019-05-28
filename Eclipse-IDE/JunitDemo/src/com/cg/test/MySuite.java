package com.cg.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses({CalcSeriesTest.class, LoanTest.class, PalindromeTest.class, ParameterizedTestDemo.class, 
		RepeatedTestDemo.class, RoundTest.class, sumSeriesTest.class})
public class MySuite {

}
