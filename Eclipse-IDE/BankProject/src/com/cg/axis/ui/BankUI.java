package com.cg.axis.ui;

import java.util.Scanner;

import com.cg.axis.exceptions.BalanceException;
import com.cg.axis.exceptions.IdException;
import com.cg.axis.service.AccountService;
import com.cg.axis.service.AccountServiceImpl;
import com.cg.axis.vo.Account;

public class BankUI {
	private static Scanner scan=new Scanner(System.in);
	private AccountService ser=AccountServiceImpl.getBankservice();
	
	public void doDeposit()
	{
		System.out.println("Enter the account Id");
		int aid=scan.nextInt();
		System.out.println("Enter the Amount to Deposit");
		double amt=scan.nextDouble();
		try
		{
			ser.deposit(aid, amt);
			System.out.println("Successfully deposited");
		}
		catch(IdException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public void doWithdrawl()
	{
		System.out.println("Enter the account Id");
		int aid=scan.nextInt();
		System.out.println("Enter the Amount to Withdrawl");
		double amt=scan.nextDouble();
		try
		{
			ser.withdraw(aid, amt);
			System.out.println("Successfully Withdrawed");
		}
		catch(BalanceException | IdException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void getAccount()
	{
		System.out.println("Enter the account Id");
		int aid=scan.nextInt();
		try
		{
			Account acc=ser.getAccount(aid);
			System.out.println(acc);
		}
		catch(IdException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void doTransfer()
	{
		System.out.println("Enter the 'FROM' acct to transfer");
		int from=scan.nextInt();
		System.out.println("Enter the 'TO' acct to transfer");
		int to=scan.nextInt();
		System.out.println("Enter the Amount to Transfer");
		double amt=scan.nextDouble();
		try
		{
			ser.transferFund(from, to, amt);
			System.out.println("Fund transferred successfully");
		}
		catch(IdException | BalanceException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
