package swing_intro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeWindow {
    public static void main(String[] args) {
        JFrame window = new JFrame("Welcome");

        JPanel northPanel = new JPanel();
        JTextField nameField = new JTextField(15);
        northPanel.add(nameField);
        window.add(northPanel, BorderLayout.NORTH);


        JPanel southPanel = new JPanel();
        JLabel msgLabel = new JLabel("Welcome Stranger");
        southPanel.add(msgLabel);
        window.add(southPanel, BorderLayout.SOUTH);

        JButton clickMeBtn = new JButton("Click me");

        JPanel centerPanel = new JPanel();
        centerPanel.add(clickMeBtn);
        window.add(centerPanel, BorderLayout.CENTER);
        clickMeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                msgLabel.setText("Welcome " + name);
            }
        });



        window.setSize(500, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
