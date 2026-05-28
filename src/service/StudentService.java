package service;

import model.Student;
import repository.StudentRepository;

public class StudentService {

    private StudentRepository repository = new StudentRepository();

    public void createStudent(String name, int age, String email) {
        Student student = new Student(0, name, age, email);
        repository.addStudent(student);
    }

    public void showStudents() {
        repository.getAllStudents();
    }

    public void findStudent(int id) {
        repository.findStudentById(id);
    }

    public void editStudent(int id, String name, int age, String email) {
        repository.updateStudent(id, name, age, email);
    }

    public void removeStudent(int id) {
        repository.deleteStudent(id);
    }
}