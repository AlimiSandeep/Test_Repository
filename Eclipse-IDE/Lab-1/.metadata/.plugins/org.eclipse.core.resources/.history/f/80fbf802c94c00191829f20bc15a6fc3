package com.cg.demos;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo2 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1001, "Ram");
		map.put(1004, "Tom");
		map.put(1007, "Sam");
		map.put(1002, "Ravi");
		map.put(1006, "Peter");
		
		System.out.println("---------------Using Key set-------------------");
		Set<Integer> keys=map.keySet();
		for(int key:keys)
		{
			System.out.println(map.get(key));
		}
		
		
		System.out.println("---------------Using Values-------------------");
		Collection<String> col=map.values();
		for(String value:col)
		{
			System.out.println(value);
		}
		
		System.out.println("---------------Using Entry set-------------------");
		/*Set<Entry<Integer,String>> set=map.entrySet();
		for(Entry entry:set)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		
		for(Entry<Integer,String> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
}
}