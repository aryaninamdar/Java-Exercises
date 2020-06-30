package com.company;
import java.util.Random;

public class IDGenerator {
    public void generateID(Student student) {
        Random random = new Random();
        int partOfId = random.nextInt((9999 - 100) + 1) + 10;
        System.out.println(student.getFirstName() + "'s student ID is: " + student.getGradeLevel() + partOfId);
        student.setId(student.getGradeLevel() + partOfId);
    }
}
