package com.cg.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1001, "Ram");
		map.put(1004, "Tom");
		map.put(1007, "Sam");
		map.put(1002, "Ravi");
		map.put(1006, "Peter");

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter emp id:");
		int eid=scan.nextInt();
		if(map.containsKey(eid))
			System.out.println(map.get(eid));
		else
			System.out.println("No employee found");
		
		
	}

}
