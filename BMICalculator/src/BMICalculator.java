/**
 * Calculate Body Mass Index
 */

/**
 * @author Nick Christiny
 *
 */

import java.util.Scanner;

public class BMICalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		int weight;
		double bmi;

		System.out.print("Enter height in inches: ");
		height = sc.nextInt();
		System.out.print("Enter weight in pounds: ");
		weight = sc.nextInt();

		bmi = (weight * 703) / (height * height);
		System.out.println("");
		System.out.println("Your BMI is: " + bmi);
		System.out.println("");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater"); 

		sc.close();
	}

}
