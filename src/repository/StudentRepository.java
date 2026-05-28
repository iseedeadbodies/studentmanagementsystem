package repository;

import db.DBConnection;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentRepository {

    public void addStudent(Student student) {
        String sql = "INSERT INTO students(name, age, email) VALUES (?, ?, ?)";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getEmail());

            ps.executeUpdate();
            System.out.println("Student added to database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllStudents() {
        String sql = "SELECT * FROM students";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("----------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Email: " + rs.getString("email"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findStudentById(int id) {
        String sql = "SELECT * FROM students WHERE id=?";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("----------------------");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Email: " + rs.getString("email"));
            } else {
                System.out.println("Student not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int id, String name, int age, String email) {
        String sql = "UPDATE students SET name=?, age=?, email=? WHERE id=?";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, email);
            ps.setInt(4, id);

            ps.executeUpdate();
            System.out.println("Student updated in database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id=?";

        try {
            Connection connection = DBConnection.connect();
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Student deleted from database");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}