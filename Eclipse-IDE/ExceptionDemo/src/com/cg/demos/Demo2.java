package com.cg.demos;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println(approveLoan(25, 30000000));
		
	}
	public static String approveLoan(int age,double income)
	{
		try
		{
			String res=processLoan(age,income);
			return res;
		}
		catch(AgeException | IncomeException e)
		{
			return e.getMessage();
		}
		finally
		{
			System.out.println("Im finally block");
		}
	}
	public static String processLoan(int age,double income) throws AgeException, IncomeException
	{
		if(age<20 || age>50)
			throw new AgeException("Age must be in between 20 and 50");
		if(income<400000)
			throw new IncomeException("Income must be more than 4 lakhs");
		return "Eligible";
	}

}
