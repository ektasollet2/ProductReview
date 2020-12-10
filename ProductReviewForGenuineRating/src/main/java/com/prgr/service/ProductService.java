package com.prgr.service;

import java.util.List;
import java.util.Map;

import com.prgr.model.Product;
import com.prgr.model.Review;

public interface ProductService {
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	 public int deleteProduct(int product);
	 public Map<Product,Product> compareProduct(int productId1,int productId2 );
	 public List<Product> viewAllProduct();
	 public Map<Product,List<Review>> viewSingleProduct(int prodId);
	 public List<Product> viewBasedOnCategory(String Category);
}
