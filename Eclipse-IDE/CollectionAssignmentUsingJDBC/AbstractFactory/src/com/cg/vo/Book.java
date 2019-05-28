package com.cg.vo;

import java.util.Scanner;

public class Book extends WrittenItem {

	@Override
	public int addproduct() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ID:");
		setId(scan.nextInt());
		System.out.println("Enter the title:");
		setTitle(scan.next());
		System.out.println("Enter the no. of Copies:");
		setCopies(scan.nextInt());
		System.out.println("Enter the author name:");
		setAuthor(scan.next());
		return 1;
	}

	

}
