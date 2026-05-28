package repository;

import model.Student;
import java.util.ArrayList;

public class StudentRepository {

    private ArrayList<Student> students = new ArrayList<>();
    private int nextId = 1;

    public void addStudent(Student student) {
        if (student.getName().isEmpty() || student.getEmail().isEmpty()) {
            System.out.println("Name and email cannot be empty");
            return;
        }

        if (student.getAge() <= 0) {
            System.out.println("Age must be positive");
            return;
        }

        student.setId(nextId);
        nextId++;
        students.add(student);
        System.out.println("Student added");
    }

    public void getAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }

        System.out.println("\n=== Students list ===");

        for (Student student : students) {
            System.out.println("----------------------");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Email: " + student.getEmail());
        }

        System.out.println("----------------------");
        System.out.println("Total students: " + students.size());
    }

    public void findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("\nStudent found:");
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Email: " + student.getEmail());
                return;
            }
        }

        System.out.println("Student not found");
    }

    public void updateStudent(int id, String name, int age, String email) {
        if (name.isEmpty() || email.isEmpty()) {
            System.out.println("Name and email cannot be empty");
            return;
        }

        if (age <= 0) {
            System.out.println("Age must be positive");
            return;
        }

        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setEmail(email);
                System.out.println("Student updated");
                return;
            }
        }

        System.out.println("Student not found");
    }

    public void deleteStudent(int id) {
        boolean removed = students.removeIf(student -> student.getId() == id);

        if (removed) {
            System.out.println("Student deleted");
        } else {
            System.out.println("Student not found");
        }
    }
}