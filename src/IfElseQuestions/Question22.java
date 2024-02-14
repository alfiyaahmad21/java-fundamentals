package IfElseQuestions;

import java.util.Scanner;

public class Question22 {
    /* Write a Java program to find the number of days in a month.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month's number to find the number of days");
        int m = sc.nextInt();

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            System.out.println("number of days in this month is 31");
        } else if (m == 2) {
            System.out.println("number of days in this month is 28");
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println("number of days in this month is 30");
        } else {
            System.out.println("invalid input");
        }

    }


}
