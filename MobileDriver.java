package com.jsp.Abstraction;

public class MobileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Samsung samsung  = new Samsung();
samsung.call();
samsung.camera();
samsung.gps();
samsung.internate();

System.out.println("++++++++++++++++++++++++++");

Apple apple=new Apple();
apple.call();
apple.camera();
apple.internate();
apple.gps();
System.out.println("****************************");

Moto moto= new Moto();
moto.call();
moto.camera();
moto.gps();
moto.internate();
	
	}

}
