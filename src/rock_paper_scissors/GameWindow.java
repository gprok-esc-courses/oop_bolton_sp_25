package rock_paper_scissors;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private JLabel scoreLabel;
    private JButton rockBtn;
    private JButton scissorsBtn;
    private JButton paperBtn;
    private JLabel statusLabel;
    private Game game;

    public GameWindow(Game game) {
        this.game = game;

        setTitle("Rock Paper Scissors");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel();
        scoreLabel = new JLabel("Score: User 0 - Computer 0");
        northPanel.add(scoreLabel);
        add(northPanel, BorderLayout.NORTH);

        JPanel southPanel = new JPanel();
        statusLabel = new JLabel(" ");
        southPanel.add(statusLabel);
        add(southPanel, BorderLayout.SOUTH);

        JPanel centerPanel = new JPanel();
        rockBtn = new JButton("R");
        rockBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(0);
            }
        });
        scissorsBtn = new JButton("S");
        scissorsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(1);
            }
        });
        paperBtn = new JButton("P");
        paperBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.play(2);
            }
        });
        centerPanel.add(rockBtn);
        centerPanel.add(scissorsBtn);
        centerPanel.add(paperBtn);
        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void setScore(String score) {
        scoreLabel.setText(score);
    }

    public void setStatus(String status) {
        statusLabel.setText(status);
    }

    public void winnerFound() {
        rockBtn.setEnabled(false);
        scissorsBtn.setEnabled(false);
        paperBtn.setEnabled(false);
    }
}
