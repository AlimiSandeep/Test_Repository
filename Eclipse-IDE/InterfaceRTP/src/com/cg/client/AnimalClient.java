package com.cg.client;

import java.awt.DisplayMode;

import com.cg.service.Animal;
import com.cg.service.Cat;
import com.cg.service.Dog;
import com.cg.service.Lion;

public class AnimalClient {
	public static void main(String[] args) {
		
	Animal[] arr=new Animal[3];
	arr[0]=new Dog();
	arr[1]=new Cat();
	arr[2]=new Lion();
	
	for(Animal obj:arr)
		display(obj);	
		
}	
	public static void display(Animal obj){
	System.out.println(obj.getClass().getSimpleName()+" :  "+obj.makiNoise());}
}
