package LoopsQuestions;

import java.util.Scanner;

public class Question14 {
    /*Write a program to find the value of one number raised to the power of another*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();
        System.out.println(Math.pow(a,b));
    }
}
