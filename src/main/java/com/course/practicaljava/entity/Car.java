package com.course.practicaljava.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@Document(indexName="cars-index")
public class Car {
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String brand;
	private String color;
	private String type;
	private int price;
	private boolean available;
	@Field(type=FieldType.Date,format=DateFormat.date)
	@JsonFormat(pattern="yyyy-MM-dd",timezone="Europe/Istanbul")
	private LocalDate firstReleaseDate;
	@JsonInclude(value=Include.NON_EMPTY)
	private List<String> additionalFeatures;
	@JsonInclude(value = Include.NON_EMPTY)
	private String secretFeature;

	@JsonUnwrapped
	private Engine engine;
	private List<Tire> tires;
	
	
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

	public List<String> getAdditionalFeatures() {
		return additionalFeatures;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public Engine getEngine() {
		return engine;
	}

	public LocalDate getFirstReleaseDate() {
		return firstReleaseDate;
	}

	public int getPrice() {
		return price;
	}

	public List<Tire> getTires() {
		return tires;
	}

	public String getType() {
		return type;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAdditionalFeatures(List<String> additionalFeatures) {
		this.additionalFeatures = additionalFeatures;
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

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setFirstReleaseDate(LocalDate firstReleaseDate) {
		this.firstReleaseDate = firstReleaseDate;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTires(List<Tire> tires) {
		this.tires = tires;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + ", available="
				+ available + ", firstReleaseDate=" + firstReleaseDate + ", additionalFeatures=" + additionalFeatures
				+ ", secretFeature=" + secretFeature + ", engine=" + engine + ", tires=" + tires + "]";
	}

	public String getSecretFeature() {
		return secretFeature;
	}

	public void setSecretFeature(String secretFeature) {
		this.secretFeature = secretFeature;
	}

}
