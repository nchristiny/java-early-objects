/**
 * Simple GUI Program
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @author Nick Christiny
 *
 */

public class SimpleGUI extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	// Default locale en-US
	NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance();

	// Add label l4, l5
	JLabel l1, l2, l3, l4, l5;
	// Add button b2
	JButton b1, b2; 
	JTextField t1, t2, t3, t4;
	// Add checkbox
	JCheckBox check1;

	SimpleGUI() 
	{
		l1 = new JLabel(" Current Salary ($)");
		l2 = new JLabel(" Percent Rate (%)");
		l3 = new JLabel(" New Salary");
		b1 = new JButton("COMPUTE");
		
		// Instantiate button b2 and label
		b2 = new JButton("EXIT");
		// Instantiate check1, l4 and label, and l5 text field
		l4 = new JLabel("  ");
		l5 = new JLabel(" Difference");
		check1 = new JCheckBox("Bonus Pay");
		check1.setSelected(true);

		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		
		// Add text field for difference
		t4 = new JTextField(10);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		
		// Insert checkbox
		add(check1);
		add(l4);
		
		// Insert difference label and textfield
		add(l5);
		add(t4);

		add(b1);
		b1.addActionListener(this);

		// Add new instance of button b2
		add(b2);
		
		// Add button b2 event listener and action
		b2.addActionListener(e -> System.exit(0));
		
		setSize(500,300);
		
		// Add row for checkbox
		setLayout(new GridLayout(6,2));
		
		setTitle("Salary Calculator");
	}

	public void actionPerformed(ActionEvent ae)
	{
		// Floats and currency don't mix, use BigDecimal
		BigDecimal basePay, perCentInterest, subTotal, difference, bonus;
		
		if(ae.getSource() == b1)
		{
			basePay = new BigDecimal(t1.getText());
			perCentInterest = new BigDecimal(t2.getText());
			BigDecimal oneHundred = new BigDecimal("100");
			// Percentage calculation 			
			subTotal = basePay.add(basePay.multiply(perCentInterest.divide(oneHundred)));
			
			if (check1.isSelected()) 
			{
				// Add bonus pay
				bonus = new BigDecimal("500");
				t3.setText(String.valueOf(usdCostFormat.format(subTotal.add(bonus))));
				difference = subTotal.add(bonus).subtract(basePay);
			} else {
				t3.setText(String.valueOf(usdCostFormat.format(subTotal)));
				difference = subTotal.subtract(basePay);
			}
			t4.setText(String.valueOf(usdCostFormat.format(difference)));
		} 
	}


	public static void main(String args[])
	{
		SimpleGUI a = new SimpleGUI();
		a.setVisible(true);
		a.setLocation(200, 200);
	}
}
