package com.cg.bytes;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.cg.ch.Emp;
import com.cg.ch.FormatDemo;

public class DosDemo {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("cmr.dat");
	DataOutputStream dos=new DataOutputStream(fos);
	List<Emp> list=FormatDemo.getEmployee();
	
	for(Emp emp:list)
	{
		dos.writeInt(emp.getEid());
		dos.writeUTF(emp.getEname());
		dos.writeDouble(emp.getSal());
	}
	dos.close();
	fos.close();
	System.out.println("File created");
}
}
