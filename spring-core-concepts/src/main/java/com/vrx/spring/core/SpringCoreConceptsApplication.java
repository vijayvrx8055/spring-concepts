package com.vrx.spring.core;

import com.vrx.spring.core.tightCouple.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		Car car = new Car();
		car.startEngine();

		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

}
