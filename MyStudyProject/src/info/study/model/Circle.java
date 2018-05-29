package info.study.model;

public class Circle implements Shape{

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int getArea() {
		return (int) (Math.PI*radius*radius);
	}
	
	public Circle() {
	}

	public Circle(int radius) {
		this.radius = radius;
	}
	
}
