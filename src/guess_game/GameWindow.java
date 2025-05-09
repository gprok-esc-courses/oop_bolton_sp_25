package guess_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class GameWindow extends JFrame {

    private String user;
    private int guesses;
    private int secret;
    private int uid;
    private JLabel messageLabel;
    private JTextField guessTextField;

    private JButton guessButton;
    private JButton playAgainButton;

    public GameWindow(String user, int uid) {
        this.user = user;
        this.uid = uid;
        guesses = 0;
        Random rand = new Random();
        secret = rand.nextInt(100);
        setTitle("Guess Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));

        JLabel userLabel = new JLabel("USER: " + user);
        panel.add(userLabel);

        guessTextField = new JTextField(5);
        panel.add(guessTextField);

        JButton guessButton = new JButton("Guess");
        panel.add(guessButton);
        guessButton.addActionListener(e -> {
            guesses++;
            int guess =  Integer.parseInt(guessTextField.getText());
            if (guess == secret) {
                messageLabel.setText("You found it!");
                // Save in the DB
                Connection con = DBConnection.getConnection();
                String query = "INSERT INTO games (user_id, guesses) VALUES (?, ?)";
                try {
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setInt(1, uid);
                    ps.setInt(2, guesses);
                    ps.executeUpdate();

                    guessButton.setEnabled(false);
                    guessTextField.setEnabled(false);
                    playAgainButton.setEnabled(true);

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            else if (guess > secret) {
                messageLabel.setText("Greater than secret");
            }
            else {
                messageLabel.setText("Less than secret");
            }
        });

        playAgainButton = new JButton("Play Again");
        panel.add(playAgainButton);
        playAgainButton.addActionListener(e -> {
            secret = rand.nextInt(100);
            guessButton.setEnabled(true);
            guessTextField.setEnabled(true);
            playAgainButton.setEnabled(false);
        });

        messageLabel = new JLabel("-");
        add(panel, BorderLayout.CENTER);
        add(messageLabel, BorderLayout.SOUTH);

    }
}
