package IfElseQuestions;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        if (length==breadth){
            System.out.println("It is a Square");
        }else {
            System.out.println("It is not a square");
        }
    }
}
