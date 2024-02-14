package IfElseQuestions;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//25

        int sum = 0;//0
        for (int i = 1; i < n; i++) {//5
            if (n % i == 0) {
                sum = sum + i;//6
            }
        }
        
        if (sum == n){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}
