package com.compositeDP;

public class CompositeTest {

	public static void main(String[] args) {
		Component hd = new leaf(4000,"hdd");
		Component mouse = new leaf(500,"mouse");
		Component keyboard = new leaf(700,"keyboard");
		Component ram = new leaf(5000,"RAM");
		Component cpu = new leaf(9000,"CPU");

		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite mb = new Composite("Mother Board");
		Composite comp = new Composite("Computer");
		
		mb.addComponent(cpu);
		mb.addComponent(ram);
		
		ph.addComponent(mouse);
		ph.addComponent(keyboard);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(mb);
		
		comp.addComponent(cabinet);
		comp.addComponent(ph);
		
		comp.showPrice();
	}

}
