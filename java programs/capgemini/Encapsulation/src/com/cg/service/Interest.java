package com.cg.service;

import com.cg.util.CgUtil;

public class Interest {

	private double amt;
	private int years;
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) throws Exception {
		if(CgUtil.validatePositive(amt))
		this.amt = amt;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) throws Exception {
		if(CgUtil.validatePositive(years))
		this.years = years;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) throws Exception {
		if(CgUtil.validatePositive(rate))

		this.rate = rate;
	}
	private float rate;
	
	public double calcSimple(){
		return amt*years*rate/100;
	}
	public double calcCompound(){
		
		return amt*(Math.pow(1+rate/100,years))-amt;
	}

}
