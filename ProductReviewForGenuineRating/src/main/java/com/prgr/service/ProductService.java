package com.prgr.service;

import java.util.List;
import java.util.Map;

import com.prgr.model.Product;

public interface ProductService {
	public Product addProduct(Product product);
	 public int updateProduct(Product product);
	 public Map compareProduct(Product p1,Product p2 );
	 public List<Product> viewAllProduct();
	 public Product viewSingleProduct(int prodId);
	 public List<Product> viewBasedOnCategory(String Category);
}
