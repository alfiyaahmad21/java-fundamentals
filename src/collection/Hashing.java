package collection;

import java.util.HashSet;

/* no matter how many times you are going to input the same element
      set adds an element only once*/
public class Hashing {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();
        //Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(1);
        System.out.println(set);

        //Search-Contains
        if (set.contains(2)) {
            System.out.println("This set contains 2");
        }
        if (!set.contains(6)) {
            System.out.println("This set does not contains 6");
        }
        System.out.println(set);

        //Delete
        set.remove(2);
        System.out.println("we removed 2");
        System.out.println(set);

        //set is empty or not.... returns in boolean
        System.out.println(set.isEmpty());

        //Size
        System.out.println(set.size());


    }

}

