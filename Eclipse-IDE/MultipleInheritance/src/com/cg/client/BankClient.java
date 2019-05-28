package com.cg.client;

import com.cg.service.Agent;
import com.cg.service.Atm;
import com.cg.service.Bank;

public class BankClient {
public static void main(String[] args) {
	Atm atm=Bank.getAtm();
	atm.withdraw();
	atm.deposit();

	
}
}
