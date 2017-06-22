// Nicholas Christiny
import java.util.*;
public class Invoices {
	public static void main(String args[]) {
		// the variables
		int invNum = 0;
		int numItems = 0;
		double itemPrice = 0.0, shipCharge = 0.0, totAmt = 0.0;
		double discount = 0.02, subTotal = 0.0, discountAmount = 0.0;
		char shipMethod = '\0';
		char shippingChoice = '\0';
		String shippingCompany = "", invDate = "";
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
		System.out.println("enter shipping method (A , B, C or F for free shipping)");
		shipMethod = sc.next().charAt(0);

		// determine the shipping charge
		switch(shipMethod) {
		case 'A': case 'a': shipCharge = 5.00; break;
		case 'B': case 'b': shipCharge = 7.20; break;
		case 'C': case 'c': shipCharge = 10.00; break;
		case 'F': case 'f': shipCharge = 0; break;
		default:  shipCharge = 20.00;
		}
		System.out.printf("the shipping charge is: $%.2f\n" , shipCharge);
		
		// choose the shipping company
		System.out.println("Enter shipping company: (1 for Federal Express, 2 for United Parcel Service, 3 for DHL, or anything else for United States Postal Service.)");
		shippingChoice = sc.next().charAt(0);

		// determine the shipping charge
		switch(shippingChoice) {
		case '1': shippingCompany = "FedEx"; break;
		case '2': shippingCompany = "UPS"; break;
		case '3': shippingCompany = "DHL"; break;
		default: shippingCompany = "USPS";
		}
		System.out.printf("Your shipping company is: %s\n" , shippingCompany);

		// System.out.print("check variable before choice: ");
		// System.out.println(check);
		
		// determine the days from invoice date to today's date
		System.out.println("is discount period valid? true or false");
		check = sc.nextBoolean();
		
		// System.out.print("check variable after choice: ");
		// System.out.println(check);

		subTotal = numItems * itemPrice;
		if (check) {
			totAmt = subTotal * (1 - discount) + shipCharge;
			discountAmount = subTotal * discount;
			System.out.printf("You saved $%.2f today!\n", discountAmount);
			}
		else { 
			System.out.println("You did not save on any discount today!");
			totAmt = subTotal + shipCharge;
		}
		
		System.out.printf("(total invoice amount due) $%.2f\n",totAmt);

		// the program footer
		System.out.println(" ");
		System.out.println("thank you!");
		System.out.println("---------------------");
		sc.close();
	}
}
