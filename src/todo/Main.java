package todo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        ProjectList projectList = new ProjectList();

        do {
            System.out.println("--- MENU ----");
            System.out.println("1. Add Project");
            System.out.println("2. Add Task");
            System.out.println("3. View All");
            System.out.println("4. Complete Task");
            System.out.println("0. Exit");
            System.out.println("Choose: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clean the buffer

            switch (choice) {
                case 1:
                    System.out.print("Project Title: ");
                    String title = scanner.nextLine();
                    projectList.addProject(title);
                    break;
                case 2:
                    System.out.print("Task Name: ");
                    String name =  scanner.nextLine();
                    System.out.print("Project ID: ");
                    int pid = scanner.nextInt();
                    projectList.addTask(name, pid);
                    break;
                case 3:
                    projectList.display();
                    break;
                case 4:
                    System.out.print("Task ID: ");
                    int tid = scanner.nextInt();
                    projectList.completeTask(tid);
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
            }

        } while(choice != 0);
    }
}
