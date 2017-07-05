/**
 *	Customer data simulation using multi-dimensional arrays
 */

/**
 * @author Nick Christiny
 *
 */

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class RetailStore {
	/**
	 * @param args
	 */

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// Add extra checkout lane 
		int rows = 7;
		int columns = 8;
		int[ ][ ] table = new int[rows][columns];

		Random randomGen = new Random();
		StringBuilder s = new StringBuilder();
		int randomInt1 = 0;
		int randomInt2 = 0;
		
		// To determine customer grand total
		int total = 0;
		
		// generate column titles
		for (int j = 0; j < columns; j++)
		{
			s.append("\thr " + (j + 1));
		}
		s.append("\n\n");
		// populate data for each cashier lane
		for (int i = 0; i < rows; i++)
		{
			s.append("lane " + (i + 1));
			s.append("\t");
			for (int j = 0; j < columns; j++)
			{
				// express checkout lane
				randomInt1 = 1 + randomGen.nextInt(20);
				// standard checkout lane
				randomInt2 = 1 + randomGen.nextInt(10);
				if(i == 0) 
					table[i][j] = randomInt1;
				else 
					table[i][j] = randomInt2;
				s.append(table[i][j]);
				s.append(" ");
				s.append("\t");
			}
			s.append("\n");
		}
		System.out.println("data simulation: \n\n" + s);
		System.out.println("");

		// perform data analysis
		// row analysis
		String str = 
				JOptionPane.showInputDialog(null, "enter a cashier lane number : ");
		// subtract 1 to compensate for a zero indexed array
		int laneNum = Integer.parseInt(str) - 1;
		double average = 0.0, sum = 0.0;

		for (int j = 0; j < columns ; j++)  
		{
			sum += table[laneNum][j];
		}
		average = sum / columns;
		System.out.println( "" );

		String outputMsg = "";
		outputMsg += "\n for cashier lane " + (laneNum + 1);
		outputMsg += "\n the data analysis is: ";
		outputMsg += "\n customer count -> " + Math.round(sum);
		outputMsg += "\n average -> " + Math.round(average);

		JOptionPane.showMessageDialog(null, outputMsg,
				"Data Row Analysis", JOptionPane.PLAIN_MESSAGE);
		// Determine if average number is exceeded, and display message 
		if (average > 10)
			JOptionPane.showMessageDialog(null, "Schedule another Clerk!",
					"Action", JOptionPane.PLAIN_MESSAGE);
		
		// column analysis
		str = JOptionPane.showInputDialog(null, "enter an hour number : ");
		// subtract 1 to compensate for a zero indexed array
		int hourNum = Integer.parseInt(str) - 1;
		// reset the accumulating variable
		sum = 0;	  
		for (int i = 0; i < rows ; i++) 
		{
			sum += table[i][hourNum];
			// Removing this line for clarity
			// System.out.println( table[i][hourNum] );
		}
		average = sum / rows;
		System.out.println( "" );

		outputMsg = "";
		outputMsg += "\n for hour number " + (hourNum + 1);
		outputMsg += "\n the data analysis is: ";
		outputMsg += "\n customer count -> " + Math.round(sum);
		outputMsg += "\n average -> " + Math.round(average);

		JOptionPane.showMessageDialog(null, outputMsg,
				"Data Column Analysis", JOptionPane.PLAIN_MESSAGE);
		// Determine if average number is exceeded, and display message 
		if (average > 10)
			JOptionPane.showMessageDialog(null, "Schedule another Clerk!",
					"Action", JOptionPane.PLAIN_MESSAGE);
		
		// Nested loop to determine total number of customers at all lanes within time period
		for (int j = 0; j < columns; j++)
			for (int i = 0; i < rows; i++)
				total += table[i][j];
		JOptionPane.showMessageDialog(null, total,
				"Total Customers", JOptionPane.PLAIN_MESSAGE);
	}
}
