package repository;

import db.DBConnection;
import model.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CourseRepository {

    public void addCourse(Course course) {
        String sql = "INSERT INTO courses(title, teacher) VALUES (?, ?)";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, course.getTitle());
            ps.setString(2, course.getTeacher());

            ps.executeUpdate();
            System.out.println("Course added to database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllCourses() {
        String sql = "SELECT * FROM courses";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("----------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Title: " + rs.getString("title"));
                System.out.println("Teacher: " + rs.getString("teacher"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateCourse(int id, String title, String teacher) {
        String sql = "UPDATE courses SET title=?, teacher=? WHERE id=?";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, title);
            ps.setString(2, teacher);
            ps.setInt(3, id);

            ps.executeUpdate();
            System.out.println("Course updated in database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCourse(int id) {
        String sql = "DELETE FROM courses WHERE id=?";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Course deleted from database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}