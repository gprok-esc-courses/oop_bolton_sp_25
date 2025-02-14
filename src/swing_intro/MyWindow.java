package swing_intro;

import javax.swing.*;
import java.awt.*;

public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My Window");
        frame.setSize(500, 500);

        JButton button = new JButton("Click Me");
        button.setText("Click ON");
        frame.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
