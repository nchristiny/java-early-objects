import java.text.NumberFormat;
import java.util.Locale;
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
		NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
		Scanner sc = new Scanner(System.in);
		int input = 0; 
		do {
			System.out.print("Enter an integer from 1 to 86,400: ");
			input = sc.nextInt();	
		} while (input < 1 || input >= 86400);
		System.out.printf("Number of seconds: %s%n", String.valueOf(nf.format(input)));
		int hours = input / 60 / 60; 
		int minutes = input / 60 % 60;  
		int seconds = input % 60 % 60;
		System.out.printf("%d hours%n%d minutes%n%d seconds", hours, minutes, seconds);
		sc.close();
	}

}