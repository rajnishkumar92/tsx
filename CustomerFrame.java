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

public class CustomerFrame extends JFrame implements ActionListener
 {

	private JRadioButton rdebit,rcredit;
	private JRadioButton rtrns,rdrft;
	private JRadioButton rchk,rblnc;
	private JRadioButton rupdt,rclse;
	private JRadioButton rloan,rtrcd;
	private JButton bsubmit,bback;



              public CustomerFrame(String title)
	{
		super(title);

		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));

		bsubmit=new JButton("SUBMIT");
		bsubmit.addActionListener(this);

		bback=new JButton("BACK");
		bback.addActionListener(this);

		rdebit=new JRadioButton("Debit\n");
		rdebit.addActionListener(this);
		rdebit.setSelected(true);
		
		rcredit=new JRadioButton("Credit");
		rcredit.addActionListener(this);


		rtrns=new JRadioButton("Transfer Money");
		rtrns.addActionListener(this);


		rdrft=new JRadioButton("Draft Request");
		rdrft.addActionListener(this);

		
		rchk=new JRadioButton("Cheque book Request");
		rchk.addActionListener(this);

		
		rblnc=new JRadioButton("Balance Check");
		rblnc.addActionListener(this);

		
		rupdt=new JRadioButton("Update Account");
		rupdt.addActionListener(this);

		
		rclse=new JRadioButton("Close Account");
		rclse.addActionListener(this);

		
		rloan=new JRadioButton("Loan Request");
		rloan.addActionListener(this);

		
		rtrcd=new JRadioButton("Transaction Details");
		rtrcd.addActionListener(this);

		ButtonGroup rgroup=new ButtonGroup();

		rgroup.add(rdebit);
		rgroup.add(rcredit);
		rgroup.add(rtrns);
		rgroup.add(rdrft);
		rgroup.add(rchk);
		rgroup.add(rblnc);
		rgroup.add(rupdt);
		rgroup.add(rclse);
		rgroup.add(rloan);
		rgroup.add(rtrcd);

		JPanel gpanel=new JPanel();
		gpanel.add(rdebit);
		gpanel.add(rcredit);
		gpanel.add(rtrns);
		gpanel.add(rdrft);
		gpanel.add(rchk);
		gpanel.add(rblnc);
		gpanel.add(rupdt);
		gpanel.add(rclse);
		gpanel.add(rloan);
		gpanel.add(rtrcd);

		c.add(gpanel);
		c.add(bsubmit);c.add(bback);

		setSize(1050, 325);
		setLocation(100,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bsubmit)
		{
		    int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Submit?");
		    if(con==JOptionPane.YES_OPTION)
		     {

				
			if(rdebit.isSelected())
			{
				//new Debit("Debit..");
				//setVisible(false);
			}
			 
		
			if(rcredit.isSelected())
			{
				new Credit("Credit...");
				setVisible(false);
			}

			if(rtrns.isSelected())
			{
				new TransferMoney("Transfer Request..");
				setVisible(false);
			}

			if(rdrft.isSelected())
			{
				new DraftRequest("Draft Request..");
				setVisible(false);
			}

			if(rchk.isSelected())
			{
				new ChequeBookRequest("customer");
				setVisible(false);
			}
			if(rblnc.isSelected())
			{
				new BalanceCheck("balance checking...");
				setVisible(false);
			}
			 if(rupdt.isSelected())
			{
				//new UpdateAccount("UpdateAccount");
				//setVisible(false);
			}  

			if(rclse.isSelected())
			{
				//new CloseAccount("CloseAccount");
				//setVisible(false);
			}

			if(rloan.isSelected())
			{
				new LoanRequest("LoanRequest");
				setVisible(false);
			}

			if(rtrcd.isSelected())
			{
				//new TransectionDetails();
				//setVisible(false);
			}
		}
	        }
	if(ae.getSource()==bback)
		{
		    int con=JOptionPane.showConfirmDialog(this, "Are You want to go back?");
		    if(con==JOptionPane.YES_OPTION)
		         {
			new LoginTypeFrame("Welcome to our Bank....");
		                  setVisible(false);

			}
	               }
     }
	public static void main(String[] args) 
     {
		new CustomerFrame("Customer....");

	}

}





			
			 
			 
			 
			 
			 
			 
		
