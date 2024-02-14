package OOPs.polymorphism;
/*When two or more methods have same name but different number or types of argument accepted,
 * it is called Function Overloading*/

//Function Overloading is also called Static Polymorphism

public class StaticPolymorphism {
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    static void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    static void add(double a, double b) { // 8.5 + 6.2 = 14.7
        double sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        add(5, 10);
        add(10, 20, 30);
        add(6.8, 4.5);
    }
}
