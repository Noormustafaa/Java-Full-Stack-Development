
import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import javax.swing.JFrame;
public class l1 {

    
public static void main (String args [])
 {
   
        JFrame frame = new JFrame();
        frame.setVisible(true);
//        frame.setSize(500,700);
        frame.setBounds(200,300,900,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MyJFrame");   

       Container c=frame.getContentPane();
       c.setLayout(null);
     
JLabel l1 = new JLabel("UserName");
l1.setBounds(100,50,200,30);
Font fn = new Font("Arial",Font.ITALIC,20);
l1.setFont(fn);
c.add(l1);
     


JLabel l2 = new JLabel();
l2.setText("Password");
l2.setBounds(100,100,200,300);


Font f2 = new Font("Arial",Font.ITALIC,20);
l2.setFont(f2);
c.add(l2);




ImageIcon icon = new ImageIcon("p1.jpg");
JLabel l3 = new JLabel(icon);

l3.setBounds(100,150,icon.getIconWidth(),icon.getIconHeight());


c.add(l3);
 }

}
