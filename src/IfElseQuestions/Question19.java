package IfElseQuestions;

import java.util.Scanner;

/*To make calculator*/
public class Question19 {
    public static void main(String[] args) {
        System.out.println("available operators in calculator are : +, -, *, /, % ");
        System.out.println("choose any given operator");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println("Chosen operator is : " + c);


        System.out.println("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        if (c == '*') {
            System.out.println("num1 * num2 is: " + (num1 * num2));
        }

        if (c == '+') {
            System.out.println("num1 + num2 is: " + (num1 + num2));
        }
        if (c == '-') {
            System.out.println("num1 - num2 is: " + (num1 - num2));
        }
        if (c == '/') {
            System.out.println("num1 / num2 is: " + (num1 / num2));
        }
        if (c == '%') {
            System.out.println("num1 % num2 is: " + (num1 % num2));
        }
    }


}





