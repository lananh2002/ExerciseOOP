package Bai8;

import java.util.Arrays;
import java.util.Scanner;

class Person {
    protected String fullName;
    protected String address;

    public Person(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }

    public String toString() {
        return "Full Name: " + fullName + "\nAddress: " + address;
    }
}

class Student extends Person {
    private double grade1;
    private double grade2;

    public Student(String fullName, String address, double grade1, double grade2) {
        super(fullName, address);
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public double calculateAverageGrade() {
        return (grade1 + grade2) / 2;
    }

    public String evaluate() {
        double averageGrade = calculateAverageGrade();
        if (averageGrade >= 5) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public String toString() {
        return super.toString() + "\nGrade 1: " + grade1 + "\nGrade 2: " + grade2 +
               "\nAverage Grade: " + calculateAverageGrade() + "\nEvaluation: " + evaluate();
    }
}