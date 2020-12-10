package com.prgr.service;

import java.util.List;
import java.util.Map;

import com.prgr.dao.ProductDao;
import com.prgr.dao.ProductDaoImpl;
import com.prgr.model.Product;
import com.prgr.model.Review;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	public ProductServiceImpl(){
		productDao=new ProductDaoImpl();
	}
	public Product addProduct(Product product) {
		productDao.addProduct(product);
		return product;
	}

	public Product updateProduct(Product product) {

		productDao.updateProduct(product);
		return product;
	}

	public int deleteProduct(int product) {
		productDao.deleteProduct(product);
		return product;
	}
	public List<Product> viewAllProduct() {

		return productDao.viewAllProduct();
	}


	public Map<Product,List<Review>> viewSingleProduct(int prodId) {
		Map<Product,List<Review>> product=productDao.viewSingleProduct(prodId);
		return product;
	}
	public List<Product> viewBasedOnCategory(String Category) {
		// TODO Auto-generated method stub
		return productDao.viewBasedOnCategory(Category);
	}
	public Map<Product, Product> compareProduct(int productId1, int productId2) {
		// TODO Auto-generated method stub
		return productDao.compareProduct(productId1, productId2);
	}
}
