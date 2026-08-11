package WelcomePage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import LoginClass.*;
import Registration.*;

public class Welcome extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
    JLabel backgroundImg;
	
	
	public Welcome()
	{
		super(" Welcome ");
		this.setSize(815,620);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		
		//Adding Image Background
        ImageIcon img = new ImageIcon("Bin\\Backg\\008.png");
        backgroundImg = new JLabel("", img,JLabel.CENTER);
        backgroundImg.setBounds(0,0,815,620);
		backgroundImg.setBackground(Color.pink);
        this.add(backgroundImg);
		
		ImageIcon b1Img = new ImageIcon("bin\\Temp\\login.png");
        b1 = new JButton(b1Img);
        b1.setFont(new  Font("serif",Font.BOLD,30));
        b1.setBorderPainted(false);
        b1.setFocusable(false);
        b1.setBounds(375,375,65,64);
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1.setIcon(new ImageIcon("bin\\Temp\\login2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1.setIcon(new ImageIcon("bin\\Temp\\login.png"));
            }
        });
        b1.addActionListener(this);
        backgroundImg.add(b1);
		
		ImageIcon b2Img = new ImageIcon("bin\\Temp\\register.png");
        b2 = new JButton(b2Img);
        b2.setFont(new  Font("serif",Font.BOLD,30));
        b2.setBorderPainted(false);
        b2.setFocusable(false);
        b2.setBounds(321,450,173,58);
        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2.setIcon(new ImageIcon("bin\\Temp\\register2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2.setIcon(new ImageIcon("bin\\Temp\\register.png"));
            }
        });
        b2.addActionListener(this);
        backgroundImg.add(b2);
		
		ImageIcon b3Img = new ImageIcon("bin\\Temp\\Exit.png");
        b3 = new JButton(b3Img);
        b3.setFont(new  Font("serif",Font.BOLD,30));
        b3.setBorderPainted(false);
        b3.setFocusable(false);
        b3.setBounds(748,531,38,43);
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3.setIcon(new ImageIcon("bin\\Temp\\Exit2.png"));
            }
        
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3.setIcon(new ImageIcon("bin\\Temp\\Exit.png"));
            }
        });
        b3.addActionListener(this);
        backgroundImg.add(b3);
		
	}
	
	
	public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            this.setVisible(false);
            Login lo = new Login();
            lo.setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
            this.setVisible(false);
            Registration r = new Registration();
            r.setVisible(true);
        }
        else if(ae.getSource()==b3)
        {
            System.exit(0);
        }
    }
}