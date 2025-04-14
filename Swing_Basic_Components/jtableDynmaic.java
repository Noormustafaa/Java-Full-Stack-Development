
package java_swing_journey;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;


public class jtableDynmaic {
    
    public static void main(String[] args) throws Exception  {
        
        
        String Data [][]={
        
            {"Noor","MAle","21"},
            {"Mustafa","Male","23"},
            {"Musavir","Male","25"}
        
        };
        
        String ColumnsName []={" Name "," Gender "," Age " };
        
        DefaultTableModel tableModel= new DefaultTableModel(Data,ColumnsName);
        JTable table = new JTable(tableModel);
        
        JFrame frame = new JFrame();
        frame.add(table);
        
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
