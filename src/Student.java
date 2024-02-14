import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];

        System.out.println("Enter marks of each subject");
        for (int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }


        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks = totalMarks + marks[i];
        }

        double percentage = (double) (totalMarks * 100) / 3;

        if (percentage < 33){
            System.out.println("Student has been failed");
        }else{
            System.out.println("Student has been passed");
        }
    }
}
