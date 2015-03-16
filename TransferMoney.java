import java.awt.Color;
import java.io.*;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TransferMoney extends JFrame implements ActionListener
{

	private JLabel l1,l2,l3,l4;
	private JTextField tacd,trcv,tamnt;
	private JButton bsubmit,bback;

	ArrayList<Registration> list;
	
	public TransferMoney(String title)
	{
		super(title);
		list=new ArrayList<Registration>();
		Container c=getContentPane();
		c.setLayout(new GridLayout(5,2));
		
		tacd=new JTextField(20);
		trcv=new JTextField(20);
		tamnt=new JTextField(20);

		bsubmit=new JButton("Submit");
		bsubmit.addActionListener(this);
		
		bback=new JButton("Back");
		bback.addActionListener(this);

		Font f=new Font("Chiller",Font.BOLD,27);
		l1=new JLabel("TRANSFER MONEY");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l2=new JLabel("A/c no of doner");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		
		l3=new JLabel("A/c no of reciver");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		
		l4=new JLabel("Amount");
		l4.setFont(f1);
		l4.setForeground(Color.RED);

		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(tacd);
		c.add(l3);c.add(trcv);
		c.add(l4);c.add(tamnt);
		c.add(bsubmit);c.add(bback);

                                    setSize(450, 325);
		setLocation(400,400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bsubmit)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure want to transfer money?");
			if(con==JOptionPane.YES_OPTION)
			{
				String dnr =tacd.getText();
			                  String rcv =trcv.getText();








			}
		}

		else if(ae.getSource()==bback)
		{

			int con=JOptionPane.showConfirmDialog(this, "Are You Sure want to go back");
			if(con==JOptionPane.YES_OPTION)
			{
				new CustomerFrame("Customer Frame....");
				setVisible(false);
			}
		}
		
	}
	public static void main(String[] args) 
	{
		new TransferMoney("Transfer money...");

	}

}



		
		