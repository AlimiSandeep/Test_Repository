package com.cg.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab8Exercise2 {
public static void main(String[] args) throws IOException {
	File file=new File("temp.txt");
	FileWriter fw=new FileWriter(file);
	fw.write("Hello\n");
	fw.write("Good\n");
	fw.write("Morning");
	
	fw.close();
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String str=null;
	int i=1;
	while((str=br.readLine())!=null)
	{
		System.out.println(i+" "+str);
		i++;
	}
	br.close();
}
}
