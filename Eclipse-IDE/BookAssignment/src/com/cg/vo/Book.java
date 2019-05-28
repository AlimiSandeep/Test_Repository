package com.cg.vo;

public class Book {
private String bookId;
private String bookname;
private String author;
private double price;
public Book(String bookId, String bookname, String author, double price) {
	super();
	this.bookId = bookId;
	this.bookname = bookname;
	this.author = author;
	this.price = price;
}
public String getBookId() {
	return bookId;
}
public String getBookname() {
	return bookname;
}
public String getAuthor() {
	return author;
}
public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return bookId + " " + bookname + " " + author + " " + price ;
}

}
