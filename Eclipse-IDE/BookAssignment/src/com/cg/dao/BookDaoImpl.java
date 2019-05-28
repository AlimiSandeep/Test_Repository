package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.vo.Book;

public class BookDaoImpl implements BookDao{

	private static Map<String,Book> bmap=new HashMap<>();

	@Override
	public boolean addBook(Book b) {
		if(bmap.containsKey(b.getBookId()))
			return false;
		bmap.put(b.getBookId(), b);
		return true;
	}

	@Override
	public boolean editBook(String bid,double price) {
		if(bmap.containsKey(bid))
		{
			Book obj=bmap.get(bid);
			obj.setPrice(price);
			return true;
		}
		return false;
	}

	@Override
	public Book viewById(String bid) {
		return bmap.get(bid);
	}

	@Override
	public List<Book> viewAll() {
		List<Book> list=new ArrayList<>();
		list.addAll(bmap.values());
		return list;
	}
	
}
