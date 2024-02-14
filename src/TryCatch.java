import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        try {
            int a = sc.nextInt();
            System.out.println("Execution in Try block");
        } catch (Exception e) {
            System.out.println("Execution in Catch block");
        }

        System.out.println("Code execution completed");
    }
}
