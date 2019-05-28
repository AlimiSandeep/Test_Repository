package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class AggDemo {

	public static void main(String[] args) {
		
		List<Integer> lst =Arrays.asList(5,10,15,20,25);
		int sum = lst.stream().mapToInt(e->e).sum();
		System.out.println("sum=  "+sum);
		
		double avg = lst.stream().mapToInt(e->e).average().getAsDouble();
	    System.out.println("average= "+avg);
	
	    double max = lst.stream().mapToInt(e->e).max().getAsInt();
	    System.out.println("max=   "+max);
	    double min = lst.stream().mapToInt(e->e).min().getAsInt();
	    System.out.println("min=  "+min);
	}

}
