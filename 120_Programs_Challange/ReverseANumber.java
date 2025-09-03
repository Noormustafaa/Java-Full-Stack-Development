/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg120_programs_in_java;
import java.util.Scanner;
/**
 *
 * @author Noor Mustafa Rajpar
 */

public class ReverseANumber {
    
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc1.nextInt();
        
        int rev = 0;
        while(num!=0){
            
            rev=rev*10+num%10;
            
            System.out.println("Reverse value is "+rev);
            
            System.out.println("Num is "+num);
            
            num=num/10;
            
            System.out.println("Value oF num is now ? "+num);
            

        }
        System.out.println("Reverse of  number is "+rev);
    }
    
    
}
