package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {

		Car bmw = new BMW("BMW");
		Car tesla = new Tesla("Tesla");
		Car merc = new Mercedes("Mercedes");
		Car honda = new Honda("Honda");

		Car[] cars = { new BMW("BMW"), new Tesla("Tesla"), new Mercedes("Mercedes"), new Honda("Honda") };
		
		for(Car c:cars) {
			c.start();
			c.display();
			System.out.println(" ------------   ");
		}
		
	}
}
