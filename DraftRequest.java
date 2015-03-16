import java.awt.Color;
import java.io.*;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DraftRequest extends JFrame implements ActionListener
 {

	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JTextField tacn,tamnt,tfbr,tpybl,tsrtx,ttl;
	private JButton bsubmit,bback;

	ArrayList<Request2> list;
	
	public DraftRequest(String title)
	{
		super(title);
		list=new ArrayList<Request2>();
		Container c=getContentPane();
		c.setLayout(new GridLayout(9,2));
		
		tacn=new JTextField(20);
		tamnt=new JTextField(20);
		tpybl=new JTextField(20);
		tfbr=new JTextField(20);
		tsrtx=new JTextField(20);
		ttl=new JTextField(20);

		bsubmit=new JButton("Submit");
		bsubmit.addActionListener(this);
		
		bback=new JButton("Back");
		bback.addActionListener(this);

		Font f=new Font("Chiller",Font.BOLD,27);
		l1=new JLabel("DRAFT REQUEST");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l2=new JLabel("Account no");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		
		l3=new JLabel("Amount");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		
		l4=new JLabel("In Favour of");
		l4.setFont(f1);
		l4.setForeground(Color.RED);
		
		l5=new JLabel("Payable at");
		l5.setFont(f1);
		l5.setForeground(Color.RED);
		
		l6=new JLabel("Service tax");
		l6.setFont(f1);
		l6.setForeground(Color.RED);
		
		l7=new JLabel("Total");
		l7.setFont(f1);
		l7.setForeground(Color.RED);
		
		
		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(tacn);
		c.add(l3);c.add(tamnt);
		c.add(l4);c.add(tfbr);
		c.add(l5);c.add(tpybl);
		c.add(l6);c.add(tsrtx);
		c.add(l7);c.add(ttl);
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
			int con=JOptionPane.showConfirmDialog(this, "Do You want to submit?");
			if(con==JOptionPane.YES_OPTION)
			{
				
				String acn=tacn.getText();
				String amnt=tamnt.getText(); 
				String fbr=tfbr.getText(); 
				String pybl=tpybl.getText(); 
				String tl=ttl.getText();                                     
			
			try
			{
				try
				{
					FileInputStream fin=new FileInputStream("Data.dat");
					ObjectInputStream oin=new ObjectInputStream(fin);
					list=(ArrayList<Request2>)oin.readObject();
				 }catch(Exception e)
				{
					list=new ArrayList<Request2>();
				}




				
				Request2 r=new Request2(acn,amnt,fbr,pybl,tl);
				list.add(r);
				
				FileOutputStream fout=new FileOutputStream("Data.dat");
				ObjectOutputStream oout=new ObjectOutputStream(fout);
				oout.writeObject(list);
				JOptionPane.showMessageDialog(this, "Data Saved Successfully...");
				
				
			}catch(Exception e)
			{
				System.out.println("Error : "+e);
			}





			}
		}

	               else if(ae.getSource()==bback)
		{
			new CustomerFrame("Customer Section..");
			setVisible(false);

		}
		
	}

              public static void main(String[] args) 
                  {
		new DraftRequest("Draft....");

	}

}

