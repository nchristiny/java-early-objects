/**
 * Simple GUI Program
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Nick Christiny
 *
 */

public class SimpleGUI extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JLabel l1, l2, l3;
	// Add button b2
	JButton b1, b2; 
	JTextField t1, t2, t3;

	SimpleGUI() 
	{
		l1 = new JLabel(" INPUT 1");
		l2 = new JLabel(" INPUT 2");
		l3 = new JLabel(" OUTPUT");
		b1 = new JButton("BUTTON 1");
		
		// Instantiate button b2 label
		b2 = new JButton("EXIT");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		b1.addActionListener(this);

		// Add new instance of button b2
		add(b2);
		
		// Add button b2 event listener and action
		b2.addActionListener(e -> System.exit(0));
		
		setSize(500,300);
		setLayout(new GridLayout(4,2));
		setTitle("Simple Java GUI");
	}

	public void actionPerformed(ActionEvent ae)
	{
		float a, b, c;
		if(ae.getSource() == b1)
		{
			a = Float.parseFloat(t1.getText());
			b = Float.parseFloat(t2.getText());
			c = a + b;
			t3.setText(String.valueOf(c));
		} 
	}


	public static void main(String args[])
	{
		SimpleGUI a = new SimpleGUI();
		a.setVisible(true);
		a.setLocation(200, 200);
	}
}
