package com.prgr.service;
import java.util.List;

import com.prgr.dao.ReviewDaoImpl;
import com.prgr.model.Product;
import com.prgr.model.Review;


public class ReviewServiceImpl implements ReviewService {
	ReviewDaoImpl reviewDao;
	
	public ReviewServiceImpl(){
		reviewDao=new ReviewDaoImpl();
	}

	
	public Review deleteReview(int reviewId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getOverallRating(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Review> viewAllReviewRating(int productId) {
		// TODO Auto-generated method stub
		return null;
	}


	public Review addReviewRating(Review review) {
		// TODO Auto-generated method stub
		return reviewDao.addReviewRating(review);
	}

}
	