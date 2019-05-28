package com.cg.primitive;

import java.util.ArrayList;
import java.util.List;

public class TestDemo {
	public static void main(String[] args) {
		
List<Integer> list=new ArrayList<>();
list.add(5);
list.add(10);
list.add(15);
list.add(20);
list.add(25);
list.add(30);
list.add(35);
list.add(40);
System.out.println(list);
list.remove(5);//removes based on index
System.out.println(list);
list.remove(new Integer(5));
System.out.println(list);//removes based on value


	}
}
