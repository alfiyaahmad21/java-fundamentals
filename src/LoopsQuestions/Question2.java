package LoopsQuestions;

import java.util.Scanner;
/*Write a program to print all natural numbers in reverse*/
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int a= sc.nextInt();
        System.out.println("Enter the ending number");
        int b = sc.nextInt();
        while (a>=b){
            System.out.println(a);
            --a;
        }
    }
}
