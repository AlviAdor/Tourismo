package Articles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import LoginClass.*;
import Homepage.*;

public class Article1 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5,l6,l7,l8, backgroundImg;
		JTextField t1;
		JTextArea t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12; 
		//JPanel p1,p2,p3,p4;
		JScrollPane s1,s2,s3;
		Login id;
		
	public Article1()
	{
		super(" Article 1 ");
		this.setSize(815,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		
		//Adding Image Background
        ImageIcon img = new ImageIcon("Bin\\Backg\\007.png");
        backgroundImg = new JLabel("", img,JLabel.CENTER);
        backgroundImg.setBounds(0,0,815,620);
		backgroundImg.setBackground(Color.pink);
        this.add(backgroundImg);
		/*s1 = new JScrollPane(backgroundImg);
		s1.setBounds(20,150,775,320);
		backgroundImg.add(s1);*/
		
		/*p1 = new JPanel();
		p1.setSize(new Dimension(900,80));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		p2 = new JPanel();
		p2.setSize(new Dimension(900,120));
		Color c1= new Color(0,162,232);
		p2.setBackground(c1);
		p2.setLayout(null);*/
		
		/*l1 = new JLabel("Wordpress");
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(330,30,300,30);
		p1.add(l1);*/												 
		
		/*l3 = new JLabel("Welcome, "+this.id);
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
		p1.add(b4);*/
		
		
		ImageIcon b4Img = new ImageIcon("bin\\Temp\\logout.png");
        b4 = new JButton(b4Img);
        b4.setFont(new  Font("serif",Font.BOLD,30));
        b4.setBorderPainted(false);
        b4.setFocusable(false);
        b4.setBounds(751,16,42,42);
        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4.setIcon(new ImageIcon("bin\\Temp\\logout2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4.setIcon(new ImageIcon("bin\\Temp\\logout.png"));
            }
        });
        b4.addActionListener(this);
        backgroundImg.add(b4);
		
        
		/*p3 = new JPanel();
		p3.setSize(new Dimension(900,120));
		p3.setBackground(Color.white);
		p3.setLayout(null);*/
		
        l5 = new JLabel("Introducing Java");
		l5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		l5.setForeground(Color.black);
		l5.setBounds(20,130,150,20);
		backgroundImg.add(l5);
		
		l7 = new JLabel("<html>JAVA was developed by James Gosling at Sun Microsystems Inc in the year 1995,		<br>\r\n later acquired by Oracle Corporation.		 <br>\r\n It is a simple programming language.	 <br>\r\n Java makes writing, compiling, and debugging programming easy.	 <br>\r\n It helps to create reusable code and modular programs.		 <br>\r\n Java is a class-based,		 <br>\r\n object-oriented programming language and is designed to have as few implementation dependencies as possible.		 <br>\r\n A general-purpose programming language made for developers to write once run anywhere that is compiled Java code can run on all platforms that support Java.		 <br>\r\n Java applications are compiled to byte code that can run on any Java Virtual Machine.		 <br>\r\n The syntax of Java is similar to c/c++.		<br>\r\n History: Java’s history is very interesting.		 <br>\r\n It is a programming language created in 1991.		 <br>\r\n James Gosling, Mike Sheridan, and Patrick Naughton, a team of Sun engineers known as the Green team initiated the Java language in 1991.		 <br>\r\n Sun Microsystems released its first public implementation in 1996 as Java 1.0.		 <br>\r\n It provides no-cost -run-times on popular platforms.		 <br>\r\n Java1.0 compiler was re-written in Java by Arthur Van Hoff to strictly comply with its specifications.		 <br>\n With the arrival of Java 2, new versions had multiple configurations built for different types of platforms.</html>", JLabel.LEFT);
		l7.setFont(new Font("Times New Roman",Font.PLAIN,10));
		//l7.setBackground(Color.white);
		//l7.setBounds(40,300,150,20);
		l7.setLayout(new BorderLayout());
		//p3.add(l7);
		s2 = new JScrollPane(l7);
		s2.setBounds(20,150,775,320);
		backgroundImg.add(s2);
		
		l6 = new JLabel("Comment");
		l6.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l6.setForeground(Color.black);
		l6.setBounds(40,520,150,20);
		backgroundImg.add(l6);
	
		t2 = new JTextArea();
		t2.setLineWrap(true);
		t2.setWrapStyleWord(true);
		t2.setFont(new Font("Ariel",Font.PLAIN,15));
		//t2.setBounds(120,480,140,50);
		
		s3 = new JScrollPane(t2);
		s3.setBounds(120,520,300,60);
		backgroundImg.add(s3);
	
		ImageIcon b3Img = new ImageIcon("bin\\Temp\\submit.png");
        b3 = new JButton(b3Img);
        b3.setFont(new  Font("serif",Font.BOLD,30));
        b3.setBorderPainted(false);
        b3.setFocusable(false);
        b3.setBounds(435,528,67,45);
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3.setIcon(new ImageIcon("bin\\Temp\\submit2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3.setIcon(new ImageIcon("bin\\Temp\\submit.png"));
            }
        });
        b3.addActionListener(this);
        backgroundImg.add(b3);
		
		ImageIcon b1Img = new ImageIcon("bin\\Temp\\home.png");
        b1 = new JButton(b1Img);
        b1.setFont(new  Font("serif",Font.BOLD,30));
        b1.setBorderPainted(false);
        b1.setFocusable(false);
        b1.setBounds(5,5,53,53);
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1.setIcon(new ImageIcon("bin\\Temp\\home2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1.setIcon(new ImageIcon("bin\\Temp\\home.png"));
            }
        });
        b1.addActionListener(this);
        backgroundImg.add(b1);
		
		l8 = new JLabel(" ");
		l8.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l8.setForeground(Color.black);
		l8.setBounds(80,490,150,20);
		backgroundImg.add(l8);
		
		/*b3 = new JButton("Home");
		b3.setFont(new Font("Times New Roman",Font.BOLD,15));
		b3.setForeground(Color.black);
		b3.setBounds(10,90,75,20);
		b3.addActionListener(this);
		backgroundImg.add(b3);*/
				
				
        /*this.add(p1);		
        this.add(p2);
		this.add(p3);*/
		
		  

          

	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
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
			else if(ae.getSource()==b3)
			{
				String comment = t2.getText();
			Comment c1 = new Comment();
           if(comment.isEmpty())
			   
            {
                JOptionPane.showMessageDialog(null, "COMMENT BOX IS EMPTY");
            }
            else
            {
				/*Login l = new Login();
				l = t2.getText();*/
                Comment c = new Comment(comment);
				//String comment = t2.getText();
                c.addComment();
                JOptionPane.showMessageDialog(null, "Comment Added");
				t2.setText("");
				l8.setText(""+" : "+String.valueOf(comment));
				
				//l8.setVisible(true);
            }
			}
		}	


}
