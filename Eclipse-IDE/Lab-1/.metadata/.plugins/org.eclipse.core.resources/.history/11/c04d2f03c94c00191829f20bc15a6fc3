package com.cg.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.vo.Product;
/**
 * 
 * @author Sandeep
 * It is DAO accessing to/from map having CRUD operations
 *
 */
public class ProductDaoImpl implements ProductDao {

	private static Map<Integer,Product> pmap=null;
	
	static
	{
		pmap=new HashMap<>();
	}
	
	
	/**
	 * param prod belongs to Product
	 * @return boolean
	 * If ProdId already exists in the map key then returns false
	 */
	@Override
	public boolean addProduct(Product prod)  {
		if(!pmap.containsKey(prod.getProdId())){
			pmap.put(prod.getProdId(), prod);
			return true;
			}
		return false;
		
				
	}
	
	/**
	 * @param pid value of productId
	 * @return product instance
	 * It returns the product for the given ProductId
	 */

	@Override
	public Product viewProductById(int pid) {
		return pmap.get(pid);
	}
	
	/**
	 * @return List<Product> returns all the products in the map
	 */

	@Override
	public List<Product> displayAll() {
		List<Product> list=new ArrayList<>();
		list.addAll(pmap.values());
		return list;
	}

}
