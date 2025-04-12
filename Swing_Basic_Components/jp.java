import javax.swing.*;
import java.awt.*;
public class jp{

public static void main (String args[]){

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(150,150,800,800);

    frame.setTitle("JFRAME_PROGRAM");
    ImageIcon icon = new ImageIcon("p1.jpg");
    frame.setIconImage(icon.getImage());


   Container c= frame.getContentPane();
    c.setLayout(null);
    
    JPasswordField f = new JPasswordField();
    f.setBounds(100, 150,100,25);
    f.setText("Noor@@!!@");
    f.setEchoChar('*');
    c.add(f);
   f.setEchoChar((char)0);
   
    frame.setVisible(true);

}}