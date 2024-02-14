package SwitchCaseQuestions;

import java.util.Scanner;

public class Question4 {
    //Write a program to check whether the number is even or odd
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        switch (num%2){
            case 0://if the remainder of num%2 is 0 then it will print even.
            System.out.println("even");
            break;
            case 1://if the remainder of num%2 is 1 then it will print odd.
                System.out.println("odd");
                break;
            }
        }
    }


