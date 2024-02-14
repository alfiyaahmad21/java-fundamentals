import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("sum = " + sum);
        System.out.println("sum is " + (a+b));

        System.out.println("Difference is " + (b-a));

        System.out.println("Product is " + (b*a));

        System.out.println("Divisor is " + (b/a));

        System.out.println("Remainder is " + (a%b));
        }
    }

