package collection;
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(0,1);
        System.out.println(numbers);

        System.out.println(numbers.get(1));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.contains(6));
        System.out.println(numbers.size());
        //System.out.println(numbers.indexOf(2));
        numbers.set(3,8);
        System.out.println(numbers);
    }
}
