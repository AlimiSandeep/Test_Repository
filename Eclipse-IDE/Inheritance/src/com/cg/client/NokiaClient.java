package com.cg.client;
import com.cg.service.Nokia1100;
import com.cg.service.NokiaLumia;
public class NokiaClient {
public static void main(String[] args) {
	Nokia1100 obj=new NokiaLumia();
	obj.doConverse();
	obj.sendSMS();
	//obj.browserNet();
	//obj.do2gConverse();
	System.out.println(obj.price);
}
}

