package com.rex.oop;

abstract class Animal {
	String name;
	
	abstract String noise();
}

class Dog extends Animal{

	@Override
	String makeNoise() {
		return "Ruff";
	}
	
}

class Cat extends Animal {

	@Override
	String makeNoise() {
		return "Meow";
	}
}

public class InheritanceExamples {
	public static void main (String[] args) {
		Dog dog = new Dog();
		dog.name = "Fido";
		
		Cat cat = new Cat();
		cat.name = "Garfield";
		
		// polymorphism
		Animal animal = new Cat();
		System.out.println(animal.makeNoise());
		animal = new Dog();
		System.out.println(animal.makeNoise());
	}
}
