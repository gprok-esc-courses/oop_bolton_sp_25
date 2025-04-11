package swing_intro;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MobilePhoneLikeKeyboard {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("MobilePhoneLikeKeyboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        String [] letters = {"a", "b", "c", "d", "e",
                "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v",
                "w", "x", "y", "z"};

        for (int i = 0; i < 8; i++) {
            Button b = new Button(letters[i]);
            panel1.add(b);
        }
        panel.add(panel1);
        for (int i = 8; i < 16; i++) {
            JButton b = new JButton(letters[i]);
            panel2.add(b);
        }
        panel.add(panel2);
        for (int i = 16; i < 24; i++) {
            JButton b = new JButton(letters[i]);
            panel3.add(b);
        }
        panel.add(panel3);
        for (int i = 24; i < 26; i++) {
            JButton b = new JButton(letters[i]);
            panel4.add(b);
        }
        panel.add(panel4);

        frame.add(panel);
        frame.setVisible(true);

    }
}
