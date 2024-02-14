package collection;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("alfi");
        names.add("Zoya");//used to add element at the end of array list

        names.add(1,"Farhan");

        System.out.println(names);

        //names.clear();//used to delete all elements

        //System.out.println(names);

        System.out.println(names.get(2));//returns the element at the specified index

        System.out.println(names.isEmpty());//checks if the ArrayList is empty

        System.out.println(names.contains("Alfu"));//checks if the specified number is present

        System.out.println(names.indexOf("alfi"));//returns the index of specified element

        names.remove(2);//removes the element present at the given index

        System.out.println(names);

        System.out.println(names.size());//returns the size of array list

        names.set(1,"Farhan");//replaces element at given index

        System.out.println(names);
    }
}
