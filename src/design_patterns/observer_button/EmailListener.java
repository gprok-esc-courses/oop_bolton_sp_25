package design_patterns.observer_button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Sending email to the name");
    }
}
