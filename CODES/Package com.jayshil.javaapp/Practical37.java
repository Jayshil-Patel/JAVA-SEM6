package com.jayshil.javaapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practical37 {
	public static void main(String[] args) {
		Scanner Input_obj = new Scanner(System.in);
		System.out.println("Enter a number : ");

		try {
			int number1 = Input_obj.nextInt();
			int number2 = 100/number1;
			System.out.println("Answer is "+number2);
		}
		catch (InputMismatchException E){
			System.out.println("Input Mismatch exception generated");
		}

		catch (ArithmeticException AE){
			System.out.println("Arithmetic Exception occured");
		}

		finally {
			System.out.println("The code ends.");
		}
	}
}
