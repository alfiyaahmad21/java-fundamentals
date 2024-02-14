package LoopsQuestions;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit");
        int num = sc.nextInt();
        int a = num;
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        System.out.println("Given Digits :" + a);
        System.out.println("Sum of Digits :" + sum);
    }
}
