package p2;  //user defined Package

import p1.MyClassA;

public class MyClassB extends MyClassA {
	public static void main(String[] args) {
		MyClassB b = new MyClassB();
		System.out.println("In Class B");
		b.ShowMessage();
	}
}
