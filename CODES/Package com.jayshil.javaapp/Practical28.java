package com.jayshil.javaapp;

abstract class Test{
	abstract void callme();
	void callmetoo(){
		System.out.println("Callmetoo from Test class");
	}
}

class Test2 extends Test{
	@Override
	void callme() {
		System.out.println("Callme from Test2 class");
	}
}

public class Practical28 {
	public static void main(String[] args) {
		Test2 obj1 = new Test2();
		obj1.callme();
		obj1.callmetoo();
	}
}
