
package cab.booking.system;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckBill extends JFrame {
    public static void main(String[] args) {
        new CheckBill("").setVisible(true);
    }
    
    CheckBill(String username) {
        setBounds(550,220,900,600);
        setVisible(true);
        String price1="0";
        String price2="0";
        String price3="0";
        
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from intercab where + '"+username+"'");
            while(rs.next()){
                price1 = rs.getString("price");
            }
            rs=c.s.executeQuery("select * from intracab where ='"+username+"'");
            while(rs.next()) {
                price2 = rs.getString("price");
            }
            String name="";
            rs=c.s.executeQuery("select * from customer where ='"+username+"'");
            while(rs.next()) {
                name=rs.getString("name");
            }
            rs = c.s.executeQuery("select * from intransport where ='"+username+"'");
            while(rs.next()) {
                price3 = rs.getString("price");
            }
        }catch(Exception e) {}
        
        String[] package1=new String[]{"Package1.png","INTERCITY CAB BILL",price1};
        String[] package2=new String[] {"Package2.png","INTRACITY CAB BILL",price2};
        String[] package3=new String[] {"Package3.png","Transport CAB BILL",price3};
        
        JTabbedPane tabbedPane=new JTabbedPane();
        JPanel p1=createPackage(package1);
        tabbedPane.addTab("Intercity Cab", null,p1);
        
        JPanel p2=createPackage(package2);
        tabbedPane.addTab("Intracity Cab", null,p2);
        
        JPanel p3=createPackage(package3);
        tabbedPane.addTab("TRansport", null,p3);
        
        add(tabbedPane,BorderLayout.CENTER);
        
    }
    public JPanel createPackage(String[] pack) {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/"+pack[0]));
        Image i3=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(500,100,300,300);
        add(l1);
        
        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Yu Mincho",Font.PLAIN,20));
        lblName.setBounds(118,11,300,53);
        p1.add(lblName);
        
        JLabel l3 = new JLabel("Transpo Cab :");
        l3.setBounds(35,70,200,14);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Yu Mincho",Font.PLAIN,30));
        p1.add(l3);
        
        JLabel lblID = new JLabel("Total BIL :");
        lblID.setBounds(35,70,200,14);
        lblID.setForeground(Color.RED);
        lblID.setFont(new Font("Yu Mincho",Font.PLAIN,30));
        p1.add(lblID);
        
        JLabel l2 = new JLabel(pack[2]);
        l2.setBounds(35,70,200,14);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Yu Mincho",Font.PLAIN,30));
        p1.add(l2);
        
        JLabel la1 = new JLabel("Today we make cabbing easy everywhere :");
        la1.setBounds(35,70,200,14);
        la1.setForeground(Color.RED);
        la1.setFont(new Font("Yu Mincho",Font.PLAIN,30));
        p1.add(la1);
        
        return p1;
        
        
    }
}
