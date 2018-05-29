package info.study;

import info.study.model.Circle;
//import info.study.model.Square;
import info.study.model.Shape;
import info.study.model.Square;

public class AppRunner {

	public static void main(String[] args) {
		
//		Square square1 = new Square();
//		square1.setSide(5);
//		
//		System.out.println(square1.getArea());
		
		Circle circ1 = new Circle();
		circ1.setRadius(15);
		
		Circle circ2 = new Circle(25);
		
		System.out.println("Circle with radius " + circ1.getRadius() + " has area " + circ1.getArea());
		System.out.println("Circle with radius " + circ2.getRadius() + " has area " + circ2.getArea());
		
		
	}
}
