package com.jsp.Abstraction;

public  class Apple extends Mobile {
	
	@Override
	 public void call() {
		System.out.println("call feature");
	}

	@Override
	 public	void camera() {
		System.out.println("camera feature");
		
		
	}

	@Override
	 public	void internate() {
		System.out.println("internate feature");
		
	}

	@Override
	 public void gps() {
		System.out.println("gps feature");
		
	}

}
