package repository;

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnrollmentRepository {

    public void enrollStudent(int studentId, int courseId) {
        String sql = "INSERT INTO enrollments(student_id, course_id) VALUES (?, ?)";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, studentId);
            ps.setInt(2, courseId);

            ps.executeUpdate();

            System.out.println("Student enrolled to course in database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
