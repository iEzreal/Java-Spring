package com.spring.aop;

public class BenzCar implements Car {

	@Override
	public void printName() {
		System.out.println("我是奔驰汽车");
	}

	@Override
	public void printColor() {
		System.out.println("我是黑色的奔驰汽车");
	}

}
