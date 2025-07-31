package com.mycompany.print_program1;

public class Student {
    private String name;
    private String rollno;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Email: " + email);
    }
}
