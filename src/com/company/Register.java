package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Register {
    public void bookCourses(Student student) {
        List<String> courses = new ArrayList<>();
        courses.add("Math");
        courses.add("Science");
        courses.add("English");
        courses.add("History");
        courses.add("PE");
        courses.add("Language");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fName = scanner.next();
        student.setFirstName(fName);
        System.out.println("Enter your last name: ");
        String lName = scanner.next();
        student.setLastName(lName);
        System.out.println("Enter the integer value of your grade level: ");
        int gLevel = scanner.nextInt();
        student.setGradeLevel(gLevel);
        IDGenerator idGenerator = new IDGenerator();
        idGenerator.generateID(student);
        System.out.println("COURSE ENROLLMENT\n1. Six\n2. Seven\n3. Eight");
        System.out.println("How many courses do you want to enroll in?: ");
        String numberOfClasses =  scanner.next();
        if (numberOfClasses.equalsIgnoreCase("six") || numberOfClasses.equals("6")) {
            List<String> chosenCourses6 = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                System.out.println(courses);
                System.out.println("Enter the name of the course you want to enroll for: ");
                String courseChoice = scanner.next();
                if (Collections.frequency(chosenCourses6, courseChoice) > 1) {
                    System.out.println("ERROR: COURSE ALREADY CHOSEN\nPlease repeat course selection process");
                    System.exit(0);
                }
                else {
                    if (courses.contains(courseChoice)) {
                        chosenCourses6.add(courseChoice);
                        student.setTuitionBalance(student.getTuitionBalance() + 600);
                        System.out.println("Course added!");
                    }
                    else {
                        System.out.println("Invalid course choice entered.");
                        System.exit(0);
                    }
                }
            }
            System.out.println("Course Selection Process Complete");
            System.out.println("Your current tuition balance is: $" + student.getTuitionBalance());
            System.out.println("Enter an amount to pay");
            int payment = scanner.nextInt();
            int originalBalance = student.getTuitionBalance();
            student.setTuitionBalance(student.getTuitionBalance() - payment);
            if (student.getTuitionBalance() == 0) {
                System.out.println("All fees paid");
                student.setTuitionBalance(0);
            }
            else if (student.getTuitionBalance() > 0) {
                System.out.println("Your remaining balance is: $" +  student.getTuitionBalance());
            }
            else if (student.getTuitionBalance() < 0) {
                System.out.println("You have been refunded: $" + (payment - originalBalance));
                System.out.println("All fees paid");
                student.setTuitionBalance(0);
            }
            System.out.println("STUDENT STATUS:");
            System.out.println("Full Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Student ID: " + student.getId());
            System.out.println("Enrolled Courses: " + chosenCourses6);
            System.out.println("Current Balance: " + student.getTuitionBalance());
            System.out.println("\nRegistration Complete!");
        }

    }
}
