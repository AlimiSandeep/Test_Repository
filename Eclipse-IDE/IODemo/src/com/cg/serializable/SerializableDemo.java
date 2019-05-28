package com.cg.serializable;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializableDemo {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("employee.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	
	
			Emp emp1=new Emp(1001,"ram",23000,"hr");
			Emp emp2=new Emp(1002, "jam",25000,"pr");
			Emp emp3=new Emp(1003, "sam",29000,"hr");
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			oos.writeObject(emp3);
			
			oos.close();
			fos.close();
			System.out.println("Serialized");

}
}
