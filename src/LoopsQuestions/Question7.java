package LoopsQuestions;
/*Write a program to print all the even numbers between 1 and 100*/
public class Question7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        for (int  i=a; i<=b; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
