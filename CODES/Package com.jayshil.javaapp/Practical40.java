package com.jayshil.javaapp;

public class Practical40 extends Thread {
	static int var_value = 5;
	public static void main(String[] args) {


		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before increment "+var_value);
				var_value=var_value+1;
			}
		},"Thread 1").start();


		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();


		}
		new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("Value after increment "+var_value);

			}
		},"Thread 2").start();
	}
}
