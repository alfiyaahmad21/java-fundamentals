package LoopsQuestions;

import java.util.Scanner;

/*Write a program to print all the ASCII values*/
public class Question12 {
    public static void main(String[] args) {
        System.out.println("Enter the character");
        Scanner sc = new Scanner(System.in);
        int a = sc.next().charAt(0);
        System.out.println(a);
    }
}
