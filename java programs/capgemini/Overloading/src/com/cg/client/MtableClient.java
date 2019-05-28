package com.cg.client;

import com.cg.service.Mtable;

public class MtableClient {
public static void main(String[] args) {
	try{
		Mtable obj=new Mtable(5);
		obj.display();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
