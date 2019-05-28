package com.cg.primitive;

import java.util.HashSet;
import java.util.Set;

public class TestDemo1 {
	public static void main(String[] args) {
		Set<Person> set=new HashSet<>();
		set.add(new Person(1001,"ram"));
		set.add(new Person(1002,"tom"));
		set.add(new Person(1003,"sam"));
		set.add(new Person(1004,"sai"));
		set.add(new Person(1001,"ram"));
		Person p=new Person(1005,"ravi");
		set.add(p);
		set.add(p);
		for(Person p1:set)
		{
			System.out.println(p1);
		}
		
		
	}

}
class Person
{
	private int pid;
	private String pname;
	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
@Override
	public int hashCode() {
		return pid;
	}
	@Override
	public boolean equals(Object obj) {
		Person p=(Person)obj;
		if(this.pid==p.pid)
			return true;
		
		return false;
	}
	@Override
	public String toString() {
		return pid + " " + pname ;
	}
	
	
	
	
}