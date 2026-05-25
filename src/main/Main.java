package main;

import service.StudentService;
import service.CourseService;
import service.EnrollmentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentService studentService =
                new StudentService();

        CourseService courseService =
                new CourseService();

        EnrollmentService enrollmentService =
                new EnrollmentService();

        while (true) {

            System.out.println("\n=== MENU ===");
            System.out.println("1. Add student");
            System.out.println("2. Show students");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("5. Show courses");
            System.out.println("6. Enroll student");
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

                System.out.print("ID: ");
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

            else if (choice == 4) {

                System.out.print("ID: ");
                int id = scanner.nextInt();

                studentService.removeStudent(id);

            }

            else if (choice == 5) {

                courseService.showCourses();

            }

            else if (choice == 6) {

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
        }
    }
}