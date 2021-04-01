package com.jayshil.javaapp;


interface Initialization{
	void Dimensions();
	void area();
}

class Circle_area implements Initialization{
	int r = 0;
	double pi = 3.141, area = 0;
	public void Dimensions(){
		r = 5;
	}
	public void area(){
		area = pi * r * r;
		System.out.println("Area of circle is : "+area);
	}
}

class Rectangle_area implements Initialization{
	int l = 0, b = 0;
	double area;
	public void Dimensions(){
		l = 6;
		b = 4;
	}
	public void area(){
		area = l * b;
		System.out.println("Area of rectangle is :"+area);
	}
}

public class Practical32 {
	public static void main(String[] args) {
		Rectangle_area obj_1 = new Rectangle_area();
		obj_1.Dimensions();
		obj_1.area();

		Circle_area obj_2 = new Circle_area();
		obj_2.Dimensions();
		obj_2.area();
	}
}
