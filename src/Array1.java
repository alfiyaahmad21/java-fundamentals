import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter array elements");
        for (int i = 0; i<marks.length;i++){
            marks[i] = sc.nextInt();
        }

        /*marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;*/
        System.out.println(marks[3]);

        int sumOfAllMarks = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        System.out.println("sumOfAllMarks = " + sumOfAllMarks);
        double percentage = (double) (sumOfAllMarks * 100) / 500;
        System.out.println(percentage);
    }
}