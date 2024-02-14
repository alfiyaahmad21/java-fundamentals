package LoopsQuestions;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit to check it is prime or not");
        int n = sc.nextInt();
        int factorcounter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 2 == 0) {
                factorcounter++;
            }
        }
        if (factorcounter == 2) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
