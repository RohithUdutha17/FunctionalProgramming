package com.functionalprogramming;

public class Shape {

	void calculateResult(Area area) {
		area.calculateArea(5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
	//	Area area  = (a)->System.out.println(a*a);				
		shape.calculateResult((a)->System.out.println(a*a));	//passing function definition as an argument to type Area
	}

}
