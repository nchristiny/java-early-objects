/**
 * Display digits from five digit number input by user separated by three spaces
 * Using only techniques covered so far
 */
import java.util.Scanner;

/**
 * @author Nick Christiny
 *
 */
public class Fiver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		char units; 
		char tens;
		char hundreds; 
		char thousands;
		char tenThousands;

		System.out.println("Enter a five-digit number now!");
		int input = sc.nextInt();

		if (input < 10000)
			System.out.println("Number too low, try again bozo."); 
		else if (input > 99999)
			System.out.println("Number to large, try again bozo."); 
		else {
			units = Integer.toString(input % 10).charAt(0);
			tens = Integer.toString(input % 100).charAt(0);
			hundreds = Integer.toString(input % 1000).charAt(0);
			thousands = Integer.toString(input % 10000).charAt(0);
			tenThousands = Integer.toString(input % 100000).charAt(0);

			System.out.printf("Units: %c%n", units);
			System.out.printf("Tens: %c%n", tens);
			System.out.printf("Hundreds: %c%n", hundreds);
			System.out.printf("Thousands: %c%n", thousands);
			System.out.printf("Ten Thousands: %c%n", tenThousands);
			
			sb.append(tenThousands);
			sb.append("   ");
			sb.append(thousands);
			sb.append("   ");
			sb.append(hundreds);
			sb.append("   ");
			sb.append(tens);
			sb.append("   ");
			sb.append(units);
			System.out.println("Result:");
			System.out.println(sb);
		}	

		sc.close();
	}

}
