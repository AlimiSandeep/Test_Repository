package com.cg.axis.service;

import com.cg.axis.exceptions.BalanceException;
import com.cg.axis.exceptions.IdException;
import com.cg.axis.vo.Account;

public interface AccountService {
	boolean deposit(int accId,double amt)throws IdException;
	boolean withdraw(int accId,double amt)throws IdException,BalanceException;
	boolean transferFund(int fromacc,int toacc, double amt) throws IdException,BalanceException;
	Account getAccount(int accid)throws IdException;

}
