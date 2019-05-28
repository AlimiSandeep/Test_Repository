package com.cg.ch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {
public static void main(String[] args) throws IOException {
	File folder=new File("cmr");
	if(!folder.exists())
		folder.mkdir();	//Creating the folder
	
	File file=new File(folder,"abc.txt");
	FileWriter fw=new FileWriter(file);//Creating a new file
	fw.write("Delhi is capital of India \n");
	fw.write("Tajmahal is one of the wonders in the world \n");
	fw.close();
	System.out.println("File Created");
	
}
}
