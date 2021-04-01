package com.jayshil.javaapp;
interface Shape1
{
	void input();
	void area();
}
class Circle1 implements Shape1
{
	int r = 0;
	double pi = 3.14, ar = 0;
	@Override
	public void input()
	{
		r = 5;
	}
	@Override
	public void area()
	{
		ar = pi * r * r;
		System.out.println("Area of circle:"+ar);
	}
}
class Rectangle1 extends Circle1
{
	int l = 0, b = 0;
	double ar;
	public void input()
	{
		super.input();
		l = 6;
		b = 4;
	}
	public void area()
	{
		super.area();
		ar = l * b;
		System.out.println("Area of rectangle:"+ar);
	}
}
public class Demo
{
	public static void main(String[] args)
	{
		Rectangle1 obj = new Rectangle1();
		obj.input();
		obj.area();
	}
}