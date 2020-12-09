package com.prgr.service;

import java.util.List;
import java.util.Map;

import com.prgr.dao.ProductDaoImpl;
import com.prgr.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDaoImpl productDao;
	public ProductServiceImpl(){
		productDao=new ProductDaoImpl();
	}
	public Product addProduct(Product product) {
		productDao.addProduct(product);
		return product;
	}

	public int updateProduct(Product product) {
		return 0;
	}

	public List<Product> viewAllProduct() {

		return productDao.viewAllProduct();
	}

	public Map compareProduct(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product viewSingleProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
}
