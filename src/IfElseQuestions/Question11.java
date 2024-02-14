package IfElseQuestions;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of total purchased quantity");
        int p = sc.nextInt();
        if (p>2000){
            System.out.println( "total amount of discount on your purchase is " + p*10/100);
        }else {
            System.out.println("You haven't purchased much quantity to get a discount");
        }
    }
}
