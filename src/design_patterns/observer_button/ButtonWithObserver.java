package design_patterns.observer_button;

import javax.swing.*;
import java.awt.*;

public class ButtonWithObserver {
    public static void main(String[] args) {
        JFrame window = new JFrame("ButtonWithObserver");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);

        JTextField nameField = new JTextField(10);
        window.add(nameField, BorderLayout.CENTER);

        JButton saveButton = new JButton("Save");
        window.add(saveButton, BorderLayout.SOUTH);
        saveButton.addActionListener(new EmailListener());
        saveButton.addActionListener(new PrintListener());
        saveButton.addActionListener(new LogListener());

        window.setVisible(true);
    }
}
