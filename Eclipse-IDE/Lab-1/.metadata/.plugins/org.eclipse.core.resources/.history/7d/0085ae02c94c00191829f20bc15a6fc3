package com.cg.vo;

import java.util.Scanner;

public class JournalPaper extends WrittenItem {
private int yearPublished;

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
		System.out.println("Enter the year of publishment:");
		setYearPublished(scan.nextInt());
		return 1;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Published Year = "+yearPublished);
	}

	
	
	
	
}
