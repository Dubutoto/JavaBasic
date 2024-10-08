package org.example.day7.useclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DiaryWriting {
    public void diaryWritingUI() {
        JFrame f = new JFrame();
        f.setSize(300, 500);
        Font font = new Font("Times New Roman", Font.PLAIN, 30);

        JLabel x = new JLabel("Date");
        x.setFont(font);
        JLabel y = new JLabel("Title");
        y.setFont(font);
        JLabel z = new JLabel("Contents");
        z.setFont(font);

        JTextField x1 = new JTextField(16);
        JTextField y1 = new JTextField(16);

        JTextArea z1 = new JTextArea(10, 16);
        JScrollPane scrollPane = new JScrollPane(z1);

        JButton b1 = new JButton("Save the Contents");

        // Save action
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String date = x1.getText();
                String title = y1.getText();
                String contents = z1.getText();

                String fileName = date + "_" + title + ".txt";

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                    writer.write("Date: " + date + "\n");
                    writer.write("Title: " + title + "\n");
                    writer.write("Contents:\n" + contents);
                    // JOptionPane.showMessageDialog(f, "Diary saved successfully!");
                    f.setTitle("Diary saved successfully");
                } catch (IOException ioException) {
                    //JOptionPane.showMessageDialog(f, "Error saving diary: " + ioException.getMessage());
                    f.setTitle("Error saving Diary");
                }
            }
        });

        // Layout 설정
        f.setLayout(new FlowLayout());
        f.add(x);
        f.add(x1);
        f.add(y);
        f.add(y1);
        f.add(z);
        f.add(scrollPane);
        f.add(b1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

