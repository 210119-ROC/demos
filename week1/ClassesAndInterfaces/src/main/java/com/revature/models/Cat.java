package com.revature.models;

// This is a concrete class
public class Cat extends Animal {

	public int numberOfLives;
	private String breed;
	private boolean hasFur;
	
	public Cat() {
		this.numberOfLives = 9;
		this.hasFur = true;
	}
	
	public Cat(String breed, boolean hasFur) {
		this.breed = breed;
		this.hasFur = hasFur;
	}

	
	@Override // Overriding is the process of keeping the same method signature (name), and providing
	// a "custom" implementation for the class that inherits the method
	public void makeSound() {
		// TODO Auto-generated method stub (method without a body)
		System.out.println("Meow");
		
	}
	
	// Polymorphism - Greek for many forms
	
}
