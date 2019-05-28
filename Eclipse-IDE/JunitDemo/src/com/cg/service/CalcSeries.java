package com.cg.service;

public class CalcSeries {
public double calcSeries(int a,int b,int c)
{
	double res=(a+b+c)/2.0;
	return res;
}
public double round2NdecPlaces(double val,int n)
{
	double pow=Math.pow(10,n);
	double res=Math.round(val*pow)/pow;
	return res;
}


public long sumSeries(int n)
{

	long res=n*(n+1)/2;
		
	return res;
}
}
