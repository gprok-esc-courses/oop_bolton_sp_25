package todo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Project {
    private int id;
    private String title;
    private ArrayList<Task> tasks;

    public Project(int id, String title) {
        this.id = id;
        this.title = title;
        this.tasks = new ArrayList<>();
        loadTasks();
    }

    public void loadTasks() {
        DBConnection db = new DBConnection();
        Connection con = db.getConnection();

        // Connection con = DBConnection.getConnection();

        if (con != null) {
            String query = "SELECT * FROM tasks WHERE project_id=" + id;
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    Task task = new Task(rs.getInt(1),
                            rs.getString(2),
                            rs.getBoolean(3));
                    tasks.add(task);
                }
            }
            catch(SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void display() {
        System.out.println("===============");
        System.out.println(title);
        for (Task task : tasks) {
            task.display();
        }
    }
}
