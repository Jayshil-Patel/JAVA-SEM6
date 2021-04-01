package com.jayshil.javaapp;

public class Practical11 {
	public static void main(String[] args) {
		int month=4;
		switch (month)
		{
			case 12,1,2:
				System.out.println("April lies in Winter");
				break;
			case 3,4,5:
				System.out.println("April lies in Spring");
				break;
			case 6,7,8:
				System.out.println("April lies in Summer");
				break;
			case 9,10,11:
				System.out.println("April lies in Autumn");
				break;
		}
	}
}