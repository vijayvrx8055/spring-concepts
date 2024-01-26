package com.vrx.spring.core;

import com.vrx.spring.core.looseCoupling.Bus;
import com.vrx.spring.core.looseCoupling.Car;
import com.vrx.spring.core.looseCoupling.Person;
import com.vrx.spring.core.looseCoupling.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreConceptsApplication {

	public static void main(String[] args) {

		// for tight coupling
//		Car car = new Car();
//		car.startEngine();

		//for loose coupling : use interface
//		Vehicle vehicle = new Car();
		Vehicle vehicle = new Bus();
		Person person = new Person(vehicle);
		person.useVehicle();

		SpringApplication.run(SpringCoreConceptsApplication.class, args);
	}

}
