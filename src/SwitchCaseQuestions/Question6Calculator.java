package SwitchCaseQuestions;

import java.util.Scanner;

public class Question6Calculator {
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

        switch (c) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println("num2-num1 is:" + (num2 - num1));
                break;
            case '*':
                System.out.println("num1 * num2 is:" + (num1 * num2));
                break;
            case '/':
                System.out.println("num1/num2 is:" + (num1 / num2));
                break;
            case '%':
                System.out.println("num1%num2 is:" + (num1 % num2));
                break;
        }

    }
}

