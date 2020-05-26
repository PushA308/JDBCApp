package com.observerDP;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private List<Subscriber> subs = new ArrayList<Subscriber>();
	
	String title;
	
	/* (non-Javadoc)
	 * @see com.observerDP.Subject#subscibe(com.observerDP.Subscriber)
	 */
	@Override
	public void subscibe(Subscriber sub) {
		subs.add(sub);
	}
	
	/* (non-Javadoc)
	 * @see com.observerDP.Subject#unsubscribe(com.observerDP.Observer)
	 */
	@Override
	public void unsubscribe(Observer sub) {
		subs.remove(sub);
	}
	
	/* (non-Javadoc)
	 * @see com.observerDP.Subject#notifySubscriber()
	 */
	@Override
	public void notifySubscriber() {
		for (Observer sub: subs) {
			sub.update();
		}
	}
	
	/* (non-Javadoc)
	 * @see com.observerDP.Subject#upload(java.lang.String)
	 */
	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}
	
}






