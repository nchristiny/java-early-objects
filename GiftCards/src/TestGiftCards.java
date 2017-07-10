/**
 * Runner for GiftCards Java class
 */

import javax.swing.JOptionPane;

/**
 * @author Nick Christiny
 *
 */
public class TestGiftCards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GiftCards gc = new GiftCards("", 0.0, 0, 'R');

		// display opening message
		String message = "welcome";
		JOptionPane.showMessageDialog(null, "Message: " + message,
				"Message", JOptionPane.PLAIN_MESSAGE);

		// set the gift card holder's name
		String str = 
				JOptionPane.showInputDialog(null, "gift card holder's name : ");
		gc.setHolder(str);

		// obtain the gift card number
		str = JOptionPane.showInputDialog(null, "gift card number : ");
		gc.cardNum = Integer.parseInt(str);

		// set the gift card amount
		str = JOptionPane.showInputDialog(null, "gift card amount : ");
		gc.setBalance(Double.parseDouble(str));
		
		// set the gift card expiration year
		str = JOptionPane.showInputDialog(null, "gift card exipration year : ");
		gc.setExpiration(Integer.parseInt(str));
		
		// set the gift card type 
		str = JOptionPane.showInputDialog(null, "gift card type (S for Store Credit, R for regular) : ");
		gc.setCardType(str.charAt(0));

		// issue the gift card
		gc.IssueGiftCard();

		// use the gift card
		double useCard = 0;
		str = 
				JOptionPane.showInputDialog(null, "deduct amount from card : ");
		useCard = Double.parseDouble(str);
		
		// Delegate responsibility for balance check to class instance of GiftCards
		// print current card balance
		gc.printCurrentGiftCardInfo(useCard);
	}

}
