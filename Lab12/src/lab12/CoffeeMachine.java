/**
 * Program using Java Graphical User Interface ( GUI ) components
 */
package lab12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @author Nick Christiny
 *
 */
public class CoffeeMachine extends JFrame implements ActionListener {
	/**
	 * @param args
	 */
	private static final long serialVersionUID = 1L;
	NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance();
	
	JLabel l1, l2, l3, l4, l5, l6;
	JButton b1, b2;
	JTextField t1, t2, t3;
	JCheckBox cream, raw, espresso; 
	private JRadioButton small;
	private JRadioButton large;
	private ButtonGroup group;

	CoffeeMachine() 
	{
		l1 = new JLabel(" Customer Name");
		l2 = new JLabel(" amount to pay");
		l3 = new JLabel("  ");
		l4 = new JLabel("  ");
		l5 = new JLabel("  ");
		l6 = new JLabel("  ");

		b1 = new JButton("COMPUTE");
		b2 = new JButton("EXIT");

		t1 = new JTextField(10);
		t2 = new JTextField(10);

		small = new JRadioButton("small", true);
		large = new JRadioButton("large", false);
		group = new ButtonGroup();
		group.add(small);
		group.add(large);

		cream = new JCheckBox("cream", false);
		raw = new JCheckBox("raw sugar", false);
		espresso = new JCheckBox("espresso shot", false);
		add(l1);
		add(t1);
		add(small);
		add(cream);
		add(large);
		add(raw);
		add(l3);
		add(espresso);
		add(l2);
		add(t2);
		add(l5);
		add(l6);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(e -> System.exit(0));
		setSize(500,300);
		setLayout(new GridLayout(7,2));
		setTitle("Coffee Machine");
	}
	public void actionPerformed(ActionEvent ae)
	{
		BigDecimal price = new BigDecimal("2.99");
		BigDecimal upsize = new BigDecimal("1.99");
		BigDecimal extra = new BigDecimal("0.99");
		String a = "", message = ""; 
		if (small.isSelected() == true) 
		{
			System.out.println("small");
			// perform a task ...
			a = "Small coffee\n";
		}
		if (large.isSelected() == true) 
		{
			System.out.println("large");
			// perform a task ...
			a = "Large coffee\n";
			price = price.add(upsize);
		}

		if (cream.isSelected() == true) 
		{
			// perform a task ...
			a += "with cream ";
			price = price.add(extra);
		} 
		if (raw.isSelected() == true) 
		{
			// perform a task ...
			a += "with raw sugar ";
			price = price.add(extra);
		} 
		if (espresso.isSelected() == true) 
		{
			// perform a task ...
			a += "with espresso shot";
			price = price.add(extra);
		} 
//		System.out.println(a);


		if(ae.getSource() == b1)
		{
			String name = t1.getText();
			message = "Hello " + name + "! Enjoy your beverage!\nyour order: " + a + "\nTotal Purchase: " + String.valueOf(usdCostFormat.format(price));
			t2.setText("thank you: " + price );
		}
		JOptionPane.showMessageDialog(null, "Summary: \n" + message, 
				"Order Summary", JOptionPane.PLAIN_MESSAGE);
	}

	public static void main(String[] args) {
		CoffeeMachine a = new CoffeeMachine();
		a.setVisible(true);
		a.setLocation(200,200);
	}

}
