package com.prgr.service;

import java.util.List;

import com.prgr.dao.ProductDaoImpl;
import com.prgr.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDaoImpl productDao;
	public Product addProduct(Product product) {

		return productDao.addProduct(product);
	}

	public int updateProduct(Product product) {
		return 0;
	}

	public List<Product> viewAllProduct() {

		return productDao.viewAllProduct();
	}
}
