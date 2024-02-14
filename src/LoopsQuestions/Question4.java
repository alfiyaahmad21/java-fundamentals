package LoopsQuestions;

import java.util.Scanner;
/*Write a program to print reverse tables*/
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int a = sc.nextInt();
        System.out.println("Enter the ending number ");
        int b = sc.nextInt();
        System.out.println("Enter the table number");
        int c = sc.nextInt();

        while (a>=b) {
            System.out.println(a + "*" + c + "=" + (a*c));
            --a;
        }
    }
}
