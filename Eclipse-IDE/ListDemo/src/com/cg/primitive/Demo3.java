package com.cg.primitive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo3 {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("Balayya");
	list.add("Babu");
	list.add("Thopu");
	list.add("Dammunte");
	list.add("Aapu");
	Iterator<String> it=list.iterator();
	while(it.hasNext())
		System.out.print(it.next()+" ");
}
}
