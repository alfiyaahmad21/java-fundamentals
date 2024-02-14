package IfElseQuestions;

import java.util.Scanner;

public class Question21 {
    /*Write a Java program that takes a year from user and print whether that is a leap year or not.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check that is leap year or not");
        int y = sc.nextInt();

        if (y%4==0){
            System.out.println("It is a leap year");
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
