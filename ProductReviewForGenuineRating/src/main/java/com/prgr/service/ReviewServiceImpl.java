package com.prgr.service;
import java.util.List;

import com.prgr.dao.ReviewDaoImpl;
import com.prgr.model.Product;
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

	public Review deleteReview(int reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getOverallRating(Review review) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Review> viewAllRatings(Product productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
	