package main;

import service.StudentService;
import service.CourseService;
import service.EnrollmentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();
        
        System.out.println("================================");
        System.out.println(" Student Management System ");
        System.out.println("================================");
        while (true) {

            try {

                System.out.println("\n=== MENU ===");
                System.out.println("1. Add student");
                System.out.println("2. Show students");
                System.out.println("3. Find student by ID");
                System.out.println("4. Update student");
                System.out.println("5. Delete student");
                System.out.println("6. Add course");
                System.out.println("7. Show courses");
                System.out.println("8. Update course");
                System.out.println("9. Delete course");
                System.out.println("10. Enroll student");
                System.out.println("0. Exit");

                System.out.print("Choose: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {

                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    studentService.createStudent(
                            name,
                            age,
                            email
                    );
                }

                else if (choice == 2) {

                    studentService.showStudents();

                }

                else if (choice == 3) {

                    System.out.print("Student ID: ");
                    int id = scanner.nextInt();

                    studentService.findStudent(id);

                }

                else if (choice == 4) {

                    System.out.print("Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("New name: ");
                    String name = scanner.nextLine();

                    System.out.print("New age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("New email: ");
                    String email = scanner.nextLine();

                    studentService.editStudent(
                            id,
                            name,
                            age,
                            email
                    );
                }

                else if (choice == 5) {

                    System.out.print("Student ID: ");
                    int id = scanner.nextInt();

                    studentService.removeStudent(id);

                }

                else if (choice == 6) {

                    System.out.print("Course title: ");
                    String title = scanner.nextLine();

                    System.out.print("Teacher: ");
                    String teacher = scanner.nextLine();

                    courseService.createCourse(title, teacher);

                }

                else if (choice == 7) {

                    courseService.showCourses();

                }

                else if (choice == 8) {

                    System.out.print("Course ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("New title: ");
                    String title = scanner.nextLine();

                    System.out.print("New teacher: ");
                    String teacher = scanner.nextLine();

                    courseService.editCourse(
                            id,
                            title,
                            teacher
                    );
                }

                else if (choice == 9) {

                    System.out.print("Course ID: ");
                    int id = scanner.nextInt();

                    courseService.removeCourse(id);

                }

                else if (choice == 10) {

                    System.out.print("Student ID: ");
                    int studentId = scanner.nextInt();

                    System.out.print("Course ID: ");
                    int courseId = scanner.nextInt();

                    enrollmentService.enroll(
                            studentId,
                            courseId
                    );
                }

                else if (choice == 0) {

                    System.out.println("Program closed");
                    break;

                }

                else {

                    System.out.println("Wrong choice");

                }

            } catch (Exception e) {

                System.out.println("Invalid input");
                scanner.nextLine();

            }
        }
    }
}