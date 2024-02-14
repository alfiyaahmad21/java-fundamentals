import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int p = sc.nextInt();
        int factorCounter = 0;
        for (int i = 1; i <= p; i++) {
            if (p%i== 0) {
                factorCounter++;
            }
        }

        if (factorCounter == 2) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }
}
