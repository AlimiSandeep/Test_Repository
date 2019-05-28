package com.cg.domain;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1,Emp e2) {
		Double sal1=e1.getSal();
		Double sal2=e2.getSal();
		//return sal1.compareTo(sal2);//Ascending order of salary
		
		int res=sal2.compareTo(sal1);//Descending order of salary
		if(res==0)
		{
			return ((Integer)e1.getEid()).compareTo(e2.getEid());
		}
		return res;
	 
	}

}
