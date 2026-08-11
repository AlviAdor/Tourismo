package LoginClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Homepage.*;
import Registration.*;
import WelcomePage.*;

public class Login extends JFrame implements ActionListener
{
		//private static final long serialVersionUID = 1L;
		JLabel l1,l2,l3,l4, backgroundImg;
		JTextField t1;
		JButton b1,b2, b3, b4; 
		JPanel p1,p2;
		JPasswordField t2;
		Registration1 Registration1;
		
		
	public Login()
	{
		super(" Login Page ");
		this.setSize(815,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		//Adding Image Background
        ImageIcon img = new ImageIcon("Bin\\Backg\\007.png");
        backgroundImg = new JLabel("", img,JLabel.CENTER);
        backgroundImg.setBounds(0,0,815,620);
		backgroundImg.setBackground(Color.pink);
        this.add(backgroundImg);
		
		//p1 = new JPanel();
		//p1.setSize(new Dimension(900,80));
		//p1.setBackground(Color.black);
		//p1.setLayout(null);
		
		//l1 = new JLabel("Wordpress");
		//l1.setFont(new Font("Times New Roman",Font.BOLD,30));
		//l1.setForeground(Color.black);
		//l1.setBounds(330,30,300,30);
		//backgroundImg.add(l1);
	
	    //p2 = new JPanel();
		//p2.setSize(new Dimension(900,620));
		//p2.setBackground(Color.pink);
		//p2.setLayout(null);
		
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
		
		l3 = new JLabel("Password: ");
		l3.setFont(new Font("Times New Roman",Font.BOLD,17));
		l3.setForeground(Color.black);
		l3.setBounds(250,300,150,20);
		//p2.add(l3);
		backgroundImg.add(l3);
		
		
//		id = new JTextField();
//		id.setBounds(220,100,100,25);
//		p2.add(id);

		
		
//		b1 = new JButton("");
//		b1.setFont(new Font("Times New Roman",Font.BOLD,15));
//		b1.setForeground(Color.green);
//		b1.setBounds(180,520,100,25);
//		p2.add(b1);
		
		
	    
		l2 = new JLabel("User Id: ");
		l2.setFont(new Font("Times New Roman",Font.BOLD,17));
		l2.setForeground(Color.black);
		l2.setBounds(250,230,400,80);
		//p2.add(l2);
		backgroundImg.add(l2);
		
		t1 = new JTextField();
		t1.setBounds(350,255,180,30);
		//p2.add(t1);
		backgroundImg.add(t1);
		
		l4 = new JLabel();
		l4.setFont(new Font("Times New Roman",Font.BOLD,20));
		l4.setForeground(Color.white);
		l4.setBounds(180,300,150,20);
		//p2.add(l4);
		backgroundImg.add(l4);
		
		b2 = new JButton("Login");
		b2.setFont(new Font("Times New Roman",Font.BOLD,17));
		b2.setForeground(Color.black);
		b2.setBackground(Color.green);
		b2.setBounds(330,360,200,30);
		b2.addActionListener(this);
		//p2.add(b2);
		backgroundImg.add(b2);		
		
		b3 = new JButton("Register");
		b3.setFont(new Font("Times New Roman",Font.BOLD,17));
		b3.setForeground(Color.black);
		b3.setBackground(Color.green);
		b3.setBounds(330,400,200,30);
		b3.addActionListener(this);
		//p2.add(b3);
		backgroundImg.add(b3);		
		
		ImageIcon b4Img = new ImageIcon("bin\\Temp\\Exit.png");
        b4 = new JButton(b4Img);
        b4.setFont(new  Font("serif",Font.BOLD,30));
        b4.setBorderPainted(false);
        b4.setFocusable(false);
        b4.setBounds(748,531,38,43);
        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4.setIcon(new ImageIcon("bin\\Temp\\Exit2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4.setIcon(new ImageIcon("bin\\Temp\\Exit.png"));
            }
        });
        b4.addActionListener(this);
        backgroundImg.add(b4);
		
		
		t2 = new JPasswordField();
		t2.setBounds(350,300,180,30);
		//p2.add(t2);
		backgroundImg.add(t2);
		
        //this.add(p1);		
        //this.add(p2);
	}

		public void actionPerformed(ActionEvent ae)
		{
			String name = t1.getText();        //get user entered username from the textField1  
            String userPassword = t2.getText();			//get user entered pasword from the textField2
			Registration1 r1 = new Registration1();
          
        //check whether the credentials are authentic or not  
           if(ae.getSource()==b2)
		   {
			   if(r1.getAccount(name,userPassword))//.equals(name, userPassword))//==name && r1.getPassword()==userPassword)
            {
                JOptionPane.showMessageDialog(null,"Login Successful");

                Homepage h = new Homepage();
				this.setVisible(false);
				h.setVisible(true); 

            }
            else
			{
				JOptionPane.showMessageDialog(null, "Check UserName/Password");
				}
		   }
        
			else if(ae.getSource()==b4)
			{
				System.exit(0);
			}
			else if(ae.getSource()==b3)
			{
				Registration r = new Registration();
				this.setVisible(false);
				r.setVisible(true);
			}
			else if(ae.getSource()==b1)
			{
				Welcome w = new Welcome();
				this.setVisible(false);
				w.setVisible(true);
			}
			else
			{    //Show Error message
				JOptionPane.showMessageDialog(null, "Login Failed"+"\nCheck UserName/Password");
			} 
        }  
			
		}

















