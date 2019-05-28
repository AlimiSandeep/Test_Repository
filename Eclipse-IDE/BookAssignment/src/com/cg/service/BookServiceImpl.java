package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImpl;
import com.cg.util.BookException;
import com.cg.util.IdException;
import com.cg.util.NameException;
import com.cg.vo.Book;

public class BookServiceImpl implements BookService {
	static BookDao dao = new BookDaoImpl();

	@Override
	public boolean addBook(Book b) throws IdException {
		boolean res=dao.addBook(b);
		if(!res)
			throw new IdException();
		
		return true;
	}

	@Override
	public Book viewById(String bid) throws BookException {
		Book obj=dao.viewById(bid);
		if(obj==null)
			throw new BookException();
		return obj;
	}

	@Override
	public List<Book> viewByAuthor(String author) {
		List<Book> list=new ArrayList<>();
		for(Book obj:dao.viewAll())
		{
			if(obj.getAuthor().equals(author))
				list.add(obj);
		}
		return list;
	}

	@Override
	public List<Book> viewAll() {
		return dao.viewAll();
	}

	@Override
	public boolean editBook(String bid, double price) {
		boolean res=dao.editBook(bid, price);
		
		return res;
	}

	@Override
	public boolean validateBookName(String name) throws NameException {
		if(!name.matches("[A-Z]{2}[-][0-9]{4}"))
			throw new NameException();
		
		return true;
	}

}
