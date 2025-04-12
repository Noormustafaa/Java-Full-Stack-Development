import javax.swing.*;
import java.awt.*;
public class Jbutton{

public static void main (String args[]){

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(150,150,800,800);

    frame.setTitle("JFRAME_PROGRAM");
    ImageIcon icon = new ImageIcon("p1.jpg");
    frame.setIconImage(icon.getImage());


   Container c= frame.getContentPane();
    c.setLayout(null);
    
   JButton btn = new JButton(icon);
   
   btn.setBounds(150,100,icon.getIconWidth(),icon.getIconHeight());
   c.add(btn);

   Font fn = new Font("Arial",Font.ITALIC,25);
    btn.setFont(fn);

    btn.setText("MyButon");

    btn.setForeground(Color.red);

    // Cursor cur = new Cursor(Cursor.HAND_CURSOR);
    Cursor cur = new Cursor(Cursor.CROSSHAIR_CURSOR);

    // Cursor cur = new Cursor(Cursor.WAIT_CURSOR);
   
    // Add Image in the JButton.

    btn.setCursor(cur);

    frame.setVisible(true);

}}