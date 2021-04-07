package com.jayshil.javaapp;

public class Practical42{

}

class BeforeSynchronization {
	void PrintLoop1() {
		for (int i = 0; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		BeforeSynchronization Object = new BeforeSynchronization();

		new Thread("First Thread"){
			public void run(){
				Object.PrintLoop1();
			}
		}.start();

		new Thread("Second Thread"){
			public void run(){
				Object.PrintLoop1();
			}
		}.start();
	}
}


class AfterSynchronization {
	synchronized void PrintLoop2(){
		for (int i = 0; i < 11; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		AfterSynchronization Object = new AfterSynchronization();

		new Thread("First Thread"){
			public void run(){
				Object.PrintLoop2();
			}
		}.start();

		new Thread("Second Thread"){
			public void run(){
				Object.PrintLoop2();
			}
		}.start();

	}

}

