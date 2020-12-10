package com.prgr.service;

import java.util.List;

import com.prgr.model.Product;
import com.prgr.model.Review;

public interface ReviewService {
	public Review addReviewRating(Review review);
	public Review deleteReview(int reviewId);
	public int getOverallRating(int productId);
	public List<Review> viewAllReviewRating(int productId);
}
