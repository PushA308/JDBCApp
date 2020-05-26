package com.observerDP;

public class DemoYT {
	public static void main(String str[]) {
		
		Channel telusko = new Channel();
		
		Subscriber s1 = new Subscriber("Piyush");
		Subscriber s2 = new Subscriber("Kunal");
		Subscriber s3 = new Subscriber("Subodh");
		Subscriber s4 = new Subscriber("Ajay");
		Subscriber s5 = new Subscriber("Saurabh");
		Subscriber s6 = new Subscriber("Saket");
		Subscriber s7 = new Subscriber("Shubham");

		telusko.subscibe(s1);
		telusko.subscibe(s2);
		telusko.subscibe(s3);
		telusko.subscibe(s4);
		telusko.subscibe(s5);
		telusko.subscibe(s6);
		telusko.subscibe(s7);
		
		
		telusko.unsubscribe(s3);
		
		s1.subscribedChannel(telusko);
		s2.subscribedChannel(telusko);
		s3.subscribedChannel(telusko);
		s4.subscribedChannel(telusko);
		s5.subscribedChannel(telusko);
		s6.subscribedChannel(telusko);
		s7.subscribedChannel(telusko);
		
		telusko.upload("how to getting started with java");

	}
}






