/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import java.io.*;
import java.util.*;

/**
 *
 * @author Nick Christiny
 */
public class Demos {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws java.io.IOException {
		String s1;
		String s2;
		String stringNum2, output;
		double num1, num2, product, quotient;

		// declare a BufferedReader object to read from the keyboard
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));

		System.out.println ("Please input a line of characters!");

		s1 = br.readLine();

		System.out.println ("Your line has " + s1.length() + " characters!");

		System.out.println ();
		System.out.println ("Breaking the line into tokens we get:");

		int numTokens = 0;
		StringTokenizer st = new StringTokenizer (s1);

		while (st.hasMoreTokens())
		{
			s2 = st.nextToken();
			numTokens++;
			System.out.println ("    Token " + numTokens + " is: " + s2);
		}

		// use a BufferedReader object to read a number from the keyboard
		System.out.println();
		System.out.println ("Please input a number!");	 
		s1 = br.readLine();
		num1 =  Double.parseDouble(s1);	 
		// Do something
		System.out.println ("Nice, " + num1 + " divided by 3 is "  + num1 / 3 + "!");
		System.out.println ("Nice, " + num1 + " modulo 2 is "  + num1 % 2 + ".");

		if (num1 % 2 == 0)
			System.out.println("Therefore " + num1 + " is even!");
		else
			System.out.println("Yo, that means " + num1 + " is odd!");

		System.out.println();
		System.out.println("Put in another number!");
		s2 = br.readLine(); 
		num2 = Double.parseDouble(s2);
		product = num2 * num1;
		quotient = num2 / num1;

		// Fun with string format
		stringNum2 = Double.toString(num2);
		System.out.printf("%s multiplied by %4.2f is %4.2f.%n",stringNum2, num1, product);
		System.out.printf("%s divided by %4.2f is %4.7f.%n",stringNum2, num1, quotient);
		output = String.format("Just used Double.toString() method to convert %4.1f from Double to String.%nHere it is: %s", num2, stringNum2);
		System.out.printf("%s < assigned the preceding lines to a String variable and displayed it using printf()!%n", output);
		System.out.println();

		// scratch
		int x = 11;
		int count = 1;
		do
		{
			System.out.println("Loop count: " + count);
			x += 20;
			++count;
		} while (x <= 100);
		System.out.println();

		// more scratch
		for (int counts = 10; counts <= 21; counts++)
			System.out.println("Java rules! " + counts);
		System.out.println();

		// Comparison Strings
		String str1 = "Awesome";
		String str2 = "Awesome";
		String str3 = new String("Awesome");
		System.out.println("str1 = \"Awesome\"\nstr2 = \"Awesome\"\nstr3 = new String(\"Awesome\")");
		if (str1 == str2)  //  Will return true since memory location referenced is equal, HOWEVER the Strings may not be identical. Explanation http://www.zparacha.com/java-string-comparison/
			System.out.println("String references ONLY are equal by comparing str1 == str2");
		if (str1 != str3)  //  Memory location referenced is not equal
			System.out.println("String comparison is NOT found by str1 == str3, since str3 memory reference is distinct");
		if (str1.equals(str3))  // Equals method compares the text content or the true value of two string variables
			System.out.println("Strings are identical by str1.equals(str3)");
		if (str1.compareTo(str3) == 0) // compareTo method compares the content or value of two string variables as well, returns 0 for identical, 1 for not identical
			System.out.println("Strings are identical by str1.compareTo(str3) == 0");
	}	
}
