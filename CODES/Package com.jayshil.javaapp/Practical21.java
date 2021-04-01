package com.jayshil.javaapp;

class Circle{
	double Radius;
	double x_coord,y_coord;

	Circle(double Radius){
		this.Radius=Radius;

	}
	Circle(double x_coord,double y_coord, double Radius){
		this.Radius=Radius;
		this.x_coord=x_coord;
		this.y_coord=y_coord;

	}
	void Get_Area(){
		double Area = 3.141*Radius*Radius;
		System.out.println("The Area of the Circle is : "+Area);
	}

}

public class Practical21 {
	public static void main(String[] args) {
		Circle example = new Circle(5.0,7.0,55);
		example.Get_Area();
	}
}
