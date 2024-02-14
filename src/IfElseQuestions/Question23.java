package IfElseQuestions;

import java.util.Scanner;

public class Question23 {
    /* Write a Java program to take two Input number is equal or not*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();
        
        if (num1==num2){
            System.out.println("they are equal ");
        }else {
            System.out.println("they are not equal");
        }
    }
}
