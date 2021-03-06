package com.prgr.service;
import java.util.List;




import com.prgr.dao.FeedbackDao;
import com.prgr.dao.FeedbackDaoImpl;
import com.prgr.model.Feedback;


public class FeedbackServiceImpl implements FeedbackService {
	private FeedbackDao fdao;
	public FeedbackServiceImpl() 
	{
		fdao= new FeedbackDaoImpl();
	}
	public Feedback addFeedback( Feedback feedback) {
		
		return fdao.addFeedback(feedback);
	}

	public List<Feedback> viewAllFeedback() {
		
		return fdao.viewAllFeedback();
	}

	public Feedback deleteFeedback(int feedbackId) {
		return fdao.deleteFeedback(feedbackId);
	}
	
}
