package pattern;

import java.util.Scanner;

public class HalfPyramid {
            //*
            //**
           // ***
           // ****
           // *****

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        // WE CAN REPLACE ANY NUMBER WITH N ~ 4
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}