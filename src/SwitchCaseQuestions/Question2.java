package SwitchCaseQuestions;

import java.util.Scanner;

public class Question2 {
    //Write a program to check whether the character is vowel or consonant.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is a consonant");
        }
    }
}
