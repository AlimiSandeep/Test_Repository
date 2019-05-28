package com.cg.bytes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadTextDemo {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("cmr//abc.txt");
	int data=0;
/*	while((data=fis.read())!=-1)
	{
		System.out.print((char)data);
	}*/
	
	
	//Converting byte stream into character stream
	
	InputStreamReader isr=new InputStreamReader(fis);
	BufferedReader br=new BufferedReader(isr);
	String str=null;
	while((str=br.readLine())!=null)
	{
		System.out.println(str);
	}
	
	fis.close();
	
	
}
}
