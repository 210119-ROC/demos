package com.revature.controlflow;

// Here we'll introduce control flow 
/*
 * Flow control refers to the practice of managing the way that an application runs and executes
 * by using special statements These statement types include:
 * 
 * - Decision making statements
 * - Looping statements
 * - Branching Statements
 */
public class Driver {

	/*
	 * Decision Making Statements
	 * 
	 * There are 5 types:
	 * 
	 * 1. if statements
	 * 2. if/else statements
	 * 3. if/else-if statements
	 * 4. nested if-statements
	 * 5. switch statements
	 */
	
	
	public static void main(String[] args) {
	
		/*
		 * if statements:
		 * 
		 * An if statement consists of a condition followed by a statement or set of statements
		 
		 * The statement only gets executed IF the given condition is true.
		 * If the condition is false, then statement is ignored.
		 */
		
		int num = 80;
		
		if (num < 100) {
			System.out.println("The variable \"num\" is less than or equal to 100!...it's value is " + num);
		}
		// the short cut to run a program is shift + alt + x..wait 1/2 a sec then press j
		// sysout + ctrl +space bar, then press enter
		
		/*
		 * if/else Statements
		 * 
		 * Syntactically, the if/else statement STARTS the same way as a normal IF statement.
		 * However, there is an  idditional ELSE block of code (with no conditional) that's
		 * applied to the end
		 */
		
		num = 101;

		
		
		if (num < 100) {
			System.out.println("The variable \"num\" is less than 100!...its value is " + num);
		} else {
			System.out.println("The variable \"num\" is more than 100...its value is " + num);
			// this statement now executes because num is greater than 100 
		}
		
		/*
		 * if/ else-if statements:
		 * 
		 * An if-else-if statment is used when we need to check multiple conditions.
		 * 
		 */
		
		// first we test if it's less than, 
		// then we test if it's more than
		// then we test if it's equal
		
		num = 100;
		
		if (num < 100) {
			System.out.println("The variable \"num\" is less than 100!...its value is " + num);
		} else if (num > 100) {
			System.out.println("The variable \"num\" is more than 100...its value is " + num);
		} else {
			System.out.println("Then num must be equal to 100");
		}

		/*
		 * Nested if Statement:
		 * 
		 * If the first condition proves to be true, you can nest another condition to be tested:
		 */
		
		num = 101;
		
		if (num < 100) {
			
			System.out.println("num is less than 100");
			
			if (num % 2 == 0) {
				System.out.println("the number is even.");
			} else {
				System.out.println("the number is odd.");
			}
			
			// % modulo operator returns a remainder
			
		} else {
			System.out.println("The number is greater than or equal to 100");
		}
		
		/*
		 * Switch Statements:
		 *
		 */
	
		String str = "greeting";
		
		switch(str) {
		case "greeting":
			System.out.println("Hello there, fellow coder!");
			break; // we use break so that we don't fall through to other statements
		case "goodbye":
			System.out.println("Goodbye for now!");
		case "GREETING":
			System.out.println("Casing is important, huh?");
		default:
			System.out.println("Nothing matched");
		}
		
		/*
		 * for loop:
		 *
		 * We use loops to iterate over arrays:
		 */
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		// a for loop has 3 steps
		/*
		 * 1. we tell the loop where to start
		 * 2. we tell the loop where to stop
		 * 3. we tell the loop how to increment
		 * 
		 */
		
		for (int i=0; i<numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}
		
		for (int i=0; i<=100; i++) {
			System.out.println(i);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
