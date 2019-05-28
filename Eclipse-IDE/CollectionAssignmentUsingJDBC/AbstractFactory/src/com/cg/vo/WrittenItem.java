package com.cg.vo;

public abstract class WrittenItem extends Item {
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Author = "+author);
	}

	

}
