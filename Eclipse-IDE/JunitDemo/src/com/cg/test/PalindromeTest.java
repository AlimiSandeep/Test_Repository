package com.cg.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;
import com.cg.service.Palindrome;

@RunWith(JUnitPlatform.class)
@DisplayName("PalindromeTest")
public class PalindromeTest {
	static Palindrome ser;

	@BeforeAll
	public static void beforeAll() {
		ser = new Palindrome();
	}

	@AfterAll
	public static void afterAll() {
		ser = null;
	}

	@Test
	@DisplayName("Test for string 'nitin' ")
	public void palindromeTest1() {
		assertTrue(ser.checkPalindrome("nitin"));
	}

	@Test
	@DisplayName("Test for string 'on' ")
	public void palindromeTest2() {
		assertFalse(ser.checkPalindrome("on"));
	}

	@Test
	@DisplayName("Test for empty string")
	public void palindromeTest3() {
		assertFalse(ser.checkPalindrome(""));
	}

	@Test
	@DisplayName("Test for null")
	public void palindromeTest4() {
		assertFalse(ser.checkPalindrome(null));
	}

	@Test
	@DisplayName("Test for string having spaces")
	public void palindromeTest5() {
		assertFalse(ser.checkPalindrome(" "));
	}
	
	@Test
	@DisplayName("Test for string 'MaDaM' ")
	public void palindromeTest6() {
		assertTrue(ser.checkPalindrome("MaDAm"));
	}

}
