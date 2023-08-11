package com.functionalprogramming;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerDemo {

	ArrayList<CallQualityFeedback> callQualityFeedbackList = new ArrayList<>();
	
	public ConsumerDemo() {
		callQualityFeedbackList.add(new CallQualityFeedback(1,"9865262728","Excellent",10));
		callQualityFeedbackList.add(new CallQualityFeedback(2,"9675262720","Good",8));
		callQualityFeedbackList.add(new CallQualityFeedback(3,"9235262726","Average",6));
		callQualityFeedbackList.add(new CallQualityFeedback(4,"9195262723","poor",2));
	}
	
	public void evaluateFeedback(Consumer<CallQualityFeedback> callQualityFeedback) {
		for(CallQualityFeedback eachCallQuality:callQualityFeedbackList) {
			callQualityFeedback.accept(eachCallQuality);
		}
	}
	
	public void checkQuality(Predicate<CallQualityFeedback> callQualityFeedback) {
		for(CallQualityFeedback eachCallQuality:callQualityFeedbackList) {
			if(callQualityFeedback.test(eachCallQuality)) {
				System.out.println("Call quality is good");
			}else {
				System.out.println("Call quality is bad");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsumerDemo consumerDemo = new ConsumerDemo();
		consumerDemo.evaluateFeedback((call)->System.out.println("customer Id :"+call.getCustomerId()+" customer Feedback : "+call.getFeedBackDescription()));
		consumerDemo.checkQuality((call)->call.getRating()>3);
	}

}
