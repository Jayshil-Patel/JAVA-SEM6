package com.jayshil.javaapp;

interface k1{
	int a=1;
	void mk();
}

interface k2 extends k1{
	void mk();
}

interface k3 extends k2{
	void mk();
}

class u implements k3{
	public void mk(){
		System.out.println("a="+a);
	}
}

public class Practical31{
	public static void main(String[] args){
		u u1=new u();
		u1.mk();
	}
}
