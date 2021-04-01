package com.jayshil.javaapp;

public class Practical12 {
	public static void main(String[] args) {

		// declare variables
		int a = 12, b = 5;
		System.out.println("/*******Arithmetic Operators*******/");

		// addition operator
		System.out.println("a + b = " + (a + b));

		// subtraction operator
		System.out.println("a - b = " + (a - b));

		// multiplication operator
		System.out.println("a * b = " + (a * b));

		// division operator
		System.out.println("a / b = " + (a / b));

		// modulo operator
		System.out.println("a % b = " + (a % b));

		System.out.println("/*******Logical Operators*******/");
		// && operator
		System.out.println("(5 > 3) && (8 > 5) : "+((5 > 3) && (8 > 5)));  // true
		System.out.println("(5 > 3) && (8 < 5) : "+((5 > 3) && (8 < 5)));  // false

		// || operator
		System.out.println("(5 < 3) || (8 > 5) : "+((5 < 3) || (8 > 5)));  // true
		System.out.println("(5 > 3) || (8 < 5) : "+((5 > 3) || (8 < 5)));  // true
		System.out.println("(5 < 3) || (8 < 5) : "+((5 < 3) || (8 < 5)));  // false

		// ! operator
		System.out.println("!(5 == 3) : "+(!(5 == 3)));  // true
		System.out.println("!(5 > 3) : "+(!(5 > 3)));  // false

		System.out.println("/*******Bitwise Operators*******/");
		int c = 0b111,d = -7;
		// bitwise complement
		System.out.println("~7   : "+~c);

		// left shift operator
		int temp = c<<1;
		System.out.println("7<<1 : "+temp);

		// right shift operator
		temp = c >> 1;
		System.out.println("7>>1 : "+temp);

		// Unsigned right shift
		temp = d>>>1;
		System.out.println("-7>>>1 : "+temp);

		// bitwise and
		System.out.println("0b010 & 0b011 : "+(0b010 & 0b011));

		// bitwise exclusive or
		System.out.println("0b010 ^ 0b011 : "+(0b010 ^ 0b011));

		System.out.println("/*******Ternary Operators*******/");

		int februaryDays = 29;
		String result;

		// ternary operator
		result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		System.out.println(result);

		int e = 7, f = 11;

		System.out.println("/*******Relational Operators*******/");
		// value of a and b
		System.out.println("e is " + e + " and f is " + f);

		// == operator
		System.out.println("e == f : "+(e == f));  // false

		// != operator
		System.out.println("e != f : "+(e != f));  // true

		// > operator
		System.out.println("e > f  : "+(e > f));  // false

		// < operator
		System.out.println("e < f  : "+(e < f));  // true

		// >= operator
		System.out.println("e >= f : "+(e >= f));  // false

		// <= operator
		System.out.println("e <= f : "+(e <= f));  // true
	}
}
