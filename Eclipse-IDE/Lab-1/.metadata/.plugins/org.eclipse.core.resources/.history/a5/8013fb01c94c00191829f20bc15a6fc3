package com.cg.ch;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("cmr\\abc.txt",true);
	BufferedWriter bw=new BufferedWriter(fw,1024*6);//Setting the size of buffer to 6kb
	bw.write("Big salute to soldiers fought in pulwama\n");
	bw.write("Capgemini is CMM level 5 company\n");
	bw.close();
	System.out.println("File appended");
}
}
