/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.print_program1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author A.J Compute's
 */
// we have to download some jar files for Applications Context 
public class Main {

    
    public static void main(String[] args) {
    
   ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     Student std = (Student) context.getBean("stdId");
    std.display();

    }

    
}
