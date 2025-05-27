package courseapp;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    // Add a new course
    public void addCourse(String name, String instructor) {
        courses.add(new Course(name, instructor));
        System.out.println("✅ Course added successfully!");
    }

    // List all courses
    public void listCourses() {
        if (courses.isEmpty()) {
            System.out.println("⚠️ No courses available.");
            return;
        }
        System.out.println("📚 All Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + ". " + courses.get(i));
        }
    }

    // Mark a course as completed
    public void markCompleted(int index) {
        if (index < 0 || index >= courses.size()) {
            System.out.println("❌ Invalid course number.");
            return;
        }

        System.out.print("⏳ Marking course as completed");
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(500); // 0.5 sec delay
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            System.out.println("\n⚠️ Interrupted while processing.");
        }

        courses.get(index).markCompleted();
        System.out.println("\n✅ Course marked as completed!");
    }


    // Delete a course
    public void deleteCourse(int index) {
        if (index < 0 || index >= courses.size()) {
            System.out.println("❌ Invalid course number.");
            return;
        }
        courses.remove(index);
        System.out.println("🗑️ Course deleted.");
    }
}

