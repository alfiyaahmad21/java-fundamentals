import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("ARMSTRONG");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n) ? "The number is Armstrong" : "The number is not Armstrong");
    }

    static boolean isArmstrong(int num) {// 153
        int sum = 0; // 0
        int data = num; // 153
        int digit = 0; // 0
        while (data > 0) { // true
            digit = data % 10; // 1
            data = data / 10; // 0.1
            sum = sum + (digit * digit * digit); // 27 + 125 +
        }

        return num == sum;
    }
}
