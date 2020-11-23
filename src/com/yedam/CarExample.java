package com.yedam;

public class CarExample {
	public static void main(String[] args) {
		Car z1 = new Car();
		System.out.println(z1.getCompany());
		System.out.println(z1.getMaxSpeed());

		Car z2 = new Car("현대", "Sonata", "White",200);
		System.out.println(z2.getCompany());
		System.out.println(z2.getMaxSpeed());

		Car z3 = new Car("SAMSUNG", "Sm5");
		z3.setColor("red");
		z3.setMaxSpeed(150);

		Car z4 = new Car("SAMSUNG", "Sm3");
		z4.setColor("black");
		z4.setMaxSpeed(180);

		Car[] cars = { z1, z2, z3, z4 };
		for (Car car : cars) {
			if (car != null) {
				if (("SAMSUNG").equals(car.getCompany())) {
					System.out.println(car.getModel());
					System.out.println(car.getMaxSpeed());
				}

			}

		}

	}

}
