package repository;

public class EnrollmentRepository {

    public void enrollStudent(
            int studentId,
            int courseId
    ) {

        System.out.println(
                "Student " +
                studentId +
                " enrolled to course " +
                courseId
        );
    }
}
