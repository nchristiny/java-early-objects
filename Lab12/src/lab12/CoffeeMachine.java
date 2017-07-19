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
	// TODO add image to JPanel
	private static final long serialVersionUID = 1L;
	NumberFormat usdCostFormat = NumberFormat.getCurrencyInstance();

	JLabel l1, l2, l3, l4, l5, l6, l7;
	JButton b1, b2;
	JTextField t1, t2, t3;
	JCheckBox cream, raw, espresso; 
	private JRadioButton small;
	private JRadioButton medium;
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
		l7 = new JLabel("  ");

		b1 = new JButton("COMPUTE");
		b2 = new JButton("EXIT");

		t1 = new JTextField(10);
		t2 = new JTextField(10);

		small = new JRadioButton("small", true);
		large = new JRadioButton("large", false);
		medium = new JRadioButton("medium", false);
		group = new ButtonGroup();
		group.add(small);
		group.add(large);
		group.add(medium);

		cream = new JCheckBox("cream", false);
		raw = new JCheckBox("raw sugar", false);
		espresso = new JCheckBox("espresso shot", false);
		add(l1);
		add(t1);	
		add(small);
		add(cream);
		add(medium);
		add(raw);
		add(large);
		add(espresso);
		add(l3);
		add(l7);
		add(l2);
		add(t2);
		add(l5);
		add(l6);
		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(e -> System.exit(0));
		setSize(500,300);
		setLayout(new GridLayout(8,2));
		setTitle("Coffee Machine");

		// create the menu bar
		JMenuBar menuBar = new JMenuBar();
		add(menuBar);	

		// add the File menu
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		// add a File menu item
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		// add the Help menu
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		// add a Help menu item
		JMenuItem mntmAbout = new JMenuItem("About");   
		mnHelp.add(mntmAbout);

		// display the menu bar on the frame
		setJMenuBar(menuBar);

		mntmExit.addActionListener(e -> System.exit(0));

		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				JOptionPane.showMessageDialog(null, "Developed by Nick Christiny.\nIn association with CIS 144 Lab productions.\nJuly 17, 2017\nVersion: " + serialVersionUID, 
						"About", JOptionPane.PLAIN_MESSAGE);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		BigDecimal price = new BigDecimal("1.99");
		BigDecimal upsize = new BigDecimal("2.99");
		BigDecimal upsize2 = new BigDecimal("3.99");
		BigDecimal extra = new BigDecimal("0.65");
		String a = "", message = ""; 
		if (small.isSelected() == true) 
		{
			System.out.println("small");
			// perform a task ...
			a = "Small coffee\n";
		}
		if (medium.isSelected() == true) 
		{
			System.out.println("medium");
			// perform a task ...
			a = "Medium coffee\n";
			price = price.add(upsize);
		}
		if (large.isSelected() == true) 
		{
			System.out.println("large");
			// perform a task ...
			a = "Large coffee\n";
			price = price.add(upsize2);
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
			a += "and an espresso shot";
			price = price.add(extra);
		} 

		if(ae.getSource() == b1)
		{
			String name = t1.getText();
			if (!name.equals(""))
			{
				for(int i = 0; i < name.length(); ++i)
				{
					if (Character.isDigit(name.charAt(i))) 
					{
						System.out.println("digit in name");	
						message = "There is a number in your name!\nFor some reason, our system doesn't like that.\nPlease try again.";
						t2.setText("Please try again.");
						break;
					} 
					else 
					{
						message = "Hello " + name + "! Enjoy your beverage!\nyour order: " + a + "\nTotal Purchase: " + String.valueOf(usdCostFormat.format(price));
						t2.setText("thank you: " + String.valueOf(usdCostFormat.format(price)));
					}
				}
			} 
			else
			{
				message = "Hello valued guest! Enjoy your beverage!\nyour order: " + a + "\nTotal Purchase: " + String.valueOf(usdCostFormat.format(price));
				t2.setText("thank you: " + String.valueOf(usdCostFormat.format(price)));	
			}
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
