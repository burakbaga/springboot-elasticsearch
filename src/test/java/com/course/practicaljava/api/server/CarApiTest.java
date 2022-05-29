package com.course.practicaljava.api.server;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.course.practicaljava.entity.Car;
import com.course.practicaljava.service.CarService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class CarApiTest {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testRandom() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Testing loop" + i);
			webTestClient.get().uri("/api/car/v1/random").exchange().expectBody(Car.class).value(car -> {
				assert (CarService.BRANDS.contains(car.getBrand()));
				assert (CarService.COLORS.contains(car.getColor()));
			});

		}

	}

	// @Test
	void testEcho() {
		fail("Not yet implemented");
	}

	// @Test
	void testRandomCar() {
		fail("Not yet implemented");
	}

	// @Test
	void testCountCar() {
		fail("Not yet implemented");
	}

	@Autowired
	@Qualifier("randomCarService")
	private CarService carService;

	@Test
	void testSaveCar() {
		var randomCar = carService.generateCar();

		webTestClient.post().uri("/api/car/v1").contentType(MediaType.APPLICATION_JSON).bodyValue(randomCar).exchange()
				.expectStatus().is2xxSuccessful();

	}

	// @Test
	void testGetCar() {
		fail("Not yet implemented");
	}

	// @Test
	void testUpdateCar() {
		fail("Not yet implemented");
	}

	// @Test
	void testFindCarsByBrandAndColor() {
		fail("Not yet implemented");
	}

	// @Test
	void testFindCarsByPath() {
		fail("Not yet implemented");
	}

	@Test
	void testFindCarsByParam() {

		final int size = 5;
		for (var brand : CarService.BRANDS) {
			for (var color : CarService.COLORS) {
				webTestClient.get()
						.uri(uriBuilder -> uriBuilder.path("/api/car/v1/cars").queryParam("brand", brand)
								.queryParam("color", color).queryParam("page", 0).queryParam("size", size).build())
						.exchange().expectBodyList(Car.class).value(cars -> {
							assertNotNull(cars);
							assertTrue(cars.size()<=size);
							

						});

			}
		}

	}

	// @Test
	void testFindCarsReleaseAfter() {
		fail("Not yet implemented");
	}

}
