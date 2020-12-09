package com.prgr.dao;

import java.util.List;

import com.prgr.model.Product;
import com.prgr.model.Review;

public interface ReviewDao {
	public Review addReview(Review review);
	public Review deleteReview(int reviewId);
	public List<Review> viewAllReview(Product productId);
	}
