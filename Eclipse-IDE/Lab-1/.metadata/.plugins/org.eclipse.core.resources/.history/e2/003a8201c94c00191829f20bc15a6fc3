package com.cg.axis.service;

import com.cg.axis.dao.AccountDao;
import com.cg.axis.dao.DaoFactory;
import com.cg.axis.exceptions.BalanceException;
import com.cg.axis.exceptions.IdException;
import com.cg.axis.vo.Account;

public class AccountServiceImpl implements AccountService {
	
	private AccountDao dao=DaoFactory.getAccountDao();//new AccountDaoImpl()
	private static AccountService ser=new AccountServiceImpl();
	
	private AccountServiceImpl()
	{
		
	}
	
	public static AccountService getBankservice()
	{
		return ser;
	}
	@Override
	public boolean deposit(int accId, double amt) throws IdException {
		Account acc=dao.getaccount(accId);
		dao.updateAccount(accId, acc.getBalance()+amt);//acc.setBal(acc.getBal()+amt);
		return true;
	}

	@Override
	public boolean withdraw(int accId, double amt) throws IdException, BalanceException {
		Account acc=dao.getaccount(accId);
		if(acc.getBalance()<amt)
			throw new BalanceException("Insufficient Funds");
		
			dao.updateAccount(accId, acc.getBalance()-amt);

		return true;
	}

	@Override
	public boolean transferFund(int fromacc, int toacc, double amt) throws IdException, BalanceException {
		Account from=dao.getaccount(fromacc);
		if(from.getBalance()<amt)
			throw new BalanceException("Insufficient Funds");
		dao.updateAccount(fromacc, from.getBalance()-amt);
		Account to=dao.getaccount(toacc);
		dao.updateAccount(toacc, to.getBalance()+amt);


		return true;
	}

	@Override
	public Account getAccount(int accid) throws IdException {
		
		return dao.getaccount(accid);
	}

	

}
