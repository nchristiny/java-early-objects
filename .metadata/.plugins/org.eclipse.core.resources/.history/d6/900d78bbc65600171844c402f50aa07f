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
    double num1, num2, product;
    
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
    System.out.println ("Please input a number!");	 
    s1 = br.readLine();
    num1 =  Double.parseDouble(s1);	 
    // Do something
    System.out.println (" Nice, divided by 3 this is "  + num1 / 3 + "!");
    System.out.println (" Nice, this divided by 10 is "  + num1 / 10 + "!");
    }
    
}
