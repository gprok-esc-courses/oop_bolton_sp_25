package swing_intro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessGame {
    public static int secret;

    public static void main(String[] args) {
        Random rand = new Random();

        secret = rand.nextInt(1, 100);

        JFrame window = new JFrame();

        // North: Field to read user's guess
        JPanel northPanel = new JPanel();
        JLabel guessLabel = new JLabel("GUESS: ");
        northPanel.add(guessLabel);
        JTextField guessField = new JTextField(8);
        northPanel.add(guessField);
        window.add(northPanel, BorderLayout.NORTH);

        // South: Feedback message
        JPanel southPanel = new JPanel();
        JLabel feedbackLabel = new JLabel("");
        southPanel.add(feedbackLabel);
        window.add(southPanel, BorderLayout.SOUTH);

        // Center: Button to check guess
        JPanel centerPanel = new JPanel();
        JButton guessButton = new JButton("Check");
        centerPanel.add(guessButton);
        JButton playAgainButton = new JButton("Play Again");
        playAgainButton.setEnabled(false);
        centerPanel.add(playAgainButton);
        window.add(centerPanel, BorderLayout.CENTER);

        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guessButton.setEnabled(true);
                secret = rand.nextInt(1, 100);
                playAgainButton.setEnabled(false);
            }
        });

        // Add functionality to the button
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String guessStr = guessField.getText();
                int guess = Integer.parseInt(guessStr);
                if(guess == secret) {
                    feedbackLabel.setText("FOUND!");
                    guessButton.setEnabled(false);
                    playAgainButton.setEnabled(true);
                }
                else if(guess > secret) {
                    feedbackLabel.setText("Go Down");
                }
                else {
                    feedbackLabel.setText("Go Up");
                }
            }
        });

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Guess Game");
        window.setSize(300, 200);
        window.setVisible(true);
    }
}
