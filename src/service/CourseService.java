package service;

import model.Course;
import repository.CourseRepository;

public class CourseService {

    private CourseRepository repository =
            new CourseRepository();

    public void createCourse(String title, String teacher) {
        Course course = new Course(0, title, teacher);
        repository.addCourse(course);
    }

    public void showCourses() {
        repository.getAllCourses();
    }

    public void editCourse(int id, String title, String teacher) {
        repository.updateCourse(id, title, teacher);
    }

    public void removeCourse(int id) {
        repository.deleteCourse(id);
    }
}
