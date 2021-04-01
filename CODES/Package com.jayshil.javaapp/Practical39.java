package com.jayshil.javaapp;

public class Practical39 extends Thread {
	static int sum = 0,i=0;
	int max = 0;
	public void run(){
		for (; i <= 100; i++) {
			sum =sum + i;
			System.out.println(getName()+" "+sum);

		}

	}

	public static void main(String[] args) {
		Practical39 t1 = new Practical39();
		Practical39 t2 = new Practical39();
		Practical39 t3 = new Practical39();
		Practical39 t4 = new Practical39();
		t1.start();
		try {
			sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		t4.start();

	}
}