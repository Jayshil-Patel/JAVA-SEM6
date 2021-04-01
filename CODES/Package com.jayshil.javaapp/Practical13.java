package com.jayshil.javaapp;

public class Practical13 {
	public static void main(String[] args) {
		int a = 27;
		double converted=(double) a;
		System.out.println("original Int value : "+a);
		System.out.println("Int to double : "+converted);

		double newDouble = 9.78;
		int newInt = (int) newDouble;
		System.out.println("");
		System.out.println("original double value: "+newDouble);
		System.out.println("Double to Int: "+newInt);

		int num = 10;
		System.out.println("");
		System.out.println("The integer value is: " + num);
		// converts int to string type
		String data = String.valueOf(num);
		System.out.println("The string value is: " + data);


		System.out.println("");
		String str = "15";
		System.out.println("The string value is: " + str);
		// convert string variable to int
		int number = Integer.parseInt(str);
		System.out.println("The integer value is: " + number);
	}
}
