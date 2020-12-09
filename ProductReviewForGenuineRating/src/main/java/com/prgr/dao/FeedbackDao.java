package com.prgr.dao;

import java.util.List;

import com.prgr.model.Feedback;

public interface FeedbackDao {
	public Feedback addFeedback(Feedback feedback);
	public List<Feedback> viewAllFeedback(List<Feedback> list);
	public Feedback deleteFeedback(int feedbackId);
}
