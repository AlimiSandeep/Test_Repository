package com.cg.bytes;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DisDemo {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("cmr.dat");
	DataInputStream dis=new DataInputStream(fis);
	try
	{
		while(true)
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readDouble());
		}
	}catch(EOFException e)
	{
		System.out.println("End of File......!!!!!!");
	}
	dis.close();
	fis.close();
}
}
