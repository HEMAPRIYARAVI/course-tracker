package courseapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("🎓 Welcome to Smart Course Tracker!");

        while (running) {
            System.out.println("\n📋 Menu:");
            System.out.println("1. Add new course");
            System.out.println("2. View all courses");
            System.out.println("3. Mark course as completed");
            System.out.println("4. Delete a course");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter course name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter instructor name: ");
                    String instructor = scanner.nextLine();
                    manager.addCourse(name, instructor);
                    break;
                case "2":
                    manager.listCourses();
                    break;
                case "3":
                    manager.listCourses();
                    System.out.print("Enter course number to mark as completed: ");
                    try {
                        int compIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        manager.markCompleted(compIndex);
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Please enter a valid number.");
                    }
                    break;

                case "4":
                    manager.listCourses();
                    System.out.print("Enter course number to delete: ");
                    try {
                        int delIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        manager.deleteCourse(delIndex);
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Please enter a valid number.");
                    }
                    break;

                case "5":
                    running = false;
                    System.out.println("👋 Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
