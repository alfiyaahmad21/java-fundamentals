package IfElseQuestions;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first angle");
        int a1 = sc.nextInt();
        System.out.println("Enter second angle");
        int a2 = sc.nextInt();
        System.out.println("Enter third angle");
        int a3 = sc.nextInt();

        if (a1+a2+a3==180){
            System.out.println("It is a valid triangle");
        }else {
            System.out.println("It is not a valid triangle");
        }

    }
}
