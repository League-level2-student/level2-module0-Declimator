package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] s = {"1", "2", "3", "4", "5"};
		//2. print the third element in the array
		System.out.println(s[2]);
		//3. set the third element to a different value
		s[2] = "something";
		//4. print the third element again
		System.out.println(s[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("___________________________________________________________________");
		//6. make an array of 50 integers
		int[] x = new int[50];
		//7. use a for loop to make every value of the integer array a random number

		for(int i = 0;i<x.length;i++) {
			x[i] = new Random().nextInt(50);

		}
		int y = x[0];
		for(int i = 0;i<x.length;i++) {
			if(y>x[i]) {
				y = x[i];
			}
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(y);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i<x.length;i++) {
		System.out.println(x[i]);
		}
		//10. print the largest number in the array.
	}
}
