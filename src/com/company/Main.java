package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String[] ID = {""};
        final String[] content = {""};


        JFrame frame = new JFrame("Input");                 //
        frame.setSize(1280, 720);                   // Open the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //
        frame.setLocationRelativeTo(null);                      //

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JPanel panelID = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel labelID = new JLabel("Enter ID:"); // The input prompts
        labelID.setFont(new Font("SansSerif", Font.BOLD, 16)); // Set font
        panelID.add(labelID);

        JFormattedTextField inputFieldID = new JFormattedTextField(""); // "" Value to specify string input
        inputFieldID.setFont(new Font("SansSerif", Font.BOLD, 16)); // Set font
        inputFieldID.setColumns(10);
        panelID.add(inputFieldID);

        JLabel labelContent = new JLabel("Enter Content:"); // The input prompts
        labelContent.setFont(new Font("SansSerif", Font.BOLD, 16)); // Set font

        JFormattedTextField inputFieldContent = new JFormattedTextField(""); // "" Value to specify string input
        inputFieldContent.setFont(new Font("SansSerif", Font.BOLD, 16)); // Set font
        inputFieldContent.setPreferredSize(new Dimension(300,300));
        inputFieldContent.setAutoscrolls(true);

        Button button = new Button("Submit");
        button.setFont(new Font("SansSerif", Font.BOLD, 16));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedWriter myWriter = new BufferedWriter(new FileWriter("output.txt"));
                    myWriter.write(String.valueOf(inputFieldContent.getText()));
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException e1) {
                    System.out.println("An error occurred.");
                    e1.printStackTrace();
                }
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ID[0] = inputFieldID.getText();
                content[0] = inputFieldContent.getText();
            }
        });

        frame.add(panelID);
        frame.add(labelContent);
        frame.add(inputFieldContent);
        frame.add(button);

        frame.pack();
        frame.setVisible(true);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line=reader.readLine())!=null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

