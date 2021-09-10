package abstracts.entities;

import abstracts.enums.Colors;

public class Circle extends Shape {

	private double radius;

	public Circle() {
		super();
	}

	public Circle(Colors color, double radius) {
		super(color);
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area1() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

}
