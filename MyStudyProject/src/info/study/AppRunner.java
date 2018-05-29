package info.study;

import info.study.model.Circle;

public class AppRunner {

	public static void main(String[] args) {
		
		Circle circ1 = new Circle();
		circ1.setRadius(15);
		
		Circle circ2 = new Circle(25);
		
		System.out.println("Circle with radius " + circ1.getRadius() + " has area " + circ1.getArea());
		System.out.println("Circle with radius " + circ2.getRadius() + " has area " + circ2.getArea());
		
		
	}
}
