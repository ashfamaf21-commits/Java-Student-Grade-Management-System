import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n=== Student Grade Management ===");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Show Highest Average");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == 1) {

                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Biology mark: ");
                double biology = scanner.nextDouble();

                System.out.print("Enter Chemistry mark: ");
                double chemistry = scanner.nextDouble();

                System.out.print("Enter IT mark: ");
                double it = scanner.nextDouble();

                scanner.nextLine();

                Student student =
                        new Student(
                                name,
                                biology,
                                chemistry,
                                it
                        );

                students.add(student);

                System.out.println(
                        "Student added successfully."
                );


            } else if (choice == 2) {

                if (students.isEmpty()) {

                    System.out.println(
                            "No students available."
                    );

                } else {

                    System.out.println(
                            "\n--- Student Results ---"
                    );

                    for (Student student : students) {

                        student.displayStudent();
                    }
                }


            } else if (choice == 3) {

                System.out.print(
                        "Enter student name: "
                );

                String searchName =
                        scanner.nextLine();

                boolean found = false;

                for (Student student : students) {

                    if (student.name.equalsIgnoreCase(
                            searchName)) {

                        student.displayStudent();

                        found = true;

                        break;
                    }
                }

                if (!found) {

                    System.out.println(
                            "Student not found."
                    );
                }


            } else if (choice == 4) {

                if (students.isEmpty()) {

                    System.out.println(
                            "No students available."
                    );

                } else {

                    Student highestStudent =
                            students.get(0);

                    for (Student student : students) {

                        if (student.calculateAverage()
                                >
                                highestStudent
                                        .calculateAverage()) {

                            highestStudent = student;
                        }
                    }

                    System.out.println(
                            "\nStudent with Highest Average:"
                    );

                    highestStudent.displayStudent();
                }


            } else if (choice == 5) {

                System.out.println(
                        "Program closed."
                );


            } else {

                System.out.println(
                        "Invalid choice."
                );
            }

        } while (choice != 5);

        scanner.close();
    }
}