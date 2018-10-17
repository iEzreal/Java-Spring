package com.spring.bean;

public class Car {
	private String name;
	private String color;
	private int price;

	public Car(String name, String color, int price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
}
