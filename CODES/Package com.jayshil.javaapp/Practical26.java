package com.jayshil.javaapp;

class Figure{
	double dimension_1 = 5.0 , dimension_2 = 7.0;
	void area()
	{
		System.out.println("No object created");
	}
}

class triangle extends Figure{
	double area = 0.5*dimension_1*dimension_2;

	@Override
	void area() {
		System.out.println("Area of triangle is : "+area);
	}
}

class square extends Figure{
	double area = dimension_1*dimension_1;

	@Override
	void area() {
		System.out.println("Area of square is : "+area);
	}
}

public class Practical26 {
	public static void main(String[] args) {
		triangle triobj = new triangle();
		triobj.area();

		square sqobj = new square();
		sqobj.area();
	}
}