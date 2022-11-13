package com.shapes.org;

public class Circle {
	
	private int radius;
	
	public void radsRadius(int radius) {    //it comes without using set and get method
		this.radius = radius;
	}

	public int radgRadius() {
		return radius;
	}
	
	public double areaOfCircle() {
		return (Math.PI)*radius*radius;
	}
	
	public double perimeterOfCircle() {
		return 2*(Math.PI)*radius;
	}

	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.radsRadius(5);
		System.out.println("Math of PI value : "+Math.PI);
		System.out.println("Area of the Circle : "+obj.areaOfCircle());
		System.out.println("Perimeter of the Circle : "+obj.perimeterOfCircle());
	}

}
