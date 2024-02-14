package LoopsQuestions;
/* Write a program to input numbers in an array and find the smallest and largest number*/


import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();//5
        int[] arr = new int[n];

        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) {//1
            arr[i] = sc.nextInt();
        } // arr = 22, 11, 44, 18, 32

        int min = arr[0]; // 22
        int max = arr[0]; // 22

        for (int i = 0; i < n; i++) { // 4
            if (min > arr[i]) {
                min = arr[i]; // 11
            }
            if (max < arr[i]) {
                max = arr[i]; // 44
            }
        }

        System.out.println("Minimum =" + min);
        System.out.println("Maximum =" + max);
    }
}
