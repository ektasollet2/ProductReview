package com.prgr.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.prgr.model.Feedback;
import com.prgr.utility.JPAUtility1;

public class FeedbackDaoImpl implements FeedbackDao{
	private EntityManager entityManager;
	
	public FeedbackDaoImpl(){
		entityManager=JPAUtility1.getEntityManager();
	}

	public Feedback addFeedback( Feedback feedback) {
		entityManager.getTransaction().begin();
		entityManager.persist(feedback);
		entityManager.getTransaction().commit();
		return feedback;
	}
	public Feedback deleteFeedback(int feedbackId) {
		entityManager.getTransaction().begin();
		Feedback fb=entityManager.find(Feedback.class, feedbackId);
		entityManager.remove(fb);
		entityManager.getTransaction().commit();
		return fb;
	}

	public List<Feedback> viewAllFeedback() {
		// TODO Auto-generated method stub
		return null;
	}

}
