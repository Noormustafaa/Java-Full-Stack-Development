/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_swing_journey;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

//Note:This Is the Simple Program of Timer_Object

public class Timer_Object {
   int counter =0;
   
    public Timer_Object(){
        
        Timer timer = new Timer(1000,new ActionListener(){
           @Override 
            public void actionPerformed(ActionEvent e) {
                counter++; 
                System.out.println("Seconds passed: " + counter); // Print it
            }
            
        });  
        
        timer.start();
          JOptionPane.showMessageDialog(null, "Timer is running...\nClose this to stop.");
    }
    
    
    public static void main(String[] args) {
     new   Timer_Object(); 
    }
 
}
