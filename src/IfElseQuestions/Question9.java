package IfElseQuestions;

import java.util.Scanner;

public class Question9 {
    /*Write a java program to take basic salary of employee from user and calculate gross salary
     * with given condition, if basic salary>=1000 then we calculate 40%da and 30%ta of basic salary.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        if (salary >= 1000) {
            System.out.println("40% of salary is " + (salary * 40) / 100);
            System.out.println("30% of salary is " +(salary * 30) / 100);
        }
    }
}
