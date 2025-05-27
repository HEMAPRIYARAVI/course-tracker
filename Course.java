package courseapp;

public class Course {
    private String courseName;
    private String instructor;
    private boolean isCompleted;

    // Constructor
    public Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.isCompleted = false; // default
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "[ " + courseName + " | Instructor: " + instructor +
                " | Status: " + (isCompleted ? "Completed" : "Ongoing") + " ]";
    }
}

