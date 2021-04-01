package com.jayshil.javaapp;

public class ThreadDemo extends Thread {
	static int sum = 0,i=0;
	int max = 0;
	public void run(){
		for (; i <= 100; i++) {
			sum =sum + i;
			System.out.println(getName()+" "+sum);

		}

	}

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		ThreadDemo t4 = new ThreadDemo();
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