package com.cg.service;

import com.cg.exceptions.AccException;
import com.cg.exceptions.BalanceException;

public interface AccountService {
public boolean transferFund(int from,int to,double amt) throws AccException,BalanceException;
}
