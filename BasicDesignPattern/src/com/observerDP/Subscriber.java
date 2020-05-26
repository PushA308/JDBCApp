package com.observerDP;

public class Subscriber implements Observer {

	String name;
	private Channel channel = new Channel();
	
	/* (non-Javadoc)
	 * @see com.observerDP.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Hey "+name+", vdo uploaded "+ channel.title);
	}
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.observerDP.Observer#subscribedChannel(com.observerDP.Channel)
	 */
	@Override
	public void subscribedChannel(Channel ch){
		channel =  ch;
	}
}
