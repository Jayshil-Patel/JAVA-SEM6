package com.jayshil.javaapp;

public class Practical7 {
	public static void main(String[] args) {
		int given_number = 7;
		long factorial_ans = 1;
		int temp = 1;
		while (temp<=given_number)
		{
			factorial_ans=factorial_ans*temp;
			temp++;
		}
		System.out.println("The factorial is : "+factorial_ans);

	}
}
