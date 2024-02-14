package IfElseQuestions;

import java.util.Scanner;
//Write a program to take two numbers from the user and check which is max.
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1");
        int n1 = sc.nextInt();
        System.out.println("Enter n2");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Both numbers are equal");
        } else if (n1 > n2) {
            System.out.println("n1 is max");
        } else {
            System.out.println("n2 is max");
        }
    }
}
