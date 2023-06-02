
package cab.booking.system;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class ViewInterCityBookedCab extends JFrame {
    private JPanel contentPane;
    Choice c1;
    
     public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                        ViewInterCityBookedCab frame = new ViewInterCityBookedCab("");
                        frame.setVisible(true);
                        
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
     public ViewInterCityBookedCab(String username) {
         setBounds(450,220,1050,600);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/intracabdetails.jpg"));
        Image i3=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i3);
        JLabel la1 = new JLabel(i2);
        la1.setBounds(500,100,300,300);
        add(la1);
        
         JLabel lblName = new JLabel("VIew Booked Cab Details");
        lblName.setFont(new Font("Yu Mincho",Font.PLAIN,20));
        lblName.setBounds(118,11,300,53);
        contentPane.add(lblName);
        
        JLabel lb3 = new JLabel("Customer Name :");
        lb3.setBounds(35,70,200,14);
        contentPane.add(lb3);
        
        JLabel l1 = new JLabel();
        l1.setBounds(35,70,200,14);
        contentPane.add(l1);
        
        JLabel lblId = new JLabel("DRiver Name ");
        lblId.setBounds(35,110,200,14);
        contentPane.add(lblId);
        
        JLabel l2 = new JLabel();
        l2.setBounds(35,110,200,14);
        contentPane.add(l2);
        
         JLabel lb2 = new JLabel("Source : ");
        lb2.setBounds(35,110,200,14);
        contentPane.add(lb2);
        
        JLabel l3 = new JLabel();
        l3.setBounds(35,110,200,14);
        contentPane.add(l3);
        
        JLabel lblName_1 = new JLabel("Destination ");
        lblName_1.setBounds(35,110,200,14);
        contentPane.add(lblName_1);
        
        JLabel l4 = new JLabel();
        l4.setBounds(35,110,200,14);
        contentPane.add(l4);
        
        JLabel lblGender = new JLabel("Gender: ");
        lblGender.setBounds(35,110,200,14);
        contentPane.add(lblGender);
        
        JLabel l5 = new JLabel();
        l5.setBounds(35,110,200,14);
        contentPane.add(l5);
        
        JLabel lblCountry = new JLabel("Id ");
        lblCountry.setBounds(35,110,200,14);
        contentPane.add(lblCountry);
        
        JLabel l6 = new JLabel();
        l6.setBounds(35,110,200,14);
        contentPane.add(l6);
        
        JLabel lblReserveRoomNumber = new JLabel("Phone");
        lblReserveRoomNumber.setBounds(35,110,200,14);
        contentPane.add(lblReserveRoomNumber);
        
        JLabel l7 = new JLabel();
        l7.setBounds(35,110,200,14);
        contentPane.add(l7);
        
        JLabel lblCheckInStatus = new JLabel("Address ");
        lblCheckInStatus.setBounds(35,110,200,14);
        contentPane.add(lblCheckInStatus);
        
        JLabel l8 = new JLabel();
        l8.setBounds(35,110,200,14);
        contentPane.add(l8);
        
        JLabel lblDeposite = new JLabel("Price ");
        lblDeposite.setBounds(35,110,200,14);
        contentPane.add(lblDeposite);
        
        JLabel l9 = new JLabel();
        l9.setBounds(35,110,200,14);
        contentPane.add(l9);
        
        JLabel la2 = new JLabel("Arriving In");
        la2.setBounds(35,110,200,14);
        contentPane.add(la2);
        
        JLabel l10 = new JLabel();
        l10.setBounds(35,110,200,14);
        contentPane.add(l10);
        
        JLabel la3 = new JLabel("reference number ");
        la3.setBounds(35,110,200,14);
        contentPane.add(la3);
        
        JLabel l11 = new JLabel();
        l11.setBounds(35,110,200,14);
        contentPane.add(l11);
        
        Conn c = new Conn();
        try{
            
            ResultSet rs=c.s.executeQuery("select * from intercab where '"+username+"' ");
            while(rs.next()) {
                l2.setText(rs.getString("driver"));
                l3.setText(rs.getString("source"));
                l4.setText(rs.getString("destination"));
                l5.setText(rs.getString("car"));
                l6.setText(rs.getString("type"));
                l9.setText(rs.getString("price"));
                l11.setText(rs.getString("ref"));
            }
            rs=c.s.executeQuery("select * from customer '"+username+"' ");
            while(rs.next()) {
                l1.setText(rs.getString("name"));
                l7.setText(rs.getString("phone"));
                l8.setText(rs.getString("address"));
            }
            Random r = new Random();
            l10.setText(Math.abs((r.nextInt() % 10))+ "mins");
            
            rs.close();
        }catch(SQLException e) {}
        
        JButton btnExit=new JButton("Back");
btnExit.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ev) {
        setVisible(false);
    }
});

btnExit.setBounds(260,430,120,30);
btnExit.setBackground(Color.black);
btnExit.setForeground(Color.white);
contentPane.add(btnExit);

getContentPane().setBackground(Color.white);
        
     }
    
}
