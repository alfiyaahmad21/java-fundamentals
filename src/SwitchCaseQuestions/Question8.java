package SwitchCaseQuestions;

import java.util.Scanner;

public class Question8 {
    /*Write a program to find the Maximum of Two Numbers using switch statement*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        int res = n1 > n2 ? 1 : 0;
        switch (res) {
            case 0:
                res = n1 == n2 ? 1 : 0;
                switch (res) {
                    case 0:
                        System.out.println("Maximum Number is " + n2);
                        break;
                    case 1:
                        System.out.println("Both are Equals");
                        break;
                }
                break;

            case 1:
                System.out.println("Maximum Number is " + n1);
                break;
        }
    }
}





