package com.revature.collections;

import java.util.ArrayList;
import java.util.List;

/*
 * Why Collections?
 * 
 * Previously we've learned about Arrays, which are fixed non-primitive collections of elements
 */
public class CollectionDriver {

	public static void main(String[] args) {
		
		// an example of an integer array
		int[] numbers = {1, 2, 3, 4, 5};
		String[] words = {"This", "is", "a", "String", "Array"};
		// an array is an object
		numbers[1] = 2003;
		System.out.println("The amount of Strings in my String array is " + words.length);
		
		// print out the number at index 3
		System.out.println(numbers[3]);
		
		
		// we could work with this Array like so:
		// we could create a for loop and print out each element
		for (int i=0; i<numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}
		
		/*
		 * The Problem with arrays is that they are STATIC! ...meaning we can't change them
		 * We can only store one data type within them and we can't expand Arrays.
		 */
		
		/*
		 * List
		 * 
		 * A list is an ordered Collection.  Lists can contain duplicate elements within them
		 * We can add more elements (or objects to a list).
		 * 
		 * 	+ Search
		 * 		- searches for a specific object within the collection.
		 * 
		 */
		
		List<Integer> nums = new ArrayList<Integer>(); // Here I am INFERRING GENERICS
		// I am telling the Collection (which is ArrayList) what type of Object it can store.
		nums.add(4);
		nums.add(8);
		nums.add(7);
		
		System.out.println(nums);
		
		User u = new User("James", "Bond", "james007", "p4ssw0rd", "jbond@gmail.com");
		
		User u2 = new User("hulk24", "1r34", "bb@gmail");
		
		System.out.println(u.getLastName());
		System.out.println(u);
		System.out.println(u2);
		
		// let's create an ArrayList of Users
		List<User> myuserList = new ArrayList<User>();
		System.out.println(myuserList);
		myuserList.add(u);
		myuserList.add(u2);
		System.out.println("==================================================");
		System.out.println(myuserList);

	}

}
