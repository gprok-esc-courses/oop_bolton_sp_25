package swing_intro;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JListDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JListDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 600);

        ArrayList<String> data = new ArrayList<String>();
        data.add("Athens");
        data.add("Rome");
        data.add("Paris");
        data.add("London");
        data.add("Prague");

        JList<String> list = new JList(data.toArray());

        frame.add(list, BorderLayout.CENTER);


        frame.setVisible(true);
    }
}
