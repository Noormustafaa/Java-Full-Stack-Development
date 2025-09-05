/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg120_programs_in_java;

/**
 *
 * @author Noor Mustafa Rajpar
 */
public class reverseAString {
    public static void main(String[] args) {
        
        //Using String Concentination operator
        String str="ABCD";
        String rev="";
        
        int length=str.length();
//        System.out.println(length-1);
        
        for (int i=length-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        
        
        //char val = str.charAt(1);
        
        //System.out.println(val);
                
        
    }

    
}
