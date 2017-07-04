/**
 *  Simple Average calculator
 */
import java.util.Scanner;

/**
 * @author Nick Christiny
 *
 */
public class SimpleAverage
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double num1, num2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number");
		num1 = input.nextDouble();
		System.out.println("Enter second number");
		num2 = input.nextDouble();
		
		//  %,.3f format specifier for example 9,999,999.999
		System.out.printf("The average of %,.2f and %,.2f is %,.3f", num1 , num2, (num1 + num2) / 2);
	}
}
