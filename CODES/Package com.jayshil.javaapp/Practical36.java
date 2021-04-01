package com.jayshil.javaapp;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
}

public class Practical36 {
	static void validate(int age)throws InvalidAgeException{
		if(age<18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]){


		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Your age :");
		int number = myObj.nextInt();


		try{
			validate(number);
		}catch(Exception m){System.out.println("Exception occured: "+m);}

		System.out.println("rest of the code...");
	}
}

