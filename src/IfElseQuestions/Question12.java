package IfElseQuestions;

import java.util.Scanner;

public class Question12 {
    /*A company decided to give bonus of 5% to the employees if he/she is working more than 5 years ask
    * their salary and year of service and print the net bonus amount*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of service in the company");
        int y = sc.nextInt();
        System.out.println("Enter the amount of your salary ");
        int s = sc.nextInt();
        if (y >= 5) {
            System.out.println("Your net bonus amount is" + s * 5 / 100);
        } else {
            System.out.println("you are not eligible for this bonus");
        }
    }
}
