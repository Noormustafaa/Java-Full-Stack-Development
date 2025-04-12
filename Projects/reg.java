import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class reg  {

    public static void main (String args[])
    {

        JFrame frame = new JFrame();
        frame.setTitle(" Registration_Form ");
        frame.setBounds(120,100,1000,700);
       

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c= frame.getContentPane();
        c.setLayout(null);




    JLabel lname = new JLabel();
    lname.setText("Name"); 
    lname.setBounds(100,70,100,30);
    lname.setVisible(true);
    c.add(lname); 

    
    JLabel lmobile = new JLabel();
    lmobile.setText("Mobile"); 
    lmobile.setBounds(100,120,100,30);
    lmobile.setVisible(true);
    c.add(lmobile); 



    JTextField namef = new JTextField();
    namef.setVisible(true);
    namef.setBounds(190,70,100,27);
    c.add(namef); 

    JTextField mnumber = new JTextField();
    mnumber.setVisible(true);
    mnumber.setBounds(190,120,100,27);
    c.add(mnumber); 


    JLabel gender = new JLabel();
    gender.setText("Gender");
    gender.setBounds(100,160,100,30);
    c.add(gender);

    JRadioButton male = new JRadioButton("Male");
    male.setBounds(190,160,100,30);
    male.setSelected(true);
    c.add(male);



    JRadioButton female = new JRadioButton("Female");
    female.setBounds(290,160,120,30);

    c.add(female);

    JLabel DOB = new JLabel("DOB");
    DOB.setBounds(100,200,100,30);
    c.add(DOB);

    ButtonGroup grp = new ButtonGroup();
    grp.add(male);
    grp.add(female);


String Days[]={"1","2","3","4","5"};
String Months[]={"Jan","Feb","March","April"};
String Year[]={"2001","2002","2003","2004","2005"};    

JComboBox cdays = new JComboBox(Days);
JComboBox cmonths = new JComboBox(Months);
JComboBox cyears = new JComboBox(Year);


cdays.setBounds(190,200,100,28);
cmonths.setBounds(310,200,100,28);
cyears.setBounds(430,200,100,28);

c.add(cdays);
c.add(cmonths);
c.add(cyears);



JLabel adressl = new JLabel("Adress");
adressl.setBounds(100,240,100,30);
adressl.setVisible(true);
c.add(adressl);


JTextArea adress_tf = new JTextArea();
adress_tf.setBounds(190,240,280,80); 
c.add(adress_tf);


    JCheckBox terms = new JCheckBox("Accept terms and Conditions");
    terms.setBounds(250,350,230,25);
    c.add(terms);

    
    JTextArea Result = new JTextArea();
    Result.setBounds(545,120,400,400);
    c.add(Result);

JLabel msg = new JLabel();
msg.setBounds(190,390,290,25);
c.add(msg);


   JButton sbt = new JButton("Submit");
    sbt.setVisible(true);
    sbt.setBounds(290,470,90,35);
    c.add(sbt);


sbt.addActionListener(new ActionListener(){

    public void actionPerformed(ActionEvent e){

        if(terms.isSelected())
        {
            msg.setText("Registration_Succesfully");

            String name = namef.getText();
            String mobile=mnumber.getText();

            String gender ="Male";
            if(female.isSelected())
            {
                gender="Female";

            }
            String dob=cdays.getSelectedItem()+"-"+cmonths.getSelectedItem()+"-"+cyears.getSelectedItem();
            String Adress = adress_tf.getText();

            Result.setText(" Name : "+name+"\n"+" Mobile_NO : "+mobile+"\n"+" Gender : "+gender+"\n"+" Date_OF_Birth : "+dob+"\n"+" Adress : "+Adress);

        } 
        else{

            msg.setText("Accept Terms And Conditions to submit ");
            Result.setText("");
        }



    }

    });

     frame.setVisible(true);



    }





}