package com.jayshil.javaapp;

public class Practical9 {
	public static void main(String[] args) {
		int first_num = 7,second_num=15;
		System.out.println("Before swap the first number was :"+first_num);
		System.out.println("Before swap the second number was :"+second_num);
		first_num = first_num^second_num;
		second_num = first_num^second_num;
		first_num = first_num^second_num;
		System.out.println("After swap the first number is :"+first_num);
		System.out.println("After swap the second number is :"+second_num);
	}
}
