package com.cg.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arraySize=in.nextInt();
		int arr[]=new int[arraySize];
		for(int i=0;i<arraySize;i++)
			arr[i]=in.nextInt();
		Map<Integer,Integer> map=new HashMap<>();
		map=getSquares(arr);
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}
	static Map<Integer,Integer> getSquares(int[] arr)
	{
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int num:arr)
		{
			if(!map.containsKey(num))
			{
				map.put(num, num*num);
			}
		}
		
		return map;
	}
}
