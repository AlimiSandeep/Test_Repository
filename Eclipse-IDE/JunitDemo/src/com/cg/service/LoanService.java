package com.cg.service;

public class LoanService {
public boolean checkEligibleForLoan(int age,double income) throws AgeException,IncomeException
{
	if(age<20 || age>50)
		throw new AgeException();
	if(income<400000)
		throw new IncomeException();
	return true;
		
}
}
