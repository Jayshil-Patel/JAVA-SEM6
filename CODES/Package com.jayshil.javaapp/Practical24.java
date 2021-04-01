package com.jayshil.javaapp;

class static_example{
	static int x = 60;
	static void fun()
	{
		System.out.println("Within Static");
	}
}
class this_example{
	int j;
	this_example(int j){
		this.j=j;
	}
}

public class Practical24 {
	public static void main(String[] args) {
		System.out.println("\nStatic Example");
		static_example.fun();
		System.out.println(static_example.x);
		static_example S1 = new static_example();
		static_example S2 = new static_example();
		System.out.println(S1.x);
		S1.fun();

		System.out.println("\nThis example");
		this_example new_obj = new this_example(5);
		System.out.println("Value of int by using this keyword : "+new_obj.j);

	}
}
