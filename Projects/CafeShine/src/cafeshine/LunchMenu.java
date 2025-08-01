package cafeshine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;

public class LunchMenu extends JFrame {
    JCheckBox[] itemChecks;
    JLabel[] itemLabels;
    JLabel[] priceLabels;

    String[] itemNames = {
        "Chicken Biryani", "Veg Biryani", "Chicken Karahi", 
        "Daal Chawal", "Roti", "Paratha", 
        "Mineral Water", "Pepsi", "7up", "Sting"
    };

    int[] itemPrices = {
        250, 200, 400,
        150, 15, 25,
        50, 60, 60, 70
    };

    public LunchMenu() {
        setTitle("CafeShine - Lunch Menu");
        setSize(950, 700);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255, 248, 224));

        JLabel title = new JLabel("🍛 CafeShine - Lunch Menu");
        title.setFont(new Font("Georgia", Font.BOLD, 26));
        title.setBounds(260, 20, 500, 40);
        title.setForeground(new Color(80, 50, 20));
        add(title);

        // Navigation Buttons
        JButton breakfastBtn = new JButton("← Breakfast");
        breakfastBtn.setBounds(20, 20, 120, 30);
        add(breakfastBtn);

        JButton dinnerBtn = new JButton("→ Dinner");
        dinnerBtn.setBounds(20, 60, 120, 30);
        add(dinnerBtn);

        JButton backBtn = new JButton("← Back");
        backBtn.setBounds(20, 100, 120, 30);
        add(backBtn);

        itemChecks = new JCheckBox[itemNames.length];
        itemLabels = new JLabel[itemNames.length];
        priceLabels = new JLabel[itemNames.length];

        int x = 150;
        int y = 80;

        for (int i = 0; i < itemNames.length; i++) {
            itemLabels[i] = new JLabel(itemNames[i]);
            itemLabels[i].setBounds(x, y, 150, 25);
            itemLabels[i].setFont(new Font("Arial", Font.BOLD, 14));
            add(itemLabels[i]);

            priceLabels[i] = new JLabel("Rs. " + itemPrices[i]);
            priceLabels[i].setBounds(x, y + 20, 100, 25);
            priceLabels[i].setForeground(new Color(120, 60, 20));
            add(priceLabels[i]);

            itemChecks[i] = new JCheckBox("Select");
            itemChecks[i].setBounds(x, y + 45, 100, 25);
            add(itemChecks[i]);

            y += 100;
            if ((i + 1) % 2 == 0) {
                y = 80;
                x += 250;
            }
        }

        JButton billButton = new JButton("Generate Bill");
        billButton.setBounds(320, 430, 200, 40);
        billButton.setFont(new Font("Arial", Font.BOLD, 16));
        billButton.setBackground(new Color(34, 139, 34));
        billButton.setForeground(Color.WHITE);
        add(billButton);

        JTextArea billArea = new JTextArea();
        billArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scroll = new JScrollPane(billArea);
        scroll.setBounds(180, 490, 520, 140);
        add(scroll);

        JButton printButton = new JButton("🖨️ Print Receipt");
        printButton.setBounds(540, 430, 160, 40);
        printButton.setFont(new Font("Arial", Font.BOLD, 14));
        printButton.setBackground(new Color(70, 130, 180));
        printButton.setForeground(Color.WHITE);
        add(printButton);

        billButton.addActionListener(e -> {
            StringBuilder bill = new StringBuilder();
            int total = 0;

            bill.append("         CafeShine Cafeteria\n");
            bill.append("   Managed by Noor Mustafa Rajpar\n");
            bill.append("     Contact: +923166837760\n");
            bill.append("====================================\n");
            bill.append(String.format("%-20s %s\n", "Item", "Price"));
            bill.append("------------------------------------\n");

            for (int i = 0; i < itemNames.length; i++) {
                if (itemChecks[i].isSelected()) {
                    bill.append(String.format("%-20s Rs. %-4d\n", itemNames[i], itemPrices[i]));
                    total += itemPrices[i];
                }
            }

            bill.append("------------------------------------\n");
            bill.append(String.format("Total Amount:         Rs. %d\n", total));
            bill.append("====================================\n");
            bill.append("  Enjoy your lunch, stay happy! 🥘\n");

            billArea.setText(bill.toString());
        });

        printButton.addActionListener(e -> {
            try {
                billArea.print();
            } catch (PrinterException ex) {
                JOptionPane.showMessageDialog(null, "Printing failed: " + ex.getMessage());
            }
        });

        // Navigation Actions
        breakfastBtn.addActionListener(e -> {
            dispose();
            new BreakfastMenu();
        });

        dinnerBtn.addActionListener(e -> {
            dispose();
            new DinnerMenu();
        });

        backBtn.addActionListener(e -> {
            dispose();
            new WelcomeScreen();
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
