import java.awt.Color;
import java.io.*;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
public class Credit extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3;
	private JTextField tcrdt;
	private JTextField tamnt;
	private JButton bsubmit,bback;
	private int f=0;


	//ArrayList<Registration> list;
	
	public Credit(String title)
	{
		super(title);
		//list=new ArrayList<Registration>();
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		tcrdt=new JTextField(20);
		tamnt=new JPasswordField(20);

		bsubmit=new JButton("Submit");
		bsubmit.addActionListener(this);
		
		bback=new JButton("Back");
		bback.addActionListener(this);
		
		
		Font f=new Font("OldEnglishTextMT",Font.BOLD,27);
		l1=new JLabel("Credit..");
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
		c.add(l2);c.add(tcrdt);
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
			int con=JOptionPane.showConfirmDialog(this, "Are sure to submit?");
			if(con==JOptionPane.YES_OPTION)
			{
			String scrdt=tcrdt.getText();
			String samnt=tamnt.getText();

			/*try
			{

			FileInputStream fin=new FileInputStream("Regi.dat");
					ObjectInputStream oin=new ObjectInputStream(fin);
					list=(ArrayList<Registration>)oin.readObject();
					

				
			
			              Registration r1;

			            for(int i=0;i<list.size();i++)
			                 {
				     r1=(Registration)list.get(i);
				     if(sdbt.equals(r1.getAccount()))
				          {

					f = 1;
				                 JOptionPane.showMessageDialog(this, "valid A/c");
					break;

				           }
			                   }
				if(f==0)

				JOptionPane.showMessageDialog(this, "Account no is not valid");
			           }catch(Exception e)
				{
					list=new ArrayList<Registration>();
				}*/
			    }	


			}
			
			else if(ae.getSource()==bback)	
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
		new Debit("Credit..");

	}

}

		