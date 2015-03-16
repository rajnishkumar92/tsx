import java.awt.Color;
import java.io.*;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
public class LoanRequest extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3;
	private JTextField tacn;
	private JTextField tamnt;
	private JButton bsubmit,bback;
	private int f=0;


	ArrayList<Request> list;
	
	public LoanRequest(String title)
	{
		super(title);
		list=new ArrayList<Request>();
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		tacn=new JTextField(20);
		tamnt=new JTextField(20);

		bsubmit=new JButton("Submit");
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
		
		l3=new JLabel("Enter Ammount");
		l3.setFont(f1);
		l3.setForeground(Color.RED);

		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(tacn);
		c.add(l3);c.add(tamnt);

		c.add(bsubmit);c.add(bback);

		setSize(350, 225);
		setLocation(400,400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	   }	

       public void actionPerformed(ActionEvent ae)
	{
		
	
		
		if(ae.getSource()==bsubmit)
		{
		    int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");
		    if(con==JOptionPane.YES_OPTION)

		      {
			String acn=tacn.getText();
			String amnt=tamnt.getText();                                     
			
			try
			{
				try
				{
					FileInputStream fin=new FileInputStream("Regi1.dat");
					ObjectInputStream oin=new ObjectInputStream(fin);
					list=(ArrayList<Request>)oin.readObject();
				 }catch(Exception e)
				{
					list=new ArrayList<Request>();
				}




				
				Request r=new Request(acn,amnt);
				list.add(r);
				
				FileOutputStream fout=new FileOutputStream("Regi1.dat");
				ObjectOutputStream oout=new ObjectOutputStream(fout);
				oout.writeObject(list);
				JOptionPane.showMessageDialog(this, "Data Saved Successfully...");
				
				
			}catch(Exception e)
			{
				System.out.println("Error : "+e);
			}
		       }
                }


	
			
			else if(ae.getSource() == bback)	
			{
			        int  con=JOptionPane.showConfirmDialog(this, "Are sure to go back?");
			         if(con==JOptionPane.YES_OPTION)
			            {
				new CustomerFrame("Customer..");
				setVisible(false);
				}
			}

	
	
              }
		
	       
	public static void main(String[] args) 
	{
		new LoanRequest("Loan Request..");

	}

}

		