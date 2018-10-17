package com.spring.aop;

public class BWMCar implements Car {

	@Override
	public void printName() {
		System.out.println("这是宝马汽车");
	}

	@Override
	public void printColor() {
		System.out.println("这是红色的宝马汽车");
	}

}
