package IfElseQuestions;

import java.util.Scanner;

public class Question8 {
    /*write a program to input a cost of a pen and calculate 70 pens cost with some discount.
     if total pen cost greater than 1000 then we calculate 20% of discount otherwise the discount will be
    10%*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pen");
        int pen = sc.nextInt();//cost of a pen
        int n = 70;//70 is the total numbers of pens
        if (n*pen>=1000){
            System.out.println((n*pen)*20/100 + " Rs is the total discount on the pens");
        } else if (pen*n<=1000) {
            System.out.println((n*pen)*10/100 + " is the total discount on the pens");
        }
    }
}
