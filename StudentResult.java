package demo6;

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Marks (0 to 100): ");
        int marks = sc.nextInt();

        System.out.print("Fee Paid Status (true/false): ");
        boolean feePaid = sc.nextBoolean();

        
        String result;
        if (marks >= 40) {
            result = "Student Passed";
        } else {
            result = "Student Failed";
        }

      
        char grade;
        if (marks >= 85) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }


        String certificateStatus;
        if (marks >= 40 && feePaid) {
            certificateStatus = "Eligible for Certificate";
        } else {
            certificateStatus = "Not Eligible for Certificate";
        }

    
        String course;
        switch (grade) {
            case 'A':
                course = "Data Science";
                break;
            case 'B':
                course = "Java Full Stack";
                break;
            case 'C':
                course = "Web Development";
                break;
            case 'D':
                course = "Basic Programming";
                break;
            default:
                course = "Counseling";
        }

      
        System.out.println("\n----- Student Evaluation Summary -----");
        System.out.println("Student ID & Name: " + studentId + " - " + studentName);
        System.out.println("Marks: " + marks + " (" + result + ")");
        System.out.println("Grade: " + grade);
        System.out.println("Fee Paid Status: " + feePaid);
        System.out.println("Certificate Status: " + certificateStatus);
        System.out.println("Allocated Course: " + course);

        sc.close();
    }
}