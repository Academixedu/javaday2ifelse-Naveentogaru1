package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        int score = scanner.nextInt();
        String grade ;
        scanner.close(); // Close the scanner

        if (score >= 90) {
            grade = "A";
            //System.out.println("A");
        } else if (score >= 80) {
            grade = "B";
           // System.out.println("B");
        } else if (score >= 70) {
            grade = "C";
         //   System.out.println("C");
        } else if (score >= 60) {
            grade = "D";
           // System.out.println("D");
        } else {
            grade ="Fail";
        }

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("score: " + score);
        System.out.println("grade: " + grade);
    }
}
