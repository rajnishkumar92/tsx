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

public class LoginFrame extends JFrame implements ActionListener
 {

	private JLabel l1,l2;
	private JPasswordField tpass;
	private JButton bsubmit;
	private String p ="abcd";

	public LoginFrame(String title)
	{
		super(title);
                Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));


		tpass=new JPasswordField(20);

		bsubmit=new JButton("Submit");
		bsubmit.addActionListener(this);

		Font f=new Font("Chiller",Font.BOLD,27);
		l1=new JLabel("   LOGIN...   ");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);

		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l2=new JLabel("password");
		l2.setFont(f1);
		l2.setForeground(Color.RED);

		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(tpass);

		c.add(bsubmit);c.add(new JLabel(""));


		setSize(250, 125);
		setLocation(300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
		
		
	}

        public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==bsubmit)
		{
			int con=JOptionPane.showConfirmDialog(this, "Are you want to Submit?");
			if(con==JOptionPane.YES_OPTION)
			{
				
			
			   if(p.equals(tpass.getText()))
			   {									
				JOptionPane.showMessageDialog(this, "valid password");
				new LoginTypeFrame("WELCOME....");
				setVisible(false);
			   }
			  else
			  JOptionPane.showMessageDialog(this, "Invalid password");
		        }
		}
				

}


public static void main(String[] args) {
		new LoginFrame("Login...");

	}

}
