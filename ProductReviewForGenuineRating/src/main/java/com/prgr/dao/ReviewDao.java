package com.prgr.dao;

import java.util.List;

import com.prgr.model.Review;

public interface ReviewDao {
	public Review addReview(Review review);
	public Review addRatings(Review ratings);
	public Review deleteReview(int reviewId);
	public Review deleteRatings(Review ratings);
	public List<Review> viewAllReview(List<Review> list);
	}
