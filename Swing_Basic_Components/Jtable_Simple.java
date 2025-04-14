
package java_swing_journey;
import javax.swing.*;
import java.awt.*;

//This Is the simple program of the JTable Using Swing Components. 

public class Jtable_Simple {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("JTable_Using_Swing_Component");
        frame.setBounds(80, 60, 500, 500);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = frame.getContentPane();
        
        String []Columns ={
        
            "Name","Age","Gender"
            
            
        };
        String [][]rows ={
        
            {"Noor","23","Male"},
            {"Mubeen","33","Female"}
            
            
        }; 
        
        JTable table = new JTable(rows,Columns);
        frame.add(table);
        frame.setVisible(true);
        
        
        
        
        
        
    }
    
}
