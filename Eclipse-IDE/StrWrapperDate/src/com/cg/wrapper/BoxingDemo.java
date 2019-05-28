package com.cg.wrapper;

public class BoxingDemo {
	public static void main(String[] args) {
		int data=10;
		
		//	Integer x=new Integer(20);
		//	Boxing

		Integer v1=20;
		Integer v2=30;
		//UnBoxing's
		int res=v1.intValue()+v2.intValue();
		System.out.println(res);	
		
	
	}

}
//Boxing Integer a=Integer.valueOf(data);