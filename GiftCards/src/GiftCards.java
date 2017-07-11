/**
 * A Retail Gift Card Application using multiple Java classes
 */
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 * @author Nick Christiny
 *
 */
public class GiftCards {
	// TODO look into NumberFormat class
	static NumberFormat nf = NumberFormat.getCurrencyInstance();
	Date myDate = new Date();
	String myDateFormat = "MM/dd/yyyy";
	SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);

	Instant instant = myDate.toInstant();
	String today = instant.toString();

	// define the class data members 
	public String expires;
	private double balance;
	public int cardNum;
	private char cardType;
	public String issueDate;
	private String holder;
	public Date deadline;

	// define the member methods
	// default constructor
	public GiftCards() {}
	// overloaded constructor
	public GiftCards(String n, double amt, String expiration, char cardVariant) 
	{
		holder = n;
		balance = amt;
		expires = expiration;
		cardType = cardVariant;
	}
	public void IssueGiftCard() 
	{
		System.out.println("");
		System.out.println(" Card Issued");
		System.out.println(" GMT is: " + today);
		System.out.println(" Today's date is: " + dtToday.format(myDate));
		System.out.printf(" Card Holder . . . %s%n", holder);
		System.out.printf(" Card Number . . . %d%n", cardNum);
		System.out.printf(" Card Amount . . . $%,.2f%n", balance);
		System.out.printf(" Expires . . . %s%n", expires);
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

	// Get expiration 
	public String getExpiration() 
	{
		return expires;
	}

	// Set expiration date 
	public void setExpiration(String expiry) 
	{
		expires = expiry;
		try {
			deadline = dtToday.parse(expires);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	// Get card type
	public char getCardType()
	{
		return cardType;
	}

	// Set Card type
	public void setCardType(char c) 
	{
		cardType = c;
	}

	public void printCurrentGiftCardInfo(double spend) 
	{			
		if (myDate.after(deadline)) {
			// Short-circuit overdraw with expiration date  
			System.out.println("\nWhoops, this card is expired on " + dtToday.format(deadline) + ". Sorry.");
		} else if (spend < 0.0) {
			// Check for negative value withdrawals
			System.out.println("\nYou cannot withdraw a negative amount!");
		} else if (balance - spend < 0) {
			// Check for overdrawn balance 
			System.out.printf("%nDeclined, you cannnot spend more than $%,.2f", balance);
		} else {
			System.out.println("");
			System.out.println(" Card Balance");
			System.out.println(" Today's Date is: " + dtToday.format(myDate));
			System.out.println(" Card vaild until: " + expires);
			System.out.printf(" Deducted . . . $%,.2f%n", spend);
			System.out.printf(" Card Amount . . . $%,.2f%n", balance - spend);
		}
	}

}
