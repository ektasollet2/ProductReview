package com.prgr.service;
import java.util.List;

import com.prgr.dao.ReviewDaoImpl;
import com.prgr.model.Review;


public class ReviewServiceImpl implements ReviewService {
	ReviewDaoImpl rdao;
	
	public ReviewServiceImpl(){
		rdao=new ReviewDaoImpl();
	}

	public Review addReview(Review review) {
		// TODO Auto-generated method stub
		return null;
	}

	public Review addRatings(Review ratings) {
		// TODO Auto-generated method stub
		return null;
	}

	public Review deleteReview(int reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Review> viewAllReview(List<Review> list) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Review> viewAllRatings(List<Review> list) {
		// TODO Auto-generated method stub
		return null;
	}
}
	