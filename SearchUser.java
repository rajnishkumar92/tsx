import java.awt.Color;
import java.io.*;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
public class SearchUser extends JFrame implements ActionListener
{
	private JLabel l1,l2;
	private JTextField tac;
	private JButton bsrch;
	private JButton bback;
	private int f=0;
	private String acn,na,em,ad,cy,phn,vot,gn,dob,amnt;

	ArrayList<Registration> list;
	
	public SearchUser(String title)
	{
		super(title);

		list=new ArrayList<Registration>();

		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		tac=new JPasswordField(20);

		bsrch=new JButton("Search");
		bsrch.addActionListener(this);

		bback=new JButton("Back");
		bback.addActionListener(this);
		
		
		Font f=new Font("OldEnglishTextMT",Font.BOLD,27);
		l1=new JLabel("Searching....");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l2=new JLabel("Enter Account Number");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		
			
		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(tac);
		c.add(bsrch);c.add(bback);

		setSize(350, 225);
		setLocation(400,400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}	

            public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bsrch)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You want to Search?");
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
					
                                  				if(x.equals(tac.getText()))
                                       			 {
						f=1;
                                          				JOptionPane.showMessageDialog(this, "account no is valid ");

						String na=s1.getName();
						String em= s1.getEmail();
						String ad= s1.getAddress();
						String cy= s1.getCity();
						String phn= s1.getPhone();	
						String vot= s1.getVoterid();
						String gn= s1.getGender();
						String dob= s1.getDob();
						String amnt= s1.getbalance();					
						JOptionPane.showMessageDialog(this, "Name=" +na +"\nemail id="+ em+"\naddress=" +ad +"\ncity="+ cy+"\nphone No=" +phn +"\nVoter id="+vot+"\ngender=" +gn +"\nDate of birth="+dob ); 
						

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
	           else if(ae.getSource()==bback)
		                    {
			   int con=JOptionPane.showConfirmDialog(this, "Are You want to go back?");
			    if(con==JOptionPane.YES_OPTION)
			  	 {
			
					new AdminFrame("Admin...");
					setVisible(false);
				}
			     }


		
			
	
              }
		
	       
	public static void main(String[] args) 
	{
		new SearchUser("Checkbox");

	}

}

		