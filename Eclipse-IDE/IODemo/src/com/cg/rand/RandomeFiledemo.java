package com.cg.rand;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomeFiledemo {
public static void main(String[] args) throws IOException {
	RandomAccessFile file=new RandomAccessFile("xyz.dat","rw");
	file.writeUTF("Sandeep is pubg player");
	file.writeInt(1001);
	file.writeDouble(56000.0);
	
	file.seek(0);
	
	 
	System.out.println(file.readUTF());
	System.out.println(file.readInt());
	System.out.println(file.readDouble());
	
	file.close();

}
}
