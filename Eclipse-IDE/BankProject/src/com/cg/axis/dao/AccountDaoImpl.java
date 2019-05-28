package com.cg.axis.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.axis.exceptions.IdException;
import com.cg.axis.vo.Account;

public class AccountDaoImpl implements AccountDao {
	private static Map<Integer,Account> amap;
	
	static
	{
		amap=new HashMap<>();
		amap.put(1001, new Account(1001,"Ram",25000));
		amap.put(1002, new Account(1002,"Sam",35000));
		amap.put(1003, new Account(1003,"Sai",30000));
		
	}
	
	@Override
	public Account getaccount(int accId) throws IdException {
	if(amap.containsKey(accId))
		return amap.get(accId);
	else
		throw new IdException("No account details found");
	
	}

	@Override
	public int updateAccount(int accid, double amt) {
		
			Account obj=amap.get(accid);
			obj.setBalance(amt);
	
		return 1;
	}

}
