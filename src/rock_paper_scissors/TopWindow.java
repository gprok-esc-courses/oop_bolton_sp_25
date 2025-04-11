package rock_paper_scissors;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TopWindow extends JFrame {
    public TopWindow() {
        setTitle("Top Scores");
        setSize(200, 400);

        ArrayList<String> topScores = new ArrayList<>();

        Connection con = DBConnection.getConnection();
        if (con != null) {
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT user_id, COUNT(*) as wins FROM scores " +
                        "WHERE user_score=10 " +
                        "GROUP BY user_id " +
                        "ORDER BY wins DESC " +
                        "LIMIT 3 ");
                while (rs.next()) {
                    topScores.add(rs.getInt(1) + " (" + rs.getInt(2) + ")");
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        JList<String> topList = new JList(topScores.toArray());

        add(topList, BorderLayout.CENTER);

        setVisible(true);
    }
}
