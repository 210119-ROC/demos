package com.revature;

import com.revature.models.Animal;
import com.revature.models.Cat;
import com.revature.models.Frog;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		Frog f1 = new Frog();
		
		Animal kermit = new Frog();
		
		Cat tom = new Cat("Domestic Shorthair", true);
		tom.makeSound();
	}

}
