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

public class BalanceCheck extends JFrame implements ActionListener
 {  
           private JLabel l1;

           private JTextField tacno;
           
           private JButton bsbmt,bback;
           private String x;
	ArrayList<Registration> list;
       public BalanceCheck(String title)
	{
		super(title);

		Container c=getContentPane();
		c.setLayout(new GridLayout(2,2));

                
                
               		 tacno=new JTextField(20);
  
                	bsbmt=new JButton("submit");
		bsbmt.addActionListener(this);
		
		

		bback=new JButton("Back");
		bback.addActionListener(this);

                	Font f1=new Font("comic sans ms",Font.BOLD,14);
		l1=new JLabel("Enter Account no");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
         
                	 c.add(l1);c.add( tacno);

                 	c.add(bsbmt);c.add(bback); 

                 	setSize(400, 125);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
	}

 	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bsbmt)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Search account?");
			if(con==JOptionPane.YES_OPTION)
			{
				
				try
			     	{

				 	 FileInputStream fin=new FileInputStream("Regi.dat");
					ObjectInputStream oin=new ObjectInputStream(fin);
					list=(ArrayList<Registration>)oin.readObject();
	                     		 	int f=0;     
                                   			 for(Registration s1:list)
                                    			{

                                      				String x=s1.getAccountno();
					
                                  				if(x.equals(tacno.getText()))
                                       			 	{
						f=1;
                                          				JOptionPane.showMessageDialog(this, "account no is valid ");

						String amnt= s1.getbalance();					
						JOptionPane.showMessageDialog(this, "Balance=" +amnt ); 
						

		    				}
					}
                                   	         		 if(f==0)
                                            		 	JOptionPane.showMessageDialog(this, "Invalid account no");    
			            
					}catch(Exception e)
                                  			  {
                                      				e.printStackTrace();
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
		new BalanceCheck("ChequeBookRequest form...");

	}

}

		