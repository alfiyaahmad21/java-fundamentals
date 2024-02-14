package LoopsQuestions;


public class Question6 {
    /*Write a program to print reverse alphabet from Z to A*/
    public static void main(String[] args) {
        char n = 'Z';
        char m = 'A';

        while (n>=m) {
            System.out.println(n);
            --n;
        }
    }
}
