package com.jayshil.javaapp;

public class Practical41 extends Thread{

	public void run(){

		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+" "+i);
		}

	}


	public static void main(String[] args) {
		Practical41 FIRST = new Practical41();
		Practical41 SECOND = new Practical41();
		Practical41 THIRD = new Practical41();

		FIRST.setPriority(3);
		SECOND.setPriority(5);
		THIRD.setPriority(7);

//		FIRST.start();
//		SECOND.start();
//		THIRD.start();

		System.out.println("FIRST thread priority : " + FIRST.getPriority());
		System.out.println("SECOND thread priority : " + SECOND.getPriority());
		System.out.println("THIRD thread priority : " + THIRD.getPriority());
	}
}
