package com.cg.stream.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyFirstDemo {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	
	for(int i=1;i<=1000;i++){
	list.add(i);
	}
	System.out.println("----------------findFirst()-------------");
	Optional<Integer> opt1=list.parallelStream().filter(e->e%5==0).findFirst();
	System.out.println(opt1.get());
	
	System.out.println("----------------findAny()-------------");
	Optional<Integer> opt2=list.parallelStream().filter(e->e%5==0).findAny();
	System.out.println(opt2.get());


}

}
