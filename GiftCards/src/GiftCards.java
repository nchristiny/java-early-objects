/**
 * A Retail Gift Card Application using multiple Java classes
 */
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Nick Christiny
 *
 */
public class GiftCards {
	static NumberFormat nf = NumberFormat.getCurrencyInstance();
	Date myDate = new Date();
	String myDateFormat = "MM/dd/yyyy";
	SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
	SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
	String yearString = new SimpleDateFormat("yyyy").format(myDate);
	int year = Integer.parseInt(yearString);
	
	// define the class data members 
	public int expires;
	private double balance;
	public int cardNum;
	private char cardType;
	public String issueDate;
	private String holder;

	// define the member methods
	// default constructor
	public GiftCards() {}
	// overloaded constructor
	public GiftCards(String n, double amt, int year, char cardVariant) 
	{
		holder = n;
		balance = amt;
		expires = year;
		cardType = cardVariant;
	}
	public void IssueGiftCard() 
	{
		System.out.println("");
		System.out.println(" Card Issued");
		System.out.println(" Today's Date is: " + dtToday.format(myDate));
		System.out.printf(" Card Holder . . . %s%n", holder);
		System.out.printf(" Card Number . . . %d%n", cardNum);
		System.out.printf(" Card Amount . . . $%.2f%n", balance);
		System.out.printf(" Expires . . . %d%n", expires);
		System.out.printf(" Card Type . . . %c%n", cardType);
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double b) 
	{
		balance = b;
	}
	public String getHolder()
	{
		return holder;
	}
	public void setHolder(String h) 
	{
		holder = h;
	}
	
	// TODO DONE Set expiration date 
	public void setExpiration(int year) 
	{
		expires = year;
	}
	
	// TODO Set Card type
	public void setCardType(char c) 
	{
		cardType = c;
	}
	
	public void printCurrentGiftCardInfo(double spend) 
	{	
		if (year > expires) {
			// Short-circuit overdraw with expiration date first 
			System.out.println("\nWhoops, this card is expired, sorry.");
		} else if (spend < 0.0) {
			// Check for negative value withdrawals
			System.out.println("\nYou cannot withdraw a negative amount!");
		} else if (balance - spend < 0) {
			// Check for overdrawn balance 
			System.out.println("\nDeclined, you cannnot spend more than Gift Card balance.");
		} else {
			System.out.println("");
			System.out.println(" Card Balance");
			System.out.println(" Today's Date is: " + dtToday.format(myDate));
			System.out.printf(" Deducted . . . $%.2f%n", spend);
			System.out.printf(" Card Amount . . . $%.2f%n", balance - spend);
		}
	}

}
