package com.cg.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise_1 {
public static void main(String[] args) {
	Map<String,Integer> map=new HashMap<>();
	
	map.put("five", 5);
	map.put("three", 3);
	map.put("four", 4);
	map.put("one",1);
	map.put("two", 2);
	
	List<Integer> list=getValues(map);
	list.stream().forEach(result->System.out.print(result+" "));
	
	/*for(Integer values:list)
	{
		System.out.print(values+" ");
	}*/
	
}
static List<Integer> getValues(Map<String, Integer> map) 
{
	List<Integer> list=new ArrayList<>();
	list.addAll(map.values());
	list.sort(null);
	return list;
}
}