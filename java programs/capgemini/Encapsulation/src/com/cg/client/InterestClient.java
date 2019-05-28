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
          System.out.println("Enter principle");
          double amt=sc.nextDouble();
          System.out.println("enter years");
          int years=sc.nextInt();
          System.out.println("Enter rate");
          float rate=sc.nextFloat();
          Interest obj=new Interest();
          try
          {
        	 obj.setAmt(amt);
        	 obj.setYears(years);
        	 obj.setRate(rate);
        	 System.out.println("Simple="+obj.calcSimple());
        	 System.out.println("Compound="+obj.calcCompound());
          }
          catch(Exception e)
          {
        	  System.out.println(e.getMessage());
          }
          sc.close();
         
	}

}
