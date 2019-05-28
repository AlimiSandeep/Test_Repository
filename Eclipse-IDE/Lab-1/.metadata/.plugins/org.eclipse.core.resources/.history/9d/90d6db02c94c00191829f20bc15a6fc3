
package com.cg.stream.demos;

import java.util.Arrays;
import java.util.List;

public class AggregationDemo {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(10,12,15,17,20,22,25);
	int sum=list.stream().mapToInt(e->e).sum();
	System.out.println("Sum="+sum);
	
	double avg=list.stream().mapToDouble(e->e).average().getAsDouble();
	System.out.println("Average= "+avg);
	
	int max=list.stream().mapToInt(e->e).max().getAsInt();
	System.out.println("Max= "+max);
	
	int min=list.stream().mapToInt(e->e).min().getAsInt();
	System.out.println("Min= "+min);
	
	
	
}
}
