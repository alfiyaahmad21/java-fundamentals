package LoopsQuestions;

import java.util.Scanner;
/*Write a program to print tables*/
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int a = sc.nextInt();
        System.out.println("Enter the Ending number");
        int b = sc.nextInt();
        System.out.println("Enter the table");
        int c = sc.nextInt();
        while (a<=b){
            System.out.println(a + "*" + c + "=" + (a*c));
            a++;
        }
    }
}
