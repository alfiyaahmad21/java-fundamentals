package SwitchCaseQuestions;

import java.util.Scanner;

public class Question5 {
    //Write a program to find a number of days in a month using a switch case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int mon = sc.nextInt();
        switch (mon){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Enter a valid month");
        }
    }
}
