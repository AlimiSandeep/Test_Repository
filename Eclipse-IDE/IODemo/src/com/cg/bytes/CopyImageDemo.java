package com.cg.bytes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageDemo {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("Koala.jpg");
	BufferedInputStream bis=new BufferedInputStream(fis);
	
	FileOutputStream fos=new FileOutputStream("cg.jpg");
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	
	byte[] arr=new byte[fis.available()];
	bis.read(arr);//Reads the bytes from file to buffer and buffer to byte[]
	bos.write(arr);//Write byte[] to buffer and buffer to file
	
	
	bos.close();
	fos.close();
	bis.close();
	fis.close();
}
}
