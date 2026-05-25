package repository;

import model.Student;
import java.util.ArrayList;

public class StudentRepository {

    private ArrayList<Student> students = new ArrayList<>();
    private int nextId = 1;

    public void addStudent(Student student) {
        student.setId(nextId);
        nextId++;
        students.add(student);
        System.out.println("Student added");
    }

    public void getAllStudents() {
        for (Student student : students) {
            System.out.println(
                    student.getId() + " | " +
                    student.getName() + " | " +
                    student.getAge() + " | " +
                    student.getEmail()
            );
        }
    }

    public void updateStudent(int id, String name, int age, String email) {
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
        students.removeIf(student -> student.getId() == id);
        System.out.println("Student deleted");
    }
}