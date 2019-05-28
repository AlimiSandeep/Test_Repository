package com.cg.service;

import java.util.List;

import com.cg.util.BookException;
import com.cg.util.IdException;
import com.cg.util.NameException;
import com.cg.vo.Book;

public interface BookService {
	boolean addBook(Book b) throws IdException;
	Book viewById(String bid) throws BookException;
	List<Book> viewByAuthor(String author);
	List<Book> viewAll();
	boolean editBook(String bid,double price);
	boolean validateBookName(String name) throws NameException;
}
