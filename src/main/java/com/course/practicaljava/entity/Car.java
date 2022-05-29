package com.course.practicaljava.entity;

import java.time.LocalDate;

public class Car {

	private String brand;
	private String color;
	private String type;
	private int price;
	private boolean available;
	private LocalDate firstReleaseDate;

	public Car() {

	}

	public Car(String brand, String color, String type) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
	}

	public Car(String brand, String color, String type, int price, boolean available, LocalDate firstReleaseDate) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.price = price;
		this.available = available;
		this.firstReleaseDate = firstReleaseDate;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public LocalDate getFirstReleaseDate() {
		return firstReleaseDate;
	}

	public int getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFirstReleaseDate(LocalDate firstReleaseDate) {
		this.firstReleaseDate = firstReleaseDate;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + ", available="
				+ available + ", firstReleaseDate=" + firstReleaseDate + "]";
	}
}
