package com.jayshil.javaapp;

import java.io.*;
public class Practical35 {
	public static void main(String[] args) {

		/******************************************************************************************/
		int a = 5, b = 0;
		try{
			System.out.println("a/b = "+a/b);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred");
		}
		/******************************************************************************************/





		/******************************************************************************************/
		int[] Array = new int[5];
		try{
			System.out.println(Array[7]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out of Bounds Exception");
		}
		/******************************************************************************************/





		/******************************************************************************************/
		try {
			Class.forName("MyclassC");
		}
		catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exception");
		}
		/******************************************************************************************/





		/******************************************************************************************/
		try{
			File file = new File("myFile");
			FileInputStream fis = new FileInputStream(file);
			System.out.println("Hello");
		}
		catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception");
		}
		/******************************************************************************************/





		/******************************************************************************************/
		String str = "Jayshil";

		try{
			System.out.println(str.charAt(9));

		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("String index out of bound exception");
		}
		/******************************************************************************************/





		/******************************************************************************************/
		try {
			int num = Integer.parseInt ("Jayshil") ;
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("Number format exception");
		}
		/******************************************************************************************/


	}
}
