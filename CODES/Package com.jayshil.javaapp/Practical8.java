package com.jayshil.javaapp;

public class Practical8 {
	public static void main(String[] args) {
		int first_num=41,second_num=54,third_num=884;
		if(first_num>second_num)
		{
			if(first_num>third_num)
			{
				System.out.println("The largest number is :"+first_num);
			}
			else {
				System.out.println("The largest number is :"+third_num);
			}
		}
		else if(second_num>third_num)
		{
			System.out.println("The largest number is :"+second_num);
		}
		else
		{
			System.out.println("The largest number is :"+third_num);
		}
	}
}
