package com.jayshil.javaapp;

class Person{
	String Name = "Jayshil Patel";
	int Age = 20;
	float Salary = 10000.0f;
	void display()
	{
		System.out.println("Name is :"+Name);
		System.out.println("Age is :"+Age);
		System.out.println("Salary is :"+Salary);
	}

}

public class Practical19 {
	public static void main(String[] args) {
		Person person = new Person();
		person.display();
	}
}
