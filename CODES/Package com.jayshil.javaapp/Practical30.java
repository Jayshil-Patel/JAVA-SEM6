package com.jayshil.javaapp;

class firstclass{
	int first_var = 4;
}

class secondclass extends firstclass{
	int second_var = 8;
}

class third_class extends secondclass{
	int third_var = 2;
}

class fourth_class extends third_class{
	int fourth_var = 10;
}

public class Practical30 {
	public static void main(String[] args) {
		fourth_class obj = new fourth_class();
		int average = (obj.first_var+obj.second_var+ obj.third_var+obj.fourth_var)/4;
		System.out.println("The average of numbers is : "+average);
	}
}
