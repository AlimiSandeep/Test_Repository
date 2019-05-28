package com.cg.dao;

import com.cg.exceptions.AccException;
import com.cg.vo.Account;

public interface AccountDao {
Account getAccount(int aid)throws AccException;
}
