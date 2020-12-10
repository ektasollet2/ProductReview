package com.prgr.service;

import java.util.List;

import com.prgr.model.Person;
import com.prgr.model.Feedback;

public interface FeedbackService {
	public Feedback addFeedback(Feedback feedback);
	public List<Feedback> viewAllFeedback();
	public Feedback deleteFeedback(int feedbackId);
}
