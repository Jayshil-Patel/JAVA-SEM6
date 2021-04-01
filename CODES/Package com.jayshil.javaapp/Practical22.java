package com.jayshil.javaapp;

class Stack_class{
	// Creating a Stack
	java.util.Stack<String> stackOfCards = new java.util.Stack<>();

	// Pushing new items to the Stack
	void Stack_Push() {
		stackOfCards.push("Jack");
		stackOfCards.push("Queen");
		stackOfCards.push("King");
		stackOfCards.push("Ace");

		System.out.println("Stack => " + stackOfCards);
		System.out.println();
	}


	// Popping items from the Stack
	void Stack_Pop(){
	String cardAtTop = stackOfCards.pop();
		System.out.println("Stack.pop() => " + cardAtTop);
		System.out.println("Current Stack => " + stackOfCards);
		System.out.println();
	}



}

public class Practical22 {
	public static void main(String[] args) {
		Stack_class eg = new Stack_class();
		eg.Stack_Push();
		eg.Stack_Pop();

	}
}
