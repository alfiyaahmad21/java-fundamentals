package collection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(3);//used to add element at the end of array list

        numbers.add(1,4);

        System.out.println(numbers);

        //numbers.clear();//used to delete all elements

        //System.out.println(numbers);

        System.out.println(numbers.get(2));//returns the element at the specified index

        System.out.println(numbers.isEmpty());//checks if the ArrayList is empty

        System.out.println(numbers.contains(5));//checks if the specified number is present

        System.out.println(numbers.indexOf(3));//returns the index of specified element

        numbers.remove(2);//removes the element present at the given index

        System.out.println(numbers);

        System.out.println(numbers.size());//returns the size of array list

        numbers.set(1,5);//replaces element at given index

        System.out.println(numbers);
    }
}
