package com.prgr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//productid, name, category, sellername, rating ,description ,quantity,price.
@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	private Long productDetails;
	@Column(name = "PRODUCT_ID")
	private Long productId;
	@Column(name = "PRODUCT_NAME")
	private String productName;
	@Column(name = "PRODUCT_CATEGORY")
	private String category;
	@Column(name = "SELLER_NAME")
	private String personName;
	//@Column(name = "PRODUCT_RATING")
	//private Long rating;
	@Column(name = "PRODUCT_DESCRIPTION")
	private String description;
	@Column(name = "PRODUCT_PRICE")
	private Long price;
	

	public Product() {

	}

	public Product(Long productId, String productName, String category, String personName,
			String description, Long price ) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.personName = personName;
		//this.rating = rating;
		this.description = description;
		this.price = price;
	}

	public Long getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(Long productDetails) {
		this.productDetails = productDetails;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

//	public Long getRating() {
//		return rating;
//	}
//
//	public void setRating(Long rating) {
//		this.rating = rating;
//	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName
				+ ", category=" + category + ", personName=" + personName
				+ ", description=" + description + 
				", price=" + price + "]";
	}

}
