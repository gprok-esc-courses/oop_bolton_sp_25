package swing_intro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageOnLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Image On Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        ImageIcon image = new ImageIcon("images/cat.jpg");
        JLabel label = new JLabel();
        label.setIcon(image);

        JButton button = new JButton("Click Me");
        button.setIcon(image);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageIcon image = new ImageIcon("images/dog.jpg");
                label.setIcon(image);
            }
        });



        frame.add(label, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
