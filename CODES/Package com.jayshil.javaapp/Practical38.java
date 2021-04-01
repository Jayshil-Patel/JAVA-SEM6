package com.jayshil.javaapp;

public class Practical38 extends Thread{
	public void run(){
		System.out.println("Hello World");
	}


	public static void main(String[] args) {
		Practical38 obj1 = new Practical38();
		obj1.run();

	}
}

class Practical38_part2 implements Runnable{
	public void run(){
		System.out.println("Hello World from Runnable");
	}

	public static void main(String[] args) {
		Practical38_part2 obj2 = new Practical38_part2();
		obj2.run();
	}
}