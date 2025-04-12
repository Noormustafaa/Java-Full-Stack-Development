import javax.swing.*;
import java.awt.*;
public class t1f{

public static void main (String args[]){

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(150,150,800,800);

    frame.setTitle("JFRAME_PROGRAM");
    ImageIcon icon = new ImageIcon("p1.jpg");
    frame.setIconImage(icon.getImage());


   Container c= frame.getContentPane();
    c.setLayout(null);

    JTextField f1 = new JTextField();
    f1.setBounds(100,150,100,30);
    c.add(f1);
    f1.setText("Enter");
    f1.setEditable(false);

	frame.setVisible(true);
}
}