package com.cg.client;

import com.cg.service.Contract;
import com.cg.service.Emp;
import com.cg.service.Onroll;

public class EmpClient {
	public static void main(String...args) {
		Emp[] arr=new Emp[4];
		arr[0]=new Onroll(1000,"Sandy", 100000);
		arr[1]=new Onroll(1001, "Abhi", 150000);
		arr[2]=new Contract(1003, "Vyshu", 200000, 10);
		arr[3]=new Contract(1004,"Sushma",250000,15);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.printf("%10s%10s%10s%10s%10s%10s%10s%15s\n","ETYPE","EID","ENAME","SAL","PF","HRA","DAYS","NET.SAL");
		/*
		 for(int i=0;i<arr.length;i++)
		arr[i].display();
		*/
		System.out.println("----------------------------------------------------------------------------------------");
		
		for(Emp emp:arr){
		display(emp);}
		System.out.println("----------------------------------------------------------------------------------------");


	}
	public static void display(Emp emp)
	{
		emp.display();
	}

}
