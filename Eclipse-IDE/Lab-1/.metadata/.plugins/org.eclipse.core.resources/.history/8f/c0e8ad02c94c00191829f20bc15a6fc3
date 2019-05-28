
package com.cg.vo;

import java.time.LocalDateTime;

public abstract class Item {
	private int id;
	private String title;
	private int copies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}

	public void print()
	{
		System.out.println("ID = "+id);
		System.out.println("Title = "+title); 
		System.out.println("Copies = "+copies);
	
	}
	
	
	public abstract int addproduct();
	
	public void checkIn()
	{
		System.out.println(LocalDateTime.now());
	}
	public void checkOut()
	{
		System.out.println(LocalDateTime.now());
	}
}
