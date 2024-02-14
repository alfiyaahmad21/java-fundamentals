package LoopsQuestions;

import java.util.Scanner;
/*Write a program to find a factorial value of any number*/
public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        for (int i=1;i<=n;i++){//1->2->3->4->5->6
            fact = fact * i;//1->2->6->24->120->720
        }
        System.out.println("Factorial = "+fact);
    }
}
