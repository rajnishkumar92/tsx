import java.awt.Color;
import java.io.*;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class LoginTypeFrame extends JFrame implements ActionListener
 {
	private JButton badmin,bcstmr;
	private JLabel l1;

	public LoginTypeFrame(String title)
	{
		super(title);

		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));

		badmin=new JButton("ADMIN");
		badmin.addActionListener(this);
		
		bcstmr=new JButton("CUSTOMER");
		bcstmr.addActionListener(this);

		Font f=new Font("Chiller",Font.BOLD,27);
		l1=new JLabel("LOGIN TYPE");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);


		c.add(l1);c.add(new JLabel(""));
		c.add(badmin);c.add(bcstmr);
		
		setSize(450, 325);
		setLocation(400,400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==badmin)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to enter into Admin section");
			if(con==JOptionPane.YES_OPTION)
			{
				new AdminFrame(" Welcome to Admin Section...");
				setVisible(false);

			}
			
		}


		if(ae.getSource()==bcstmr)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to enter into Customer section");
			if(con==JOptionPane.YES_OPTION)
			{
				new CustomerFrame("Welcome to Customer Section..");
				setVisible(false);
			}
			
		}
	}
public static void main(String[] args) {
		new LoginTypeFrame("Login frame...");

	}

}

		