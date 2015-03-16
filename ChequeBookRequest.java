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

public class ChequeBookRequest extends JFrame implements ActionListener
 {  
           private JLabel l1,l2,l3;
        private JTextField tcbr;
	private JTextField tamnt;
	private JButton bsubmit,bback;
	private int f=0;
	ArrayList<Request> list;
	public ChequeBookRequest(String title)
	{
		super(title);
		list=new ArrayList<Request>();
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));

                                   tcbr=new JTextField(20);
		tamnt=new JTextField(20);

		bsubmit=new JButton("submit");
		bsubmit.addActionListener(this);
		
		

		bback=new JButton("Back");
		bback.addActionListener(this);
		
		Font f=new Font("OldEnglishTextMT",Font.BOLD,23);
		l1=new JLabel("LoanRequest");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		

		
  
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l2=new JLabel("Enter Account no");
		l2.setFont(f1);
		l2.setForeground(Color.RED);

                l3=new JLabel("Enter Amount");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		
	c.add(l1);c.add(new JLabel(""));	
                 c.add(l2);c.add( tcbr);

                  c.add(l3);c.add(tamnt);

		c.add(bsubmit);c.add(bback);
		
		setSize(400, 125);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bsubmit)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Submit");
			if(con==JOptionPane.YES_OPTION)
			{

				String cbr=tcbr.getText();
				String amnt=tamnt.getText();                                     
			

			   try
			       {
				try
				{
					FileInputStream fin=new FileInputStream("Regi2.dat");
					ObjectInputStream oin=new ObjectInputStream(fin);
					list=(ArrayList<Request>)oin.readObject();
				 }catch(Exception e)
				{
					list=new ArrayList<Request>();
				}




				
				Request r=new Request(cbr,amnt);
				list.add(r);
				
				FileOutputStream fout=new FileOutputStream("Regi2.dat");
				ObjectOutputStream oout=new ObjectOutputStream(fout);
				oout.writeObject(list);
				JOptionPane.showMessageDialog(this, "Data Saved Successfully...");
				
				
			}catch(Exception e)
			{
				System.out.println("Error : "+e);
			}
			}
			
		}


		
			
		

		if(ae.getSource()==bback)
		{
			int con=JOptionPane.showConfirmDialog(this, "Do You want go back?");
			if(con==JOptionPane.YES_OPTION)
			{
				new CustomerFrame("customer...");
				setVisible(false);

			}
			
		}



	}
public static void main(String[] args) {
		new ChequeBookRequest("ChequeBookRequest ...");

	}

}

		