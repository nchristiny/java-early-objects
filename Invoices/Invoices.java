// Nicholas Christiny
import java.util.*;
public class Invoices {
	public static void main(String args[]) {
		// the variables
		int invNum = 0;
		int numItems = 0;
		double itemPrice = 0.0, shipCharge = 0.0, totAmt = 0.0;
		double discount = 0.02, subTotal = 0.0, discountAmount = 0.0;
		String shipMethod; 
		String shippingCompany ="", invDate, input_check;  // why are the last two OK to initialize without empty strings but shippingCompany isn't? 
		boolean check = false;
		Scanner sc = new Scanner(System.in);

		// obtain today's date
		Date date = new Date();

		// display time and date using toString()
		System.out.println(date.toString());

		// the program header
		System.out.println("[ Invoice Processing ]");
		System.out.println("----------------------\n");
		System.out.println("Today's Date is: " + date + "\n");
		// prompt user for data and receive data
		System.out.println("please enter the invoice number");
		invNum = sc.nextInt();
		System.out.println("the invoice number is: " + invNum);
		System.out.println("please enter the invoice date");
		invDate = sc.next();
		System.out.println("the invoice date is: " + invDate);
		System.out.println("please enter the number of items purchased");
		numItems = sc.nextInt();
		System.out.println("the number of items is: " + numItems);

		// determine the per item price
		if (numItems > 0 && numItems <= 10)
			itemPrice = 0.75;
		else if (numItems > 10 && numItems <= 50)
			itemPrice = 0.65;
		else
			itemPrice = 0.62;
		System.out.printf("the per item price is: $%.2f\n", itemPrice);

		// determine the shipping method
		System.out.println("enter shipping method (1 for Federal Express, 2 for United Parcel Service, 3 for DHL, 4 for Amazon Prime FREE shipping or anything else for United States Postal Service.)");
		shipMethod = sc.nextLine();
		// Previously allowed user to enter a two digit number and still only took first digit. 
		// Refactored to opt to default for anything longer than 1 digit
		if (shipMethod.length() > 1)
			shipMethod = "";
		else 
			shipMethod = sc.nextLine();
		
		switch(shipMethod) {
		case "1": {
			shipCharge = 5.00; 
			shippingCompany = "FedEx";
			break;
		}
		case "2": {
			shipCharge = 7.20;
			shippingCompany = "UPS";
			break;
		}
		case "3": {
			shipCharge = 10.00;
			shippingCompany = "DHL";
			break;
		}
		case "4": {
			shipCharge = 0;
			shippingCompany = "Amazone Prime Free Delivery";
			break;
		}
		default:  {
			shipCharge = 20.00;
			shippingCompany = "USPS";
		}
		}
		System.out.printf("You have selected %s%nThe shipping charge is: $%.2f\n" , shippingCompany, shipCharge);
		
		// determine the discount validity
		System.out.println("Is discount period valid? If so, enter either yes or true.");
		// Refactored - increased robustness to accept more choices
		input_check = sc.next().toLowerCase();
		if (input_check.charAt(0) == 't' || input_check.charAt(0) == 'y')
			check = true;	
		else 
			System.out.println("You did not save with a discount today!");
		
		// determine subTotal
		subTotal = numItems * itemPrice;
		if (check) {
			totAmt = subTotal * (1 - discount) + shipCharge;
			discountAmount = subTotal * discount;
			System.out.printf("You saved $%.2f today!\n", discountAmount);
		}
		else { 
			totAmt = subTotal + shipCharge;
		}

		System.out.printf("Total invoice amount due: $%.2f\n",totAmt);

		// the program footer
		System.out.println();
		System.out.println("thank you!");
		System.out.println("---------------------");
		sc.close();
	}
}
