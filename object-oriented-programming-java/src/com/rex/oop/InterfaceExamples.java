package com.rex.oop;

interface Flyable {
	void fly();
}
class Airplane implements Flyable {
	public void fly() {
		System.out.println("Airplane is flying");
	}
}

class Bird implements Flyable {
	public void fly() {
		System.out.println("Bird is flying");
	}
}

// Common actions between objects
public class InterfaceExamples {
	public static void main(String[] args) {
		// polymorphism
		Flyable fly = new Airplane();
		fly.fly();
		fly = new Bird();
		fly.fly();
	}
}
