import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
 

class cal{

public static void main (String args[]){


Font fn = new Font("ARIAL",Font.BOLD,28);

JFrame frame = new JFrame();
frame.setTitle("SimPle_CalCulator"); 

frame.setBounds(120,100,500,500);
Container c = frame.getContentPane();
c.setLayout(null);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


JLabel firstnum = new JLabel();
firstnum.setText("EnterFirstNumber");
firstnum.setBounds(100,120,100,28);
firstnum.setVisible(true);
c.add(firstnum);

JLabel secondnum = new JLabel();
secondnum.setText("EnterSecondNumber");
secondnum.setBounds(100,160,120,38);
secondnum.setVisible(true);
c.add(secondnum);



JTextField firstfield = new JTextField();

firstfield.setBounds(250,120,100,30);
firstfield.setVisible(true);

c.add(firstfield);

JTextField secondfield = new JTextField();
secondfield.setBounds(250,160,100,30);
secondfield.setVisible(true);

c.add(secondfield);



JButton add = new JButton();
add.setText("+");
add.setBounds(140,230,80,40);
add.setVisible(true);
c.add(add);

JButton sub = new JButton();
sub.setText("-");
sub.setBounds(230,230,80,40);
sub.setVisible(true);
c.add(sub);

JButton mult = new JButton();
mult.setText("*");
mult.setBounds(140,300,80,40);
mult.setVisible(true);
c.add(mult);

JButton division = new JButton();
division.setText("/");
division.setBounds(230,300,80,40);
division.setVisible(true);
c.add(division);


JLabel result = new JLabel();
result.setText("0");
result.setVisible(true);
result.setBounds(280,350,170,30);
result.setFont(fn);

c.add(result);



add.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent e){

int a=  Integer.parseInt(firstfield.getText());

int b=Integer.parseInt(secondfield.getText());
int c= a+b;

result.setText("Result : "+c);


}




});


sub.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent e){

int a=  Integer.parseInt(firstfield.getText());

int b=Integer.parseInt(secondfield.getText());
int c= a-b;

result.setText("Result : "+c);


}




});
mult.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent e){

int a=  Integer.parseInt(firstfield.getText());

int b=Integer.parseInt(secondfield.getText());
int c= a*b;

result.setText("Result : "+c);


}




});
division.addActionListener(new ActionListener(){


public void actionPerformed(ActionEvent e){

int a=  Integer.parseInt(firstfield.getText());

int b=Integer.parseInt(secondfield.getText());
int c= a/b;

result.setText("Result : "+c);


}




});



frame.setVisible(true);

}}