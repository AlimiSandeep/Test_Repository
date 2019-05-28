package com.cg.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

import com.cg.dao.AccountDao;
import com.cg.exceptions.AccException;
import com.cg.exceptions.BalanceException;
import com.cg.service.AccountService;
import com.cg.service.AccountServiceImpl;
import com.cg.vo.Account;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@RunWith(JUnitPlatform.class)
@ExtendWith(MockitoExtension.class)
public class TransferfundTest {
	
	@Mock
	private AccountDao dao;
	
	@InjectMocks
	private AccountService ser = new AccountServiceImpl();
	
	private static Account acc1, acc2, acc3;
	@BeforeAll
	public static void beforeAll(){
		acc1 = new Account(1001, "ram", 20000.0);
		acc2 = new Account(1002,"tom", 15000.0);
		acc3 = new Account(1003, "sam", 3000.0);
		
		
	}
	
	@BeforeEach
	public void beforeEach() throws AccException {
		//stub for mock method
		Mockito.when(dao.getAccount(1001)).thenReturn(acc1);
		Mockito.when(dao.getAccount(1002)).thenReturn(acc2);
		Mockito.when(dao.getAccount(1003)).thenReturn(acc3);
		Mockito.when(dao.getAccount(1004)).thenThrow(AccException.class);
	}
	@Test
	public void testTransferFund1() throws AccException, BalanceException {
		assertAll("transfer from 1001 mto 1002",()->{assertTrue(ser.transferFund(1001, 1002, 3000.0));},
												()->{assertEquals(17000.0,acc1.getBal());},
												()->{assertEquals(18000.0,acc2.getBal());}
				
				
				);
		//assertTrue(ser.transferFund(1001, 1002, 3000.0));
		Mockito.verify(dao).getAccount(1001);
		Mockito.verify(dao).getAccount(1002);
	}
	
	@Test
	public void testTransferFund2() throws AccException, BalanceException {
		assertThrows(AccException.class,()->{ser.transferFund(1004, 1002, 3000.0);});
		Mockito.verify(dao).getAccount(1004);
		
	}
	
	@Test
	public void testTransferFund3() throws AccException, BalanceException {
		assertThrows(BalanceException.class,()->{ser.transferFund(1003, 1002, 5000.0);});
		Mockito.verify(dao).getAccount(1003);
		Mockito.verify(dao).getAccount(1002);
	}

}