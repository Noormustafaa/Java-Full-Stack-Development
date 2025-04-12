import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
class login {

public static void main (String [] args){

JFrame frame = new JFrame();
frame.setTitle("LoginForm");

frame.setBounds(100,120,600,600);


ImageIcon icon = new ImageIcon("p1.jpg");
   
frame.setIconImage(icon.getImage());


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


Container c = frame.getContentPane();
c.setBackground(Color.RED);
c.setLayout(null);

Font fn = new Font("ARIAL",Font.BOLD,30);

JLabel name = new JLabel();
name.setText("UserName");
name.setBounds(140,100,170,30);
name.setFont(fn);
c.add(name);



JLabel password = new JLabel();
password.setText("Password");
password.setBounds(140,160,160,30);
password.setFont(fn);
c.add(password);



JTextField utext= new JTextField();
utext.setBounds(350,100,130,27);
utext.setVisible(true);
c.add(utext);

JPasswordField jpf= new JPasswordField();
jpf.setBounds(350,160,130,27);
jpf.setVisible(true);
c.add(jpf);



JButton btn = new JButton("Login");
btn.setVisible(true);
btn.setBounds(180,210,120,30);
btn.setFont(fn);

 c.add(btn);



btn.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent e){

System.out.println("Login_SuccessFUlly");

}


});



frame.setVisible(true);
}

}
