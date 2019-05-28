package com.cg.ch;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FormatDemo {
public static void main(String[] args) throws FileNotFoundException {
	PrintWriter pw=new PrintWriter("cmr//empreport.txt");
	pw.println("----------------------------------------------------------");
	pw.printf("%10s%20s%10s%10s\n","eid","ename","sal","dept");
	pw.println("----------------------------------------------------------");
	List<Emp> list=getEmployee();
	list.stream().forEach(e->pw.printf("%10d%20s%10.2f%10s\n",
			e.getEid(),e.getEname(),e.getSal(),e.getDept()));
	
	
	
	pw.close();
	System.out.println("File created");	
}
public static List<Emp> getEmployee()
{
	List<Emp> list=new ArrayList<>();
	list.add(new Emp(1001,"ram",25000,"hr"));
	list.add(new Emp(1002, "tom",30000,"hr"));
	list.add(new Emp(1003, "sam",15000,"hr"));
	
	return list;
	
}
}
