package com.cg.client;

import java.util.Scanner;

import com.cg.service.Volume;
import com.cg.service.VolumeFactory;

public class VolumeClient {
	public static void main(String[] args) {
		String opt=null;
		Scanner scan=new Scanner(System.in);

		do{
		System.out.println("Enter Shape: ");
		String str=scan.next();
		Volume obj=VolumeFactory.getVolumeInstance(str);
	
		display(obj);
		System.out.println("Press y to continue");
		opt=scan.next();
		
		}while(opt.equalsIgnoreCase("y"));
		scan.close();
	}
	public static void display(Volume obj)
	{
		if(obj!=null){
			obj.getData();
			System.out.println(obj.calcVolume());
		}
		else
			System.out.println("Shape not defined....");
	}

}
