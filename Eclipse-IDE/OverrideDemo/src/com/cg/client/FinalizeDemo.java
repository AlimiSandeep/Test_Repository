package com.cg.client;

import java.util.Scanner;

import com.cg.service.Emp;

public class FinalizeDemo {
public static void main(String[] args) {
	Emp emp1=new Emp(2000,"ram");
	Emp emp2=new Emp(2001,"tom");
	Emp emp3=new Emp(2000,"sam");
	emp1=null;
	emp2=null;
	System.gc();
	System.out.println("enter any key");
	String str=new Scanner(System.in).next();

}
}
