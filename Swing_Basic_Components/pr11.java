
import javax.swing.*;
import java.awt.*;
public class pr1{

public static void main (String args[]){

    JFrame frame = new JFrame();
    frame.setVisible(true);
    // frame.setSize(400,400);
    // frame.setLocation(100,150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(150,150,400,400);

    frame.setTitle("JFRAME_PROGRAM");
    ImageIcon icon = new ImageIcon("p1.jpg");
    frame.setIconImage(icon.getImage());


   Container c= frame.getContentPane();
   c.setBackground(Color.RED);


   frame.setResizable(false);

}

}