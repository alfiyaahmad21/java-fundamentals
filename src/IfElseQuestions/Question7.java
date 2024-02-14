package IfElseQuestions;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the working Status in yes or no");
        String job = sc.nextLine();
        if (job.equalsIgnoreCase("yes")) {
            System.out.println("person is eligible for marriage");
        } else if (job.equalsIgnoreCase("no")) {
            System.out.println("Person is not eligible for marriage");
        } else {
            System.out.println("Enter the valid status");
        }
    }
}
