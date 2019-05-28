package com.cg.service;

import com.cg.dao.AccountDao;
import com.cg.exceptions.AccException;
import com.cg.exceptions.BalanceException;
import com.cg.vo.Account;

public class AccountServiceImpl implements AccountService {
	private AccountDao dao;

	// mockito injects the mock instance via this method
	public void setDao(AccountDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean transferFund(int from, int to, double amt) throws AccException, BalanceException {

		Account acc1 = dao.getAccount(from);
		Account acc2 = dao.getAccount(to);
		if(acc1.getBal() < amt)
			throw new BalanceException();
		acc1.setBal(acc1.getBal()-amt);
		acc2.setBal(acc2.getBal()+amt);
		return true;
	}
}
