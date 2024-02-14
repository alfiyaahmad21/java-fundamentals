package IfElseQuestions;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of the first person ");
        int age1 = sc.nextInt();
        System.out.println("Enter age of the second person");
        int age2 = sc.nextInt();
        System.out.println("Enter age of the third person");
        int age3 = sc.nextInt();

        if (age1 > age2 && age1 > age3) {
            System.out.println("First person is the oldest among them");
        } else if (age2 > age1 && age2 > age3) {
            System.out.println("Second person is the oldest among them");
        } else if (age3 > age1 && age3 > age2) {
            System.out.println("Third person is the oldest among them");
        }
    }
}
