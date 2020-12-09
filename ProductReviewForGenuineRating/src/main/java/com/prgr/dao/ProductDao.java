package com.prgr.dao;

import java.util.List;
import java.util.Map;

import com.prgr.model.Product;

public interface ProductDao {
	public Product addProduct(Product product);
	public int updateProduct(Product product);
	public Map compareProduct(Product p1,Product p2 );
	public List<Product> viewAllProduct();
	public Product viewSingleProduct(int prodID);
	public List<Product> viewBasedOnCategory(String Category);
}
