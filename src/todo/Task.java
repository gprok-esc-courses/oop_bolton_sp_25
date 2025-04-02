package todo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Task {
    private int id;
    private String name;
    private boolean completed;

    public Task(int id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }

    public void complete() {
        completed = true;
        DBConnection db = new DBConnection();
        Connection conn = db.getConnection();
        if(conn != null) {
            try {
                Statement st = conn.createStatement();
                String query = "UPDATE tasks SET completed=true WHERE id=" + id;
            }
            catch(SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void display() {
        if(!completed) {
            System.out.println(id + " " + name);
        }
    }
}
