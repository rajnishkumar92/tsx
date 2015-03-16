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

public class AdminFrame extends JFrame implements ActionListener
 {
	private JButton bsrc,bcrt,bback,blnr,bcbr,bdr;
	private JLabel l1;

	public AdminFrame(String title)
	{
		super(title);

		Container c=getContentPane();
		c.setLayout(new GridLayout(3,3));

		bsrc=new JButton("search user");
		bsrc.addActionListener(this);
		
		bcrt=new JButton("Create new account");
		bcrt.addActionListener(this);

		bback=new JButton("Back");
		bback.addActionListener(this);


		blnr=new JButton("loan Request view");
		blnr.addActionListener(this);


		bcbr=new JButton("Cheque book Request view");
		bcbr.addActionListener(this);


		bdr=new JButton("Draft Request view");
		bdr.addActionListener(this);
		


		Font f=new Font("Chiller",Font.BOLD,20);
		l1=new JLabel("ADMIN SECTION...");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);


		c.add(l1);c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(bsrc);c.add(bcrt);c.add(bdr);
		c.add(blnr);c.add(bcbr);c.add(bback);
		
		setSize(500, 125);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bsrc)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Search account?");
			if(con==JOptionPane.YES_OPTION)
			{
				new SearchUser("Searching...");
				setVisible(false);

			}
			
		}


		if(ae.getSource()==bcrt)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to create A/c?");
			if(con==JOptionPane.YES_OPTION)
			{
				new CreateAccount2("Customer Details..");
				setVisible(false);
			}
			
		}

		if(ae.getSource()==bback)
		{
			int con=JOptionPane.showConfirmDialog(this, "Do You want go back?");
			if(con==JOptionPane.YES_OPTION)
			{
				new LoginTypeFrame("Login...");
				setVisible(false);

			}
			
		}

		if(ae.getSource()==blnr)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You want to see all loan Request");
			if(con==JOptionPane.YES_OPTION)
			{
				new LoanRequestView();
			}
			
		}


                        if(ae.getSource()==bdr)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You want to see all draft Request");
			if(con==JOptionPane.YES_OPTION)
			{
				new DraftRequestView();
				
			}
			
		}


		if(ae.getSource()==bcbr)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You want to see all cheque book Request");
			if(con==JOptionPane.YES_OPTION)
			{
				new ChequeBookRequestView();
				
			}
			
		}





	}
public static void main(String[] args) {
		new AdminFrame("Admin...");

	}

}

		