package com.cg.dao;

import java.util.List;

import com.cg.vo.Book;

public interface BookDao {
boolean addBook(Book b);
boolean editBook(String bid,double price);
Book viewById(String bid);
List<Book> viewAll();


}
