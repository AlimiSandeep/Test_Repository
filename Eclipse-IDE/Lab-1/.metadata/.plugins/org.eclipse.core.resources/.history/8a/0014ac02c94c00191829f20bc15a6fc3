package com.cg.ui;

import java.util.Scanner;

import com.cg.vo.Item;
import com.cg.vo.ItemFactory;


public class ItemClient {
public static void main(String[] args) {
	String opt=null;
	Scanner scan=new Scanner(System.in);

	do{
	processMenu();
	System.out.println("Press y to continue");
	opt=scan.next();
	
	}while(opt.equalsIgnoreCase("y"));

}
public static void processMenu()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Item: ");
	String str=scan.next();
	Item item=ItemFactory.getItem(str.toLowerCase());
	if(item!=null){
	item.checkIn();
	item.addproduct();
	item.print();
	item.checkOut();
	}
	else
		System.out.println("Item not found");

}

}

