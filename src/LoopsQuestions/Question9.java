package LoopsQuestions;

import java.util.Scanner;

public class Question9 {
    /*Write a program to find sum of all natural numbers between 1 to n*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit");
        int n = sc.nextInt();//number limit 10
        int sum = 0;
        for (int i = 1; i <= n; i++) {//10
            sum = sum + i; // 55
        }
        System.out.println("sum of numbers:" + sum);
    }
}
