package todo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProjectList {
    private ArrayList<Project> projects;

    public ProjectList() {
        projects = new ArrayList<>();
        loadProjects();
    }

    public void loadProjects() {
        DBConnection db = new DBConnection();
        Connection con = db.getConnection();
        if (con != null) {
            String query = "SELECT * FROM projects";
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    Project project = new Project(rs.getInt(1),
                            rs.getString(2));
                    projects.add(project);
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void addProject(String name) {
        DBConnection db = new DBConnection();
        Connection con = db.getConnection();
        if (con != null) {
            String query = "INSERT INTO projects (title) VALUES ('" + name + "')";
            try {
                Statement stmt = con.createStatement();
                stmt.executeUpdate(query);

                projects = new ArrayList<>();
                loadProjects();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void addTask(String name, int pid) {
        DBConnection db = new DBConnection();
        Connection con = db.getConnection();
        if (con != null) {
            String query = "INSERT INTO tasks (name, completed, project_id) VALUES ('" + name + "', false, " + pid + ")";
            try {
                Statement st = con.createStatement();
                st.executeUpdate(query);

                projects = new ArrayList<>();
                loadProjects();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void completeTask(int tid) {
        DBConnection db = new DBConnection();
        Connection con = db.getConnection();
        if (con != null) {
            String query = "UPDATE tasks SET completed = true WHERE id = " + tid;
            try {
                Statement stmt = con.createStatement();
                stmt.executeUpdate(query);

                projects = new ArrayList<>();
                loadProjects();
            }
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public void display() {
        for(Project project : projects) {
            project.display();
        }
    }
}
