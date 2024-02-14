import java.util.Scanner;

public class IncomeTaxSlab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income in Lacs");
        double income = sc.nextDouble();


        double tax = 0;
        if (income < 2.5) {
            tax = 0;
        } else if (income >= 2.5 && income < 5) {
            tax = (income * 5) / 100;
        } else if (income >= 5 && income < 10) {
            tax = (income * 20) / 100;
        } else {
            tax = (income * 30) / 100;
        }
        System.out.println(tax + " lacs");
    }
}
