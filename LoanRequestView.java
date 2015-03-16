import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.*;
import java.util.*;


public class LoanRequestView extends JFrame 
{

      public LoanRequestView()
	{
		super("All Loan Request");
		String heading[]={"Account no","Amount"};

		String data[][]=new String[20][2];
		
		ArrayList<Request> list=new ArrayList<Request>();

		try
		{
			FileInputStream fin=new FileInputStream("Regi1.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list=(ArrayList<Request>)oin.readObject();
			
			int r=0,c=0;
			for(Request re : list) 
                         {
                          	data[r][0]=re.getAccountNo();
				data[r][1]=re.getAmount();

			
				r++; c=0;
                               
                          }
                          
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
                        JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);

                        con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			
			setSize(850, 400);
			
			setLocation(200, 200);
			setVisible(true);
			
		
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
			
				











