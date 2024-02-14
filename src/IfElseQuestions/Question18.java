package IfElseQuestions;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to check whether you are eligible for vote or not");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You are eligible for vote");
        }else {
            System.out.println("You are not eligible for vote");
        }
    }
}
