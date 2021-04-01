package com.jayshil.javaapp;

class Shape{
	double dimension_1 = 15.5,dimension_2 = 12.2;
	void get_data(){

	}
	void display_area(){

	}

}
class Triangle extends Shape{
	@Override
	void display_area() {
			double area = 0.5*dimension_1*dimension_2;
			System.out.println("Area of triangle is : "+area);
		}
	}

class Rectangle extends Shape{
	@Override
	void display_area() {
		double area = dimension_1*dimension_2;
		System.out.println("Area of rectangle is : "+area);
	}
}

public class Practical25 {
	public static void main(String[] args) {
		Rectangle obj_0 = new Rectangle();
		obj_0.display_area();
		Triangle obj_1 = new Triangle();
		obj_1.display_area();

	}
}
