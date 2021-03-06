package com.course.practicaljava.service;

import java.util.List;

import com.course.practicaljava.entity.Car;

public interface CarService {
	
	List<String> BRANDS = List.of("Toyota","Honda","Ford","BMW","Mitsubishi");
	List<String> COLORS = List.of("Red","Black","White","Blue","Silver");
	List <String> TYPES = List.of("Sedan","SUV","MPV","Hatchback","Convertible");
	List<String> ADDITIONAL_FEATURES = List.of("GPS","Alarm","Sunroof","Media player","Leather seats");
	
	List<String> FUELS =List.of("Petrol","Electric","Hybrid");
	
	List<String> TIRE_MANUFACTURES = List.of("Goodyear","Bridgestone","Dunlop");
	
	
	Car generateCar();
}
