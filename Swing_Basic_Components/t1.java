import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import javax.swing.JFrame;
public class t1 {

    
public static void main (String args [])
 {
   
        JFrame frame = new JFrame();
        
        frame.setBounds(200,300,900,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MyJFrame");   

       Container c=frame.getContentPane();
       c.setLayout(null);



       JTextField  j1= new JTextField(); 
       j1.setBounds(100,50,100,20);
       c.add(j1);

       j1.setText("Enter");
       j1.setForeground(Color.GREEN);




  frame.setVisible(true);
}}