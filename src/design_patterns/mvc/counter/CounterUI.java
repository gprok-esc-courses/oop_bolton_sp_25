package design_patterns.mvc.counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterUI extends JFrame {

    private JLabel counterLabel;
    private JButton increaseBtn;
    private JButton decreaseBtn;

    private CounterController controller;

    public CounterUI() {
        this.controller = new CounterController();

        setTitle("Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);

        JPanel labelPanel = new JPanel();
        counterLabel = new JLabel(controller.getCounterValue());
        labelPanel.add(counterLabel);
        add(labelPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        increaseBtn = new JButton("+");
        buttonPanel.add(increaseBtn);
        increaseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.increaseCounter();
                counterLabel.setText(controller.getCounterValue());
            }
        });

        decreaseBtn = new JButton("-");
        buttonPanel.add(decreaseBtn);
        decreaseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.decreaseCounter();
                counterLabel.setText(controller.getCounterValue());
            }
        });
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Just for testing
    public static void main(String[] args) {
        CounterUI ui = new CounterUI();
    }
}
