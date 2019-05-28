package com.cg.service;

public class Interest {

	public double amt;
	public int years;
	public float rate;
	
	public double calcSimple(){
		return amt*years*rate/100;
	}
	public double calcCompound(){
		
		return amt*(Math.pow(1+rate/100,years))-amt;
	}

}
