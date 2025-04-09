package rock_paper_scissors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartWindow extends JFrame {

    private JLabel label;
    private JLabel message;
    private JTextField nameField;
    private JButton startButton;
    private Game game;

    public StartWindow(Game game) {
        this.game = game;

        setTitle("LOGIN");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel();
        message = new JLabel(" ");
        northPanel.add(message);
        add(northPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        label = new JLabel("Username: ");
        centerPanel.add(label);
        nameField = new JTextField(10);
        centerPanel.add(nameField);
        add(centerPanel, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        startButton = new JButton("Start");
        southPanel.add(startButton);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = nameField.getText();
                if(username.length() == 0) {
                    message.setText("Please enter a username");
                }
                else {
                    game.setName(nameField.getText());
                }
            }
        });
        add(southPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
