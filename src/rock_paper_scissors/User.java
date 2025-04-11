package rock_paper_scissors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    private int id;
    private String name;
    private int score;

    public User(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Return the user's id or if user not
    // found create a user and return the new id
    public int getIdFromDB(String username) {
        Connection con = DBConnection.getConnection();
        if (con != null) {
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM users " +
                        "WHERE name = '" + username + "'");
                if(rs.next()) {
                    return rs.getInt("id");
                }
                else {
                    stmt.executeUpdate("INSERT INTO users (name) VALUES ('" + username + "')");
                    rs = stmt.executeQuery("SELECT * FROM users " +
                            "WHERE name = '" + username + "'");
                    return rs.getInt("id");
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
                return -1;
            }
        }
        else {
            return -1;
        }
    }
}
