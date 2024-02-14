package SwitchCaseQuestions;

import java.util.Scanner;

public class Question7 {
    /* Write a program to print remark according to the grade obtained using switch statement*/
    public static void main(String[] args) {
        System.out.println("Enter the grade");
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
         switch (grade){
             case 'A'  :
                 System.out.println("Excellent");
                 break;
             case 'B':
                 System.out.println("Well Done");
                 break;
             case 'C':
                 System.out.println("Very Good");
                 break;
             case 'D':
                 System.out.println("Good");
                 break;
             case 'F':
                 System.out.println("Fail");
                 break;
             default:
                 System.out.println("Invalid Input");

         }
    }
}
