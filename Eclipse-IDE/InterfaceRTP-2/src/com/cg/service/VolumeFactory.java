package com.cg.service;

import java.util.HashMap;
import java.util.Map;

public class VolumeFactory {
	private static Map<String,Volume> map;
	
	static {
		map=new HashMap<>();
		map.put("cylinder", new Cylinder());
		map.put("cone", new Cone());
		map.put("sphere", new Sphere());
	}
	
	public static Volume getVolumeInstance(String str){
		Volume obj=map.get(str);
		return obj;
	}

}
