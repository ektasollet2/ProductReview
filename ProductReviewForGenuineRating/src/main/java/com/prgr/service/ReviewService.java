package com.prgr.service;

import java.util.List;

import com.prgr.model.Product;
import com.prgr.model.Review;

public interface ReviewService {
	public Review addReview(Review review);
	public Review deleteReview(int reviewId);
	public int getOverallRating(Review review);
	public List<Review> viewAllRatings(Product productId);
}
