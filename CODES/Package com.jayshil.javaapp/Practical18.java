package com.jayshil.javaapp;
import java.util.StringTokenizer;
public class Practical18 {
	public static void main(String[] args) {
		StringTokenizer str=new StringTokenizer("I am Jayshil Patel"," ");
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken());
		}
	}
}
// this program uses class string tokenizer
// we have used hasMoreTokens
// stringTokenizer to separate string on basis of whitespace
// and nextToken

