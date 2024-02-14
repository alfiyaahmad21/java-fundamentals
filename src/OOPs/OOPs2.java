package OOPs;

public class OOPs2 {
    public static class Student {
        String name;
        int rollno;
        double percentage;

        public static void main(String[] args) {
            Student s1 = new Student();
            s1.name = "Alfiya";
            s1.rollno = 1;
            s1.percentage = 82.3;

            Student s2 = new Student();
            s2.name = "Ibrahim";
            s2.rollno = 5;
            s2.percentage = 89.3;

//        System.out.println("name of the student is : "  + s1.name);
//        System.out.println("rollno of the student is: " + s1.rollno);
//        System.out.println(" percentage of the student is : " + s1.percentage);


            System.out.println("name of the student is : " + s2.name);
            System.out.println("rollno of the student is: " + s2.rollno);
            System.out.println(" percentage of the student is : " + s2.percentage);
        }
    }
}
