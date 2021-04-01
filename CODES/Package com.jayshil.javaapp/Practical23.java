package com.jayshil.javaapp;

class Pass_by_reference{
	public static void change(int x)
	{
		x=27;
		System.out.println("The value of x In change :"+x);
	}
}

public class Practical23 {
	//Pass by value

	public static void main(String[] args) {
		// Pass by reference
		Pass_by_reference obj = new Pass_by_reference();
		int x = 72;
		System.out.println("Pass by reference");
		System.out.println("The value before change :"+x);
		obj.change(x);
		System.out.println("The value after change :"+x);
		System.out.println("");
		System.out.println("Pass by Value");
		System.out.println("The value before change :"+x);
		pass_by_value(x);
		System.out.println("The value after change :"+x);

	}
	public static void pass_by_value(int x)
	{
		x=45;
		System.out.println("The value x in change :"+x);
	}
}
