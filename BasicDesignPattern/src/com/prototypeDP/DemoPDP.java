package com.prototypeDP;

public class DemoPDP {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.setShopName("abc");
		bs.loadData();		
		
		BookShop bs1 = (BookShop) bs.clone();
		bs1.setShopName("abc");
		bs1.loadData();
		bs.getBook().remove(2);
		
		System.out.println(bs);
		System.out.println(bs1);
	}

}
