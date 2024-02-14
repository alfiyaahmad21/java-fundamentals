package SwitchCaseQuestions;

import java.util.Scanner;

public class Question3 {
    //Write a program to read gender (M/F||m/f) and print the corresponding gender
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M/F || m/f");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
        }
    }
}
