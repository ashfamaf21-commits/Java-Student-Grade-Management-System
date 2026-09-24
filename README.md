# Java Student Grade Management System

## Overview

This is a simple console-based Student Grade Management System developed using Java.

The program allows users to add students, enter marks for different subjects, calculate averages, assign grades, search for students, and identify the student with the highest average.

The project was created to demonstrate beginner-to-intermediate Java programming concepts in a simple and practical way.

## Features

- Add student details
- Enter Biology, Chemistry, and IT marks
- Calculate the average mark
- Assign a grade automatically
- View all students
- Search for a student by name
- Find the student with the highest average
- Exit the program

## Java Concepts Used

This project demonstrates:

- Classes and objects
- Constructors
- Methods
- ArrayList
- Scanner
- Loops
- If/else statements
- String comparison
- Basic calculations
- Searching through data
- Menu-driven programming

## Project Structure

Java-Student-Grade-Management/
└── src/
    ├── Student.java
    └── Main.java

## Student Class

The Student.java file stores student information including:

- Student name
- Biology mark
- Chemistry mark
- IT mark

It also contains methods to:

- Calculate the average mark
- Calculate the grade
- Display student information

## Main Program

The Main.java file contains the main menu and controls the program.

The available options are:

1. Add Student
2. View Students
3. Search Student
4. Show Highest Average
5. Exit

## Grade Calculation

Grades are assigned according to the average mark:

75 or above = A
65 - 74 = B
55 - 64 = C
40 - 54 = S
Below 40 = F

## Example

Example student input:

Name: Ashfa
Biology: 78
Chemistry: 69
IT: 82

Example output:

Name: Ashfa | Average: 76.33 | Grade: A

## How to Run

Compile the files:

javac Student.java Main.java

Run the program:

java Main

## Tools Used

- Java
- VS Code
- Java Development Kit (JDK)

## Purpose

This project was developed to practice and demonstrate core Java programming skills, including object-oriented programming, collections, searching, and simple data analysis.

## Future Improvements

Possible future improvements include:

- Adding more subjects
- Updating student marks
- Deleting student records
- Saving student data to a file
- Adding input validation
- Sorting students by average mark

## Author

Developed as a beginner-to-intermediate Java portfolio project.
