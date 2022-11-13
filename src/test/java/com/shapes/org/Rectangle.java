package com.shapes.org;

public class Rectangle {
	
	private int length;
	private int breadth;
	
	public void lLength(int length) {  
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void bBreadth(int breadth) {
		this.breadth=breadth;
	}
	public int getBreadth() {
		return breadth;
	}
	
	public int area() {
		return length*breadth;
	}
	public int perimeter() {
		return 2 * length*breadth;
	}


}
