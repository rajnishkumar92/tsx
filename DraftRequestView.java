import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.*;
import java.util.*;


public class DraftRequestView extends JFrame 
{

      public DraftRequestView()
	{
		super("All Cheque book Request");
		String heading[]={"Account no","Amount","In Favour Of","Payable At","Total"};

		String data[][]=new String[20][5];
		
		ArrayList<Request2> list=new ArrayList<Request2>();

		try
		{
			FileInputStream fin=new FileInputStream("Data.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list=(ArrayList<Request2>)oin.readObject();
			
			int r=0;
			for(Request2 re : list) 
                             		  {
                          			  data[r][0]=re.getAccountNo();
				data[r][1]=re.getAmount();
				data[r][2]=re.getInFavourOf();
				data[r][3]=re.getPayableAt();
				data[r][4]=re.getTotal();


			
				r++;
                               
                          		}
                          
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
                       		 JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);

                        		con.add(new JLabel("All Cheque book Request Details"),BorderLayout.NORTH);
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
			
				











