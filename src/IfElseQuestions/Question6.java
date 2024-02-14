package IfElseQuestions;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gen ");
        String gen = sc.nextLine();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (gen.equalsIgnoreCase("male") && (age >= 21)) {
            System.out.println("male is eligible for marriage");
        }else if (gen.equalsIgnoreCase("female") && (age >= 18)) {
            System.out.println("female is eligible for marriage");
        }else {
            System.out.println("male is not eligible for marriage");
        }
    }
}

