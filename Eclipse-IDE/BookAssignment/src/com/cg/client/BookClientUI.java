package com.cg.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.service.BookService;
import com.cg.service.BookServiceImpl;
import com.cg.util.BookException;
import com.cg.util.IdException;
import com.cg.util.NameException;
import com.cg.vo.Book;

public class BookClientUI {
static Scanner scan=new Scanner(System.in);
static BookService ser=new BookServiceImpl();


public void doAdd() throws IdException
{
	System.out.println("Enter book ID:");
	String bid=scan.next();
	System.out.println("Enter book name :");
	String name=scan.next();
	System.out.println("Enter the author name:");
	String author=scan.next();
	System.out.println("Enter the price:");
	double price=scan.nextDouble();
		

		try {
			ser.validateBookName(bid);
			Book b=new Book(bid,name,author,price);
			
			boolean res=ser.addBook(b);
			if(res)
				System.out.println("Book added successfully");
		} catch (NameException e) {
			System.out.println(e);
		}

	
	
	
}

public void doViewById() throws BookException
{
	System.out.println("Enter the book id:");
	String bid=scan.next();
	System.out.println(ser.viewById(bid));
}
public void doViewAll()
{
	List<Book> list=new ArrayList<>();
	list=ser.viewAll();
	list.stream().forEach(System.out::println);
}
public void doViewByAuthor()
{
	System.out.println("Enter the author name :");
	String author=scan.next();
	List<Book> list=new ArrayList<>();
	list=ser.viewByAuthor(author);
	list.stream().forEach(System.out::println);

	
}
public void doEditBook()
{
	System.out.println("Enter the book id:");
	String bid=scan.next();
	System.out.println("Enter the price:");
	double price=scan.nextDouble();
	boolean res=ser.editBook(bid, price);
	if(res)
		System.out.println("Edited book successfully");
}
}
