package com.jayshil.javaapp;


public class Main {

    public static void main(String[] args) {
        int a= 5,b=2;
        try
        {
            int c =a/b;
            System.out.println("c");

        }
        catch (ArithmeticException e)
        {
            System.out.println("error");

        }
        finally {
            System.out.println("no");
        }
    }
}


