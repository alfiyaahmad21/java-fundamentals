package LoopsQuestions;

import java.util.Scanner;

public class Question20 {
    /*Write a program to find number and sum of all integer between 100 and 200
     which are divisible by 9*/
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("Sum of integers divisible by 9 is: " + sum);
    }
}
