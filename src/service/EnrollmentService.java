package service;

import repository.EnrollmentRepository;

public class EnrollmentService {

    private EnrollmentRepository repository =
            new EnrollmentRepository();

    public void enroll(
            int studentId,
            int courseId
    ) {

        repository.enrollStudent(
                studentId,
                courseId
        );

    }
}