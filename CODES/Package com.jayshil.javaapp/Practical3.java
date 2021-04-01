package com.jayshil.javaapp;

public class Practical3 {
	public static void main(String[] args) {


		int first=0;                         // to start Fibonacci series we
		int second=1;                        //should have initial 2 values
		int temp1;
	        System.out.print(first+" ");
	        System.out.print(second+" ");

	        for(int i=0;i<25;i++)                // Loop iterates 25 times
		{
			temp1=first+second;
			System.out.print(temp1+" ");
			first=second;                    // exchanging the values to continue the loop
			second=temp1;
		}
	}
}
