
package cab.booking.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;



public class About extends JFrame implements ActionListener {
    
    JButton b1;
    JLabel l1;
    Font f,f1,f2;
    TextArea t1;
    String s;
    
    public About() {
        setLayout(null);
        JButton b1=new JButton("Exit");
        add(b1);
        b1.setBounds(180,430,120,20);
        b1.addActionListener(this);
        
        Font f= new Font("RALEWAY",Font.BOLD,180);
        setFont(f);
        
        s="                         ABout Project \n        "
                + "\nOnline Cab Booking System specializing in Hiring cabs to "
                + "customers. It is an online system through which customers "
                +"can view available cabd;register  the cabs,view profile and  "
                +"book cabs\n\n";
        TextArea t1=new TextArea(s,10,40,Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,450,300);
        
        add(t1);
        
        Font f1=new Font("RALEWAY",Font.BOLD,16);
        t1.setFont(f1);
        
        Container contentPane=this.getContentPane();
        t1=new TextArea();
        
        JLabel l1=new JLabel("ABout project");
        add(l1);
        l1.setBounds(170,10,180,80);
        l1.setForeground(Color.red);
        
        Font f2=new Font("RALEWAY",Font.BOLD,20);
        l1.setFont(f2);
        
        setBounds(700,220,500,550);
        
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
