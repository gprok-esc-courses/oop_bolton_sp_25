package guess_game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginWindow extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel messageLabel;
    private JButton loginButton;

    private String user;

    public LoginWindow() {
        setTitle("Guess Game Login");
        setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);

        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        loginButton = new JButton("Login");
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());
                Connection con = DBConnection.getConnection();
                try {
                    String query = "SELECT * FROM users WHERE username=? AND password=?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, username);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        user = rs.getString("username");
                        int uid = rs.getInt("id");
                        GameWindow gameWindow = new GameWindow(user, uid);
                        gameWindow.setVisible(true);
                        dispose();
                    }
                    else {
                        user = null;
                        messageLabel.setText("Invalid Username or Password");
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });



        add(panel, BorderLayout.CENTER);

        messageLabel = new JLabel("-");
        add(messageLabel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
