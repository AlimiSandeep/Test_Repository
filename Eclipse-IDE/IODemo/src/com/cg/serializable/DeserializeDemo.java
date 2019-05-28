package com.cg.serializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis=new FileInputStream("employee.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	
	Emp emp=null;
	try
	{
		while(true){
			emp=(Emp)ois.readObject();
			System.out.println(emp);
		}
	}
	catch(EOFException e)
	{
		System.out.println("End of File");
	}
	ois.close();
	fis.close();
	System.out.println("Deserialized");
}
}
