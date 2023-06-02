
package cab.booking.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class ViewCabs extends JFrame implements Runnable {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19;
    JLabel caption;
    Thread th;
    
    public void run() {
        try {
            
            l2.setVisible(true);
            caption.setText("Maruti SUzuki ");
            l2.add(caption);
            Thread.sleep(2000);
            l2.setVisible(false);
            l3.setVisible(true);
            caption.setText("Toyoto eics ");
            l3.add(caption);
            Thread.sleep(2000);
            l3.setVisible(false);
            l4.setVisible(true);
            caption.setText("Toyoto Fortuner");
            l4.add(caption);
            Thread.sleep(2000);
            l4.setVisible(false);
            l5.setVisible(true);
            caption.setText("Swift ");
            l5.add(caption);
            Thread.sleep(2000);
            l5.setVisible(false);
            l6.setVisible(true);
            caption.setText("Hyundai ");
            l6.add(caption);
            Thread.sleep(2000);
            l6.setVisible(false);
            l7.setVisible(true);
            caption.setText("Auto ");
            l7.add(caption);
            Thread.sleep(2000);
            l7.setVisible(false);
            l8.setVisible(true);
            caption.setText("BMW X1 ");
            l8.add(caption);
            Thread.sleep(2000);
            l8.setVisible(false);
            l9.setVisible(true);
            caption.setText("Bike ");
            l9.add(caption);
            Thread.sleep(2000);
            l9.setVisible(false);
            l10.setVisible(true);
            caption.setText("Tata Ace  ");
            l10.add(caption);
            Thread.sleep(2000);
            l10.setVisible(false);
            l11.setVisible(true);
            caption.setText("DFM Mini Truck ");
            l11.add(caption);
            Thread.sleep(2000);
            l11.setVisible(false);
            
            this.setVisible(false);
            
            
            
                    
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public ViewCabs() {
        
        setBounds(500,220,900,700);
        getContentPane().setBackground(new Color(220,250,250));
        
        th = new Thread(this);
        
        caption = new JLabel();
        caption.setBounds(50,550,1000,70);
        caption.setBackground(Color.magenta);
        caption.setFont(new Font("Tahoma",Font.PLAIN,40));
        add(caption);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/cab1.png"));
        Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0,0,900,700);
        add(l2);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/cab2.png"));
        Image i5=i4.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l3 = new JLabel(i4);
        l3.setBounds(0,0,900,700);
        add(l3);
        l3.setVisible(false);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/cab3.png"));
        Image i8=i7.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i5);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0,0,900,700);
        add(l4);
        l4.setVisible(false);
        
        ImageIcon i10=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/cab4.png"));
        Image i11=i10.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i12=new ImageIcon(i11);
        JLabel l5 = new JLabel(i12);
        l5.setBounds(0,0,900,700);
        add(l5);
        l5.setVisible(false);
        
        ImageIcon i13=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/cab5.png"));
        Image i14=i13.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i15=new ImageIcon(i14);
        JLabel l6 = new JLabel(i15);
        l6.setBounds(0,0,900,700);
        add(l6);
        l6.setVisible(false);
        
        ImageIcon i16=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/cab6.png"));
        Image i17=i16.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i18=new ImageIcon(i17);
        JLabel l7 = new JLabel(i18);
        l7.setBounds(0,0,900,700);
        add(l7);
        l7.setVisible(false);
        
        ImageIcon i19=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/cab7.png"));
        Image i20=i19.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i21=new ImageIcon(i20);
        JLabel l8 = new JLabel(i21);
        l8.setBounds(0,0,900,700);
        add(l6);
        l8.setVisible(false);
        
        ImageIcon i22=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/cab9.png"));
        Image i23=i22.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i24=new ImageIcon(i23);
        JLabel l9 = new JLabel(i24);
        l9.setBounds(0,0,900,700);
        add(l9);
        l9.setVisible(false);
        
        ImageIcon i25=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/truck2.png"));
        Image i26=i25.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i27=new ImageIcon(i26);
        JLabel l10 = new JLabel(i27);
        l10.setBounds(0,0,900,700);
        add(l10);
        l10.setVisible(false);
        
        ImageIcon i28=new ImageIcon(ClassLoader.getSystemResource("cab/booking/system/icons/cab5.png"));
        Image i29=i28.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon i30=new ImageIcon(i29);
        JLabel l11 = new JLabel(i30);
        l11.setBounds(0,0,900,700);
        add(l11);
        l11.setVisible(false);
        
        th.start();
    }
    public static void main(String args[]) {
        new ViewCabs().setVisible(true);
    }
    
}
