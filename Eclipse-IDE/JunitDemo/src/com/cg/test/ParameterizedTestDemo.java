package com.cg.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import com.cg.service.Palindrome;

public class ParameterizedTestDemo {
	
@ParameterizedTest
@ValueSource(strings ={"nitin","MadAm","121","mum"} )
public void testPalindrome1(String str)
{
	Palindrome ser=new Palindrome();
	assertTrue(ser.checkPalindrome(str));
}
	


@ParameterizedTest
@ValueSource(strings ={"on",""," ","mama"} )
public void testPalindrome2(String str)
{
	Palindrome ser=new Palindrome();
	assertFalse(ser.checkPalindrome(str));
}
}
