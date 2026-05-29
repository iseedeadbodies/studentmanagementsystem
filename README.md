# Student Management System

Console Java application with OOP, CRUD operations and PostgreSQL database.

## Project Description

This project is a console-based student management system developed in Java.

The application allows:

* adding students
* viewing students
* searching students by ID
* updating students
* deleting students
* adding courses
* viewing courses
* updating courses
* deleting courses
* enrolling students into courses

The project uses OOP principles, layered architecture and PostgreSQL database connection through JDBC.

---

# Technologies

* Java
* PostgreSQL
* JDBC
* OOP
* CRUD
* VS Code
* GitHub

---

# Project Structure

src/

## model

Contains entity classes:

* Student
* Course
* Enrollment

## repository

Contains CRUD operations and SQL queries.

Examples:

* INSERT
* SELECT
* UPDATE
* DELETE

## service

Contains business logic and connects Main with Repository.

## db

Contains database connection class:

* DBConnection.java

## main

Contains console menu and application entry point.

---

# OOP Principles Used

## Encapsulation

All fields are private and accessed through getters/setters.

## Classes and Objects

Separate classes are used for students, courses and enrollments.

## Separation of Responsibilities

* model → data
* repository → database logic
* service → business logic
* main → console interface

---

# Database

The project uses PostgreSQL database.

Database name:
student_db

Tables:

* students
* courses
* enrollments

---

# SQL Tables

## students

* id
* name
* age
* email

## courses

* id
* title
* teacher

## enrollments

* id
* student_id
* course_id

---

# CRUD Operations

## Students

* Create student
* Read students
* Update student
* Delete student

## Courses

* Create course
* Read courses
* Update course
* Delete course

---

# Menu Functions

1. Add student
2. Show students
3. Find student by ID
4. Update student
5. Delete student
6. Add course
7. Show courses
8. Update course
9. Delete course
10. Enroll student
11. Exit

---

# Features

* Console interface
* PostgreSQL database connection
* JDBC support
* Full CRUD functionality
* Error handling with try/catch
* Search by ID
* Validation
* Layered architecture
* Persistent data storage

---

# How to Run

Compile:

```bash
javac -cp "lib/postgresql-42.7.7.jar" -d out src/db/*.java src/model/*.java src/repository/*.java src/service/*.java src/main/*.java
```

Run:

```bash
java -cp "out;lib/postgresql-42.7.7.jar" main.Main
```

---

# Author

Beknazar
