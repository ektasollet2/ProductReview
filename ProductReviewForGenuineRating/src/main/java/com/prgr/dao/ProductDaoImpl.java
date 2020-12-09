package com.prgr.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.prgr.model.Product;
import com.prgr.utility.JPAUtility1;

public class ProductDaoImpl implements ProductDao {
	private EntityManager entityManager;
	
	public ProductDaoImpl() {
		entityManager = JPAUtility1.getEntityManager();
	}

	public Product addProduct(Product product) {
		entityManager.getTransaction().begin();
		entityManager.persist(product);
		entityManager.getTransaction().commit();
		return product;
	}

	public int updateProduct(Product product) {

		
		return 1;
	}

	public List<Product> viewAllProduct() {
		Query query=entityManager.createQuery("from Product");
		List<Product> list=query.getResultList();
		return list;
	}

	

	public Map compareProduct(Product p1, Product p2) {
		return null;
	}

	public Product viewSingleProduct(int prodId) {
		Product person=entityManager.find(Product.class, prodId);
		return person;
	}

	public List<Product> viewBasedOnCategory(String Category) {
		Query query=entityManager.createQuery("from Product where Product_Category=?");
		query.setParameter(1,Category);
		List<Product> product=query.getResultList();
		return product;
	}
}
