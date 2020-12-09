package com.prgr.service;

import java.util.List;

import com.prgr.model.Person;
import com.prgr.model.Feedback;
import com.prgr.model.Review;

public interface ReviewService {
	public Review addReview(Review review);
	public Review addRatings(Review ratings);
	public Review deleteReview(int reviewId);
	public List<Review> viewAllReview(List<Review> list);
	public List<Review> viewAllRatings(List<Review> list);
}
