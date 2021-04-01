package com.jayshil.javaapp;

class Animals{
	String name = "This is a dog";
}
class pet extends Animals{
	String name = "This is a cat";
	void type_of_pet()
	{
		System.out.println("Without super keyword : "+name);
		System.out.println("With super keyword : "+super.name);
	}
}

public class Practical29 {
	public static void main(String[] args) {
		pet obj = new pet();
		obj.type_of_pet();
	}
}
