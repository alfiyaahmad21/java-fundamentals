import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i<marks.length;i++){
            marks[i] = sc.nextInt();
        }

        int sumOfAllMarks = 0;
        for (int i=0;i<marks.length;i++){
            sumOfAllMarks = sumOfAllMarks + marks[i];
        }

        System.out.println("sumOfAllMarks = " + sumOfAllMarks);
        double percentage = (double) (sumOfAllMarks * 100) / (n * 100);
        System.out.println(percentage);
    }
}
