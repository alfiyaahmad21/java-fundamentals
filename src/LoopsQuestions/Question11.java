package LoopsQuestions;

import java.util.Scanner;
/*Write a program to find sum of all odd numbers between 1 to n*/
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        System.out.println("Enter the ending number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i =1; i<=n; i++){
            if (i%2!=0){
                sum= sum+i;
            }
        }
        System.out.println("sum of all odd numbers are : " + sum);
    }
}