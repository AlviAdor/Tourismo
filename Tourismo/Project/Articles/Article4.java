package Articles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import LoginClass.*;
import Homepage.*;

public class Article4 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12; 
		JPanel p1,p2,p3,p4;
		Login id;
		
	public Article4()
	{
		super(" Article 4 ");
		this.setSize(815,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(900,80));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(900,120));
		Color c1= new Color(0,162,232);
		p2.setBackground(c1);
		p2.setLayout(null);
		
		l1 = new JLabel("Wordpress");
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(330,30,300,30);
		p1.add(l1);												 
		
		l3 = new JLabel("Welcome, "+id);
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,9));
		l3.setForeground(Color.white);
		l3.setBounds(715,10,150,20);
		p1.add(l3);
		
		b4 = new JButton("Logout");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,7));
		b4.setForeground(Color.black);
		b4.setBackground(Color.red);
		b4.setBounds(715,30,60,15);
		b4.addActionListener(this);
		p1.add(b4);
		
//		t1 = new JTextField();
//		t1.setBounds(220,100,100,25);
//		p2.add(t1);
        
		p3 = new JPanel();
		p3.setSize(new Dimension(900,120));
		p3.setBackground(Color.white);
		p3.setLayout(null);
		
        l5 = new JLabel("Title Name");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		l5.setForeground(Color.black);
		l5.setBounds(40,130,150,20);
		p3.add(l5);
		
		l7 = new JLabel("Article");
		l7.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		l7.setForeground(Color.black);
		l7.setBounds(380,300,150,20);
		p3.add(l7);
		
		l6 = new JLabel("Comment");
		l6.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l6.setForeground(Color.black);
		l6.setBounds(40,480,150,20);
		p3.add(l6);
	
		t2 = new JTextField();
		t2.setBounds(120,480,140,50);
		p3.add(t2);
		
//		b1 = new JButton("Add");
//		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
//		b1.setForeground(Color.green);
//		b1.setBounds(180,220,100,25);
		//b1.addActionListener(this);
//		p2.add(b1);
	
		b3 = new JButton("Home");
		b3.setFont(new Font("Times New Roman",Font.BOLD,15));
		b3.setForeground(Color.black);
		b3.setBounds(10,90,75,20);
		b3.addActionListener(this);
		p2.add(b3);
				
		
		
		
		
//		p4 = new JPanel();
//		p4.setSize(new Dimension(900,200));
//        p4.setBounds(20,120,75,20);
//		Color c2= new Color(0,162,232);
//		p4.setBackground(Color.gray);
//		p4.setLayout(null);
	    
//		l4 = new JLabel();
//		l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
//		l4.setForeground(Color.white);
//		l4.setBounds(180,300,150,20);
//		p3.add(l4);
		
//		b2 = new JButton("Next");
//		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
//		b2.setForeground(Color.white);
//		b2.setBackground(Color.green);
//		b2.setBounds(330,320,80,30);
		//b2.addActionListener(this);
//		p3.add(b2);	
		
        this.add(p1);		
        this.add(p2);
		this.add(p3);
//		this.add(p4);
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b3)
			{
				Homepage h = new Homepage();
				this.setVisible(false);
				h.setVisible(true);
			}
		     else if(ae.getSource()==b4)
			{
				Login lo = new Login();
				this.setVisible(false);
				lo.setVisible(true);
			}
		}	


}