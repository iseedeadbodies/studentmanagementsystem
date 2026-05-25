package service;

import repository.CourseRepository;

public class CourseService {

    private CourseRepository repository =
            new CourseRepository();

    public void showCourses() {

        repository.showCourses();

    }
}
