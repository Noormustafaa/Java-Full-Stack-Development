
import javax.swing.*;
import java.awt.*;
public class pr1{

public static void main (String args[]){

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(150,150,800,800);

    frame.setTitle("JFRAME_PROGRAM");
    ImageIcon icon = new ImageIcon("p1.jpg");
    frame.setIconImage(icon.getImage());


   Container c= frame.getContentPane();
    c.setLayout(null);
    JLabel l1 = new JLabel("UserName");
    
    l1.setBounds(150,50,300,100);
    Font fn = new Font("Arial",Font.ITALIC,30);
    l1.setFont(fn);
    c.add(l1);


    ImageIcon icon1 = new ImageIcon("p1.jpg");
    JLabel l2 = new JLabel(icon1);
    // l2.setBounds(150,100,300,100);
     l2.setBounds(250,200,icon1.getIconWidth(),icon1.getIconHeight());
    
    c.add(l2);

//    frame.setResizable(false);



    JLabel l3 = new JLabel("UserName1",icon1,JLabel.LEFT);
    
    l1.setBounds(150,50,300,100);
    Font fn = new Font("Arial",Font.ITALIC,30);
    l1.setFont(fn);
    c.add(l3);


    frame.setVisible(true);

}

}