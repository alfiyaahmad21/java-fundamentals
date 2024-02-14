package ArmStrong;

import java.util.Scanner;
/*To find the last digit of any number we do n % 10
* To remove the last digit of any number we do  n / 10*/
public class ArmStrong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println( isArmStrong(n));
    }
    public static boolean isArmStrong(int num){
        int sum = 0;
        int data = num;//153
        int digit;
        while (data>0){ //153->15-> 1
            digit = data%10;//153%10=3; -> 15%10=5; -> 1%10=1
            data = data/10;//153/10=15; -> 15/10=1; -> 1/10=0
            sum = sum + digit * digit * digit;//
         /*  0  =   0 +   3   *   3   *   3 = 27;
           27 =   27 +   5   *   5   *   5 = 152;
           152 =   152 +   1   *   1   *   1 = 153; */
        }
        return num==sum;
    }
}
