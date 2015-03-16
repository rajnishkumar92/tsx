import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CreateAccount2 extends JFrame implements ActionListener, ItemListener {

        private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	
	private JTextField tnm,tid,tphn,tblnc,tvoter,tyr,tacno;

        private JTextArea tadd;
	private JComboBox ct,day,month,year;
	private JRadioButton rfx,rmn;
	private JRadioButton rmale,rfemale;
	private JButton bsubmit,breset,bback;

        ArrayList<Registration> list;

        public CreateAccount2(String title)
	{
		super(title);

                list=new ArrayList<Registration>();
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(14,3));

		
		tnm=new JTextField(20);
		tid=new JTextField(20);
		tphn=new JTextField(20);
		tblnc=new JTextField(20);
		tvoter=new JTextField(20);
		tyr=new JTextField(20);
                tacno=new JTextField(20);
                
		tadd=new JTextArea(5,20);
		JScrollPane tapan=new JScrollPane(tadd);

                
                String ctvalue[]={"Kolkata","Delhi","Mumbai","Chennai","Hydrabad","Pune","Bangalore"};
		ct=new JComboBox(ctvalue);
		ct.addItemListener(this);
		
		rmale=new JRadioButton("Male");
		rmale.addActionListener(this);
		rmale.setSelected(true);
		
		rfemale=new JRadioButton("Female");
		rfemale.addActionListener(this);
		ButtonGroup rgroup1=new ButtonGroup();
		
		rgroup1.add(rmale);
		rgroup1.add(rfemale);
		JPanel gpanel1=new JPanel();
		
		gpanel1.add(rmale);
		gpanel1.add(rfemale);



		rfx=new JRadioButton("Fixed");
		rfx.addActionListener(this);
		rfx.setSelected(true);
		
		rmn=new JRadioButton("Monthly");
		rmn.addActionListener(this);
		ButtonGroup rgroup2=new ButtonGroup();
		
		rgroup2.add(rfx);
		rgroup2.add(rmn);
		JPanel gpanel2=new JPanel();
		
		gpanel2.add(rfx);
		gpanel2.add(rmn);
		
		String dvalue[]=new String[31];
		for(int i=0;i<=30;i++)
		{
			dvalue[i]=String.valueOf(i+1);
		}
		day=new JComboBox(dvalue);
		
		String mvalue[]=new String[12];
		for(int i=0;i<=11;i++)
		{
			mvalue[i]=String.valueOf(i+1);
		}
		month=new JComboBox(mvalue);
		
		String yvalue[]=new String[12];
		int cnt=0;
		for(int i=2000;i<=2011;i++)
		{
			yvalue[cnt]=String.valueOf(i);
			cnt++;	
		}
		year=new JComboBox(yvalue);
		JPanel cpanel=new JPanel();
		cpanel.add(day);
		cpanel.add(month);
		cpanel.add(year);
		
			
		
		bsubmit=new JButton("Register");
		bsubmit.addActionListener(this);

                breset=new JButton("diplay all");
		breset.addActionListener(this);

                
                bback=new JButton("Back");
		bback.addActionListener(this);

               Font f=new Font("Chiller",Font.BOLD,27);
		l1=new JLabel("Customer Detail");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l2=new JLabel("Enter Name");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		
		l3=new JLabel("Enter Email ID");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		
		l4=new JLabel("Enter Address");
		l4.setFont(f1);
		l4.setForeground(Color.RED);
		
		l5=new JLabel("Select City");
		l5.setFont(f1);
		l5.setForeground(Color.RED);

		l6=new JLabel("Enter phone no:");
		l6.setFont(f1);
		l6.setForeground(Color.RED);
		
		l7=new JLabel("Select Gender");
		l7.setFont(f1);
		l7.setForeground(Color.RED);
		
		l8=new JLabel("Select Date of Birth");
		l8.setFont(f1);
		l8.setForeground(Color.RED);
		
		l9=new JLabel("Enter voter id no");
		l9.setFont(f1);
		l9.setForeground(Color.RED);

		l10=new JLabel("Enter Account Type");
		l10.setFont(f1);
		l10.setForeground(Color.RED);
		
		l11=new JLabel("balance");
		l11.setFont(f1);
		l11.setForeground(Color.RED);

		l12=new JLabel("Year");
		l12.setFont(f1);
		l12.setForeground(Color.RED);

                l13=new JLabel("Account No");
		l13.setFont(f1);
		l13.setForeground(Color.RED);
		

                
		c.add(l1);c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(l2);c.add(tnm);c.add(new JLabel(""));
		c.add(l3);c.add(tid);c.add(new JLabel(""));
		c.add(l4);c.add(tapan);c.add(new JLabel(""));
		c.add(l5);c.add(ct);c.add(new JLabel(""));
		c.add(l6);c.add(tphn);c.add(new JLabel(""));
		c.add(l7);c.add(gpanel1);c.add(new JLabel(""));
		c.add(l8);c.add(cpanel);c.add(new JLabel(""));
		c.add(l9);c.add(tvoter);c.add(new JLabel(""));
		c.add(l10);c.add(gpanel2);c.add(new JLabel(""));
		c.add(l11);c.add(tblnc);c.add(new JLabel(""));
		c.add(l12);c.add(tyr);c.add(new JLabel(""));
                c.add(l13);c.add(tacno);c.add(new JLabel(""));                

                 
                c.add(bsubmit);c.add(breset); 
                c.add(bback);   
		
		setSize(650, 425);
		setLocation(100,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		
	}  

     
	public void itemStateChanged(ItemEvent ie)
	{
		String city=(String)ct.getSelectedItem();
		JOptionPane.showMessageDialog(this, "Your Selected City : "+city);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bsubmit)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");
			if(con==JOptionPane.YES_OPTION)
			{
			 String na=tnm.getText();
			String em=tid.getText();                                     
			String ad=tadd.getText();
			String cy=(String)ct.getSelectedItem();
			String pne=tphn.getText();
			String vot=tvoter.getText();
			String in=tblnc.getText();
     			String yr=tyr.getText();
                        String acno=tacno.getText();


			String gn="";
			if(rmale.isSelected())
			{
				gn="Male";
			}
			else if(rfemale.isSelected())
			{
				gn="Female";
			}
			
			String ac="";
			if(rfx.isSelected())
			{
				ac="Fixed";
			}
			else if(rmn.isSelected())
			{
				ac="Monthly";
			}
			
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			String dob=d + "-" + m + "-" + y;
			
			try
			{
				try
				{
					FileInputStream fin=new FileInputStream("Regi.dat");
					ObjectInputStream oin=new ObjectInputStream(fin);
					list=(ArrayList<Registration>)oin.readObject();
				}catch(Exception e)
				{
					list=new ArrayList<Registration>();
				}
				
				Registration r=new Registration(na,em,ad,cy,pne,vot,in,yr,gn,ac,dob,acno);
				list.add(r);
				
				FileOutputStream fout=new FileOutputStream("Regi.dat");
				ObjectOutputStream oout=new ObjectOutputStream(fout);
				oout.writeObject(list);
				JOptionPane.showMessageDialog(this, "Data Saved Successfully...");
				
				
			}catch(Exception e)
			{
				System.out.println("Error : "+e);
			}
		      }	

                    }
		else if(ae.getSource()==rmale)
		{
			JOptionPane.showMessageDialog(this, "Your Gender : Male");
		}
		else if(ae.getSource()==rfemale)
		{
			JOptionPane.showMessageDialog(this, "Your Gender : Female");
		}

              else if(ae.getSource()==breset)
		{
			new maa();
		}

             else if(ae.getSource()==bback)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to create account?");
			if(con==JOptionPane.YES_OPTION)
			{
				new AdminFrame("login");
                                setVisible(false); 
			}
			
		}
		       
         

  }
               public static void main(String[] args) 
            {
		new CreateAccount2("form fill up...");

	    }

}
