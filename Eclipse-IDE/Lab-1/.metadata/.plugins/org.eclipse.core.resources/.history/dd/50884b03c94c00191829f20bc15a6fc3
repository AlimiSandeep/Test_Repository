package com.cg.domain;
import java.util.Comparator;
public class NameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1,Emp e2) {
		String str1=e1.getEname();
		String str2=e2.getEname();
		int res= str1.compareTo(str2);
		if(res==0)
		{
			return e1.getEname().compareTo(e2.getEname());
		}
		return res;
	}

}
