package LoopsQuestions;

import java.util.Scanner;

public class Question10 {
    /*Write a program to find sum of all even natural numbers between 1 to n*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit");
        int n = sc.nextInt();//number limit 10
        int sum = 0;
        for (int i = 1; i <= n; i++) {//3
            if (i % 2 == 0) {
                sum = sum + i; // 3
            }
        }
        System.out.println("sum of all even numbers: " + sum);
    }
}
