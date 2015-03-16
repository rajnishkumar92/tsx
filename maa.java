
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.*;
import java.util.*;

public class maa extends JFrame {

      public maa()
	{
		super("Display All");
		String heading[]={"Name","email","Address","City","phone","voter id","balance","account opening date ","Gender","Date Of Birth","account type","account no"};
             
               String data[][]=new String[20][12];
		ArrayList<Registration> list=new ArrayList<Registration>();
		try
		{
			FileInputStream fin=new FileInputStream("Regi.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list=(ArrayList<Registration>)oin.readObject();
			
			int r=0;
			for(Registration re : list) 
                       {
                          	data[r][0]=re.getName();                        
				data[r][1]=re.getEmail();
				data[r][2]=re.getAddress();
				data[r][3]=re.getCity();
				data[r][4]=re.getPhone();
				data[r][5]=re.getVoterid();
				data[r][6]=re.getbalance();
                                

     
				data[r][7]=re.getYear();
				data[r][8]=re.getGender();
				data[r][9]=re.getDob();
				data[r][10]=re.getAccountType();
				data[r][11]=re.getAccountno();
				r++;
                               
                            }
                          
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
                        JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);

                        con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			
			setSize(450, 300);
			
			setLocation(200, 200);
			setVisible(true);
			
		
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
			
				











