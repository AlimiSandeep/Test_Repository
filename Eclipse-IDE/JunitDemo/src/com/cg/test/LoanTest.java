package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.cg.service.AgeException;
import com.cg.service.IncomeException;
import com.cg.service.LoanService;

@RunWith(JUnitPlatform.class)
public class LoanTest {
	static LoanService ser;

	@BeforeAll
	public static void beforeAll() {
		ser = new LoanService();
	}

	@AfterAll
	public static void afterAll() {
		ser = null;
	}

	@Test
	public void testLoan1() throws AgeException, IncomeException {
		assertTrue(ser.checkEligibleForLoan(20, 400000));
	}
	@Test
	public void testLoan2() throws AgeException, IncomeException {
		assertTrue(ser.checkEligibleForLoan(50, 400000));
	}
	
	@Test
	public void testLoan3() throws AgeException, IncomeException {
		assertThrows(AgeException.class,()->{ser.checkEligibleForLoan(18, 30000.0);});
	}
	@Test
	public void testLoan4() throws AgeException, IncomeException {
		assertThrows(IncomeException.class,()->{ser.checkEligibleForLoan(22, 30000.0);});

	}

}
