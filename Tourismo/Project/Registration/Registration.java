package Registration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import LoginClass.*;
import WelcomePage.*;

public class Registration extends JFrame implements ActionListener
{
    JTextField t1,t2,t3,t4,t5;
	//JPasswordField t2;
	//JPanel p1,p2,p3;
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8, backgroundImg;
	JRadioButton r1,r2;
	//JComboBox c1,c2,c3;
	
	
	
	public Registration()
	{
		super(" Registration ");	
		this.setSize(815,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		//Adding Image Background
        ImageIcon img = new ImageIcon("Bin\\Backg\\007.png");
        backgroundImg = new JLabel("", img,JLabel.CENTER);
        backgroundImg.setBounds(0,0,815,620);
		backgroundImg.setBackground(Color.pink);
        this.add(backgroundImg);
		
		/*p1 = new JPanel();
		p1.setSize(new Dimension(900,80));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
			l1 = new JLabel("Wordpress");
		l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(330,30,300,30);
		backgroundImg.add(l1);
	
	    p2 = new JPanel();
		p2.setSize(new Dimension(900,620));
		p2.setBackground(Color.white);
		p2.setLayout(null);*/
		
		ImageIcon b1Img = new ImageIcon("bin\\Temp\\return.png");
        b1 = new JButton(b1Img);
        b1.setFont(new  Font("serif",Font.BOLD,30));
        b1.setBorderPainted(false);
        b1.setFocusable(false);
        b1.setBounds(5,5,51,48);
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1.setIcon(new ImageIcon("bin\\Temp\\return2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1.setIcon(new ImageIcon("bin\\Temp\\return.png"));
            }
        });
        b1.addActionListener(this);
        backgroundImg.add(b1);
		
		l1 = new JLabel(" Create an Account ", JLabel.CENTER);
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(0,50,450,30);
		backgroundImg.add(l1);
		
		l2 = new JLabel("Enter your name : ");
		l2.setFont(new Font("Serif",Font.BOLD,16));
		l2.setForeground(Color.black);
		l2.setBounds(140,150,350,30);
		backgroundImg.add(l2);
		
		l7 = new JLabel("Enter username : ");
		l7.setFont(new Font("Serif",Font.BOLD,16));
		l7.setForeground(Color.black);
		l7.setBounds(140,200,350,30);
		backgroundImg.add(l7);
		
		l4= new JLabel("Enter your Email Address : ");
		l4.setFont(new Font("Serif",Font.BOLD,15));
		l4.setForeground(Color.black);
		l4.setBounds(140,250,350,30);
		backgroundImg.add(l4);
		
		l3 = new JLabel("Enter password : ");
		l3.setFont(new Font("Serif",Font.BOLD,15));
		l3.setForeground(Color.black);
		l3.setBounds(140,350,350,30);
		backgroundImg.add(l3);
		
		l8 = new JLabel("Confirm password : ");
		l8.setFont(new Font("Serif",Font.BOLD,15));
		l8.setForeground(Color.black);
		l8.setBounds(140,400,350,30);
		backgroundImg.add(l8);
		
		t1 = new JTextField();
		t1.setBounds(330,200,150,30);
		backgroundImg.add(t1);
		
		t5 = new JTextField();
		t5.setBounds(330,150,150,30);
		backgroundImg.add(t5);
		
		t3 = new JTextField();
		t3.setBounds(330,250,150,30);
		backgroundImg.add(t3);
		
		t2 = new JPasswordField();
        t2.setBounds(330,350,150,30);
        backgroundImg.add(t2);	
		
		t4 = new JPasswordField();
        t4.setBounds(330,400,150,30);
        backgroundImg.add(t4);	
		
	   
//        String Date[]={"1", "2", "3", "4", "5",
 //           "6", "7", "8", "9", "10",
//            "11", "12", "13", "14", "15",
//            "16", "17", "18", "19", "20",
//            "21", "22", "23", "24", "25",
//            "26", "27", "28", "29", "30",
//            "31"};        
//        final JComboBox c1=new JComboBox(Date);    
//        c1.setBounds(330, 400,90,20);    
//        c1.setLayout(null);
//		p2.add(c1);    
        
		
//		String month[]={ "Jan", "feb", "Mar", "Apr",
//          "May", "Jun", "July", "Aug",
//         "Sup", "Oct", "Nov", "Dec" };        
//    final JComboBox c2=new JComboBox(month);    
//  c2.setBounds(350,400,90,20);    
//    c2.setLayout(null);
//	p2.add(c1);    
        
		
//	String year[]={"1995", "1996", "1997", "1998",
//       "1999", "2000", "2001", "2002",
//     "2003", "2004", "2005", "2006",
//            "2007", "2008", "2009", "2010",
//        "2011", "2012", "2013", "2014",
//       "2015", "2016", "2017", "2018",
//       "2019"};        
//    final JComboBox c3=new JComboBox(year);    
//    c3.setBounds(370, 400,90,20);    
//    c3.setLayout(null);
//	p2.add(c3);    
        
		
		
		
		l5= new JLabel("Gender : ");
		l5.setFont(new Font("Serif",Font.BOLD,15));
		l5.setForeground(Color.black);
		l5.setBounds(140,300,350,30);
		backgroundImg.add(l5);

        ButtonGroup bg1 = new ButtonGroup();
        r1=new JRadioButton("Male");    
        r1.setBounds(330,300,100,30);      
        r2=new JRadioButton("Female");    
        r2.setBounds(430,300,100,30);       
        bg1.add(r1);bg1.add(r2);  
    
        /*l6= new JLabel("Date Of Birth : ");
		l6.setFont(new Font("Serif",Font.BOLD,15));
		l6.setForeground(Color.black);
		l6.setBounds(140,350,350,30);
		backgroundImg.add(l4);*/
		
        setLayout(null);  
        backgroundImg.add(r1);  		
        backgroundImg.add(r2);  		
		
		b2 = new JButton("Register");
		b2.setBounds(320,450,180,30);
		b2.setBackground(Color.green);
		backgroundImg.add(b2);
		b2.addActionListener(this);
		
		/*this.add(p1);
		this.add(p2);*/
	}		
		
		
		public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b2)
			{
			String userName = t1.getText();
            String EmailAddress = t3.getText();
            //String Gender = bg1.getText();
            String Password = t2.getText();
            String RetypePassword = t4.getText();

            if(userName.isEmpty() ||  EmailAddress.isEmpty() || /*Gender.isEmpty() ||*/ Password.isEmpty() || RetypePassword.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Full Fill All Box");
            }
            else if(Password.equals(RetypePassword))
            {
                Registration1 createAccount = new Registration1( userName , EmailAddress, /*Gender,*/ Password ,RetypePassword);
                createAccount.addAccount();
                JOptionPane.showMessageDialog(null, "Account Created \n Proceed to Login");
                t3.setText("");
				t1.setText("");
                //bg1.setText("");
                t2.setText("");
                t4.setText("");
            }
            else{JOptionPane.showMessageDialog(null, "Check Password");}

            
			}
		else if(ae.getSource()==b1)
			{
				Welcome w = new Welcome();
				this.setVisible(false);
				w.setVisible(true);
			}
		else {  
            //show error message  
            System.out.println("Please enter valid username and password");  
        } 
		}
}