package com.prgr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.prgr.model.Review;
import com.prgr.utility.JPAUtility1;

public class ReviewDaoImpl implements ReviewDao{
	private EntityManager entityManager;
	
	public ReviewDaoImpl(){
		entityManager=JPAUtility1.getEntityManager();
	}

	public Review addReview( Review review) {
		entityManager.getTransaction().begin();
		entityManager.persist(review);
		entityManager.getTransaction().commit();
		return review;
	}

	public List<Review> viewAllReview(List<Review> list) {
		TypedQuery<Review> query =
			      entityManager.createQuery("SELECT c FROM Review c", Review.class);
		List<Review> list1=query.getResultList();
		return list1;
	}
	public Review addRatings( Review ratings) {
		entityManager.getTransaction().begin();
		entityManager.persist(ratings);
		entityManager.getTransaction().commit();
		return ratings;
	}

	public List<Review> viewAllRatings(List<Review> list) {
		TypedQuery<Review> query =
			      entityManager.createQuery("SELECT c FROM Review c", Review.class);
		List<Review> list1=query.getResultList();
		return list1;
	}

	public Review deleteReview(int reviewId) {
		entityManager.getTransaction().begin();
		Review pr=entityManager.find(Review.class, reviewId);
		entityManager.remove(pr);
		entityManager.getTransaction().commit();
		return pr;
	}

	public Review deleteRatings(Review ratings) {
		// TODO Auto-generated method stub
		return null;
	}

	}
