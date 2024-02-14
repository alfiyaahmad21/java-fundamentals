package IfElseQuestions;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age>21){
            System.out.println("Person is not eligible for marriage ");
        }else {
            System.out.println("Person is eligible for marriage");
        }
    }
}
