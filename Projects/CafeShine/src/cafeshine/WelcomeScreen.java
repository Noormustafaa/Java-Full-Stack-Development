package cafeshine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomeScreen extends JFrame {

    public WelcomeScreen() {
        setTitle("CafeShine - Welcome");
        setSize(600, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#FFF8E7")); // Light background

        // Title
        JLabel title = new JLabel("☕ Welcome to CafeShine ☕");
        title.setBounds(70, 80, 500, 50);
        title.setFont(new Font("Georgia", Font.BOLD, 30));
        title.setForeground(new Color(80, 50, 20));
        add(title);

        // Buttons
        JButton breakfastBtn = new JButton("Breakfast Menu");
        JButton lunchBtn = new JButton("Lunch Menu");
        JButton dinnerBtn = new JButton("Dinner Menu");

        breakfastBtn.setBounds(200, 160, 180, 40);
        lunchBtn.setBounds(200, 210, 180, 40);
        dinnerBtn.setBounds(200, 260, 180, 40);

        Font btnFont = new Font("Arial", Font.BOLD, 16);
        breakfastBtn.setFont(btnFont);
        lunchBtn.setFont(btnFont);
        dinnerBtn.setFont(btnFont);

        breakfastBtn.setBackground(new Color(139, 69, 19));
        lunchBtn.setBackground(new Color(139, 69, 19));
        dinnerBtn.setBackground(new Color(139, 69, 19));

        breakfastBtn.setForeground(Color.WHITE);
        lunchBtn.setForeground(Color.WHITE);
        dinnerBtn.setForeground(Color.WHITE);

        add(breakfastBtn);
        add(lunchBtn);
        add(dinnerBtn);

        // Actions
        breakfastBtn.addActionListener(e -> {
            dispose();
            new BreakfastMenu();  // Step 2: Class already bana chuke ho
        });

        lunchBtn.addActionListener(e -> {
            dispose();
            new LunchMenu();      // Step 3: Isay abhi banayenge
        });

        dinnerBtn.addActionListener(e -> {
            dispose();
            new DinnerMenu();     // Step 4: Ye bhi baad mein banayenge
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WelcomeScreen();
    }
}
