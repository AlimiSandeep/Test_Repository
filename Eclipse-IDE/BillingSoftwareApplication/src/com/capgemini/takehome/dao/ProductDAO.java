package com.capgemini.takehome.dao;

import java.util.Map;

import com.capgemini.takehome.bean.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO{

	private static Map<Integer,Product> map=CollectionUtil.getMap();
	
	@Override
	public Product getProductDetails(int productCode) {
		return map.get(productCode);
	}

}
