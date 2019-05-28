package com.cg.axis.dao;

import com.cg.axis.exceptions.IdException;
import com.cg.axis.vo.Account;

public interface AccountDao {
Account getaccount(int accId)throws IdException;
int updateAccount(int accid,double amt);
}
