package com.jayshil.javaapp;

abstract class Figures{
	abstract void area(double dimension_1);
}

class subclass extends Figures{
	@Override
	void area(double dimension_1) {
		double area = dimension_1*dimension_1;
		System.out.println("The area of Square is : "+area);
	}
}

public class Practical27 {
	public static void main(String[] args) {
		subclass subobj = new subclass();
		subobj.area(4.0);
	}
}
