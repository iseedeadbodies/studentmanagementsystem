package repository;

import model.Course;
import java.util.ArrayList;

public class CourseRepository {

    private ArrayList<Course> courses = new ArrayList<>();
    private int nextId = 1;

    public void addCourse(Course course) {
        course.setId(nextId);
        nextId++;
        courses.add(course);
        System.out.println("Course added");
    }

    public void getAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found");
            return;
        }

        for (Course course : courses) {
            System.out.println(
                    course.getId() + " | " +
                    course.getTitle() + " | " +
                    course.getTeacher()
            );
        }
    }

    public void updateCourse(int id, String title, String teacher) {
        for (Course course : courses) {
            if (course.getId() == id) {
                course.setTitle(title);
                course.setTeacher(teacher);
                System.out.println("Course updated");
                return;
            }
        }

        System.out.println("Course not found");
    }

    public void deleteCourse(int id) {
        courses.removeIf(course -> course.getId() == id);
        System.out.println("Course deleted");
    }
}