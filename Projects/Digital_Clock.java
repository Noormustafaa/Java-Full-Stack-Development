/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_swing_journey;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Note: this is the Simple Project of Digital Clock Using GUI

public class Digital_Clock {

    JFrame frame;
    JLabel timeLabel;
    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    Timer timer;

    public Digital_Clock() {

        frame = new JFrame("Auto_Start_Calculator... ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);

        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 48));
        timeLabel.setForeground(Color.RED);
        frame.add(timeLabel);

        startCounting(); // Start the clock automatically when the program runs

        frame.setVisible(true);

    }

    public void startCounting() {

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code runs every second
                seconds++;
                if (seconds > 59) {
                    seconds = 0;
                    minutes++;
                    if (minutes > 59) {
                        minutes = 0;
                        hours++;
                        if (hours > 23) {
                            hours = 0;
                        }
                    }
                }
                String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                timeLabel.setText(timeString);
            }

        });

        timer.start();

    }

    public static void main(String[] args) {
        Digital_Clock obj = new Digital_Clock();
    }

}
