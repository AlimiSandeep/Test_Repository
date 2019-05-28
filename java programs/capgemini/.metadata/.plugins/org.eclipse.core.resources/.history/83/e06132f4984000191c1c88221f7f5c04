package com.cg.client;
import java.util.Scanner;
import com.cg.service.Interest;

public class InterestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
          Interest obj =new Interest();
          System.out.println("Enter principle");
          obj.amt=sc.nextDouble();
          System.out.println("enter years");
          obj.years=sc.nextInt();
          System.out.println("Enter rate");
          obj.rate=sc.nextFloat();
          System.out.printf("Simple =%.2f",obj.calcSimple());
          System.out.printf("compound =%.2f",obj.calcCompound());
          sc.close();
	}

}
