import java.util.Scanner;

/**
 * Calculating total seconds into hours, minutes, and seconds.
 */

/**
 * @author Nicholas Christiny
 * @date September 6, 2017
 */
public class SecondsCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer from 1 to 86,400: ");
		int input = sc.nextInt();
		System.out.println("Number of seconds: " + input);
		int hours = input / 60 / 60; 
		int minutes = input / 60 % 60;  
		int seconds = input % 60 % 60;
		System.out.println(hours + " Hours");
		System.out.println(minutes + " Minutes");
		System.out.println(seconds + " Seconds");
	}

}