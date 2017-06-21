/* Program to calculate the total cost     */
/* Programmer: Nicholas Christiny, File Name: Sample.java */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Sample {
	public static void main(String args[])
	{
		String firstNum, secondNum;
		int num1,num2;

		double grandtotal, subtotal, tax;

		DecimalFormat twoDecimal =  new DecimalFormat("0.00");

		firstNum = JOptionPane.showInputDialog("Enter number of units");
		secondNum = JOptionPane.showInputDialog("Enter unit price");

		num1 = Integer.parseInt(firstNum); 
		num2 = Integer.parseInt(secondNum);

		subtotal = num1 * num2;
		tax = 0.06 * subtotal;  // tax rate is 6 percent
		grandtotal = subtotal + tax;

		JOptionPane.showMessageDialog(null, " The total due is $"
				+ twoDecimal.format(grandtotal), "Result",
				JOptionPane.PLAIN_MESSAGE);

		System.exit(0);
	}
}
