package com.prgr.service;

import java.util.List;
import com.prgr.model.Product;

public interface ProductService {
	public Product addProduct(Product product);
	 public int updateProduct(Product product);
	 public List<Product> viewAllProduct();
}
