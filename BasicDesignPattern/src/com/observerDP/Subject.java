package com.observerDP;

public interface Subject {

	void subscibe(Subscriber sub);

	void unsubscribe(Observer sub);

	void notifySubscriber();

	void upload(String title);

}