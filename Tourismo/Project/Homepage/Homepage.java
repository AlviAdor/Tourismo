package Homepage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Articles.*;
import LoginClass.*;

public class Homepage extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,backgroundImg;
		JTextField t1,t2;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12; 
			
		Login id;
		
	public Homepage()
	{
		super(" Home ");
		this.setSize(815,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		//Adding Image Background
        ImageIcon img = new ImageIcon("Bin\\Backg\\007.png");
        backgroundImg = new JLabel("", img,JLabel.CENTER);
        backgroundImg.setBounds(0,0,815,620);
		backgroundImg.setBackground(Color.pink);
        this.add(backgroundImg);
		
		
		l1 = new JLabel("Learn about your Future Travel Destination", JLabel.CENTER);
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.white);
		l1.setBounds(60,50,610,30);
		backgroundImg.add(l1);
		
		
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
	
		ImageIcon b3Img = new ImageIcon("bin\\Temp\\home.png");
        b3 = new JButton(b3Img);
        b3.setFont(new  Font("serif",Font.BOLD,30));
        b3.setBorderPainted(false);
        b3.setFocusable(false);
        b3.setBounds(5,5,53,53);
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3.setIcon(new ImageIcon("bin\\Temp\\home2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3.setIcon(new ImageIcon("bin\\Temp\\home.png"));
            }
        });
        b3.addActionListener(this);
        backgroundImg.add(b3);
				
		
		
		ImageIcon b5Img = new ImageIcon("bin\\Temp\\bali.png");
        b5 = new JButton(b5Img);
        b5.setFont(new  Font("serif",Font.BOLD,30));
        b5.setBorderPainted(false);
        b5.setFocusable(false);
        b5.setBounds(20,140,180,120);
        b5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b5.setIcon(new ImageIcon("bin\\Temp\\bali2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b5.setIcon(new ImageIcon("bin\\Temp\\bali.png"));
            }
        });
        b5.addActionListener(this);
        backgroundImg.add(b5);
		
		ImageIcon b6Img = new ImageIcon("bin\\Temp\\paris.png");
        b6 = new JButton(b6Img);
        b6.setFont(new  Font("serif",Font.BOLD,30));
        b6.setBorderPainted(false);
        b6.setFocusable(false);
        b6.setBounds(215,140,180,120);
        b6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b6.setIcon(new ImageIcon("bin\\Temp\\paris2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b6.setIcon(new ImageIcon("bin\\Temp\\paris.png"));
            }
        });
        b6.addActionListener(this);
        backgroundImg.add(b6);
		
		/*b6 = new JButton("Article 2");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		b6.setForeground(Color.gray);
		b6.setBackground(Color.black);
		b6.setBounds(215,140,175,200);
		b6.addActionListener(this);
		backgroundImg.add(b6);*/
		
		ImageIcon b7Img = new ImageIcon("bin\\Temp\\rio.png");
        b7 = new JButton(b7Img);
        b7.setFont(new  Font("serif",Font.BOLD,30));
        b7.setBorderPainted(false);
        b7.setFocusable(false);
        b7.setBounds(410,140,180,120);
        b7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b7.setIcon(new ImageIcon("bin\\Temp\\rio2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b7.setIcon(new ImageIcon("bin\\Temp\\rio.png"));
            }
        });
        b7.addActionListener(this);
        backgroundImg.add(b7);
		
		
		ImageIcon b8Img = new ImageIcon("bin\\Temp\\venice.png");
        b8 = new JButton(b8Img);
        b8.setFont(new  Font("serif",Font.BOLD,30));
        b8.setBorderPainted(false);
        b8.setFocusable(false);
        b8.setBounds(605,140,180,120);
        b8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b8.setIcon(new ImageIcon("bin\\Temp\\venice2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b8.setIcon(new ImageIcon("bin\\Temp\\venice.png"));
            }
        });
        b8.addActionListener(this);
        backgroundImg.add(b8);	
		
		
		ImageIcon b9Img = new ImageIcon("bin\\Temp\\lofoten.png");
        b9 = new JButton(b9Img);
        b9.setFont(new  Font("serif",Font.BOLD,30));
        b9.setBorderPainted(false);
        b9.setFocusable(false);
        b9.setBounds(20,360,180,120);
        b9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b9.setIcon(new ImageIcon("bin\\Temp\\lofoten2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b9.setIcon(new ImageIcon("bin\\Temp\\lofoten.png"));
            }
        });
        b9.addActionListener(this);
        backgroundImg.add(b9);
		
		
		ImageIcon b10Img = new ImageIcon("bin\\Temp\\cappadocia.png");
        b10 = new JButton(b10Img);
        b10.setFont(new  Font("serif",Font.BOLD,30));
        b10.setBorderPainted(false);
        b10.setFocusable(false);
        b10.setBounds(215,360,180,120);
        b10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b10.setIcon(new ImageIcon("bin\\Temp\\cappadocia2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b10.setIcon(new ImageIcon("bin\\Temp\\cappadocia.png"));
            }
        });
        b10.addActionListener(this);
        backgroundImg.add(b10);
		
		
		ImageIcon b11Img = new ImageIcon("bin\\Temp\\santoroni.png");
        b11 = new JButton(b11Img);
        b11.setFont(new  Font("serif",Font.BOLD,30));
        b11.setBorderPainted(false);
        b11.setFocusable(false);
        b11.setBounds(410,360,180,120);
        b11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b11.setIcon(new ImageIcon("bin\\Temp\\santoroni2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b11.setIcon(new ImageIcon("bin\\Temp\\santoroni.png"));
            }
        });
        b11.addActionListener(this);
        backgroundImg.add(b11);
		
		ImageIcon b12Img = new ImageIcon("bin\\Temp\\sikkim.png");
        b12 = new JButton(b12Img);
        b12.setFont(new  Font("serif",Font.BOLD,30));
        b12.setBorderPainted(false);
        b12.setFocusable(false);
        b12.setBounds(605,360,180,120);
        b12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b12.setIcon(new ImageIcon("bin\\Temp\\sikkim2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b12.setIcon(new ImageIcon("bin\\Temp\\sikkim.png"));
            }
        });
        b12.addActionListener(this);
        backgroundImg.add(b12);

	    
		/*l4 = new JLabel();
		l4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		l4.setForeground(Color.white);
		l4.setBounds(180,300,150,20);
		backgroundImg.add(l4);*/
				
        
	}

		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b3)
			{
				Homepage h = new Homepage();
				this.setVisible(false);
				h.setVisible(true);
			}
			else if(ae.getSource()==b5)
			{
				Article1 f = new Article1();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b6)
			{
				Article2 f = new Article2();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b7)
			{
				Article3 f = new Article3();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b8)
			{
				Article4 f = new Article4();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b9)
			{
				Article5 f = new Article5();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b10)
			{
				Article6 f = new Article6();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b11)
			{
				Article7 f = new Article7();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b12)
			{
				Article8 f = new Article8();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				Login lo = new Login();
				this.setVisible(false);
				lo.setVisible(true);
			}
		}


}














