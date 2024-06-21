package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        int score = scanner.nextInt();
        int grade = scanner.nextInt();
        scanner.close(); // Close the scanner

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("score: " + score);
        System.out.println("grade: " + grade);
    }
}
