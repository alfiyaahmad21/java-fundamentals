package LoopsQuestions;

import java.util.Scanner;

public class Question19 {
    /* Write a program to enter the numbers till the user wants and at the end
     it should display the count of positive, negative and zeros entered*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int s = sc.nextInt();
        System.out.println("Enter the ending number");
        int e = sc.nextInt();
        for (int i = s; i <= e; i++) {
            if (i % 2 == 0) {
                System.out.println("The count of the positive integer is ");
            } else if (i%2!=0) {
                System.out.println("The count of the negative integer is");
            } else if (i==0) {
                System.out.println("The count of the zero is");
            }
        }
    }
}



