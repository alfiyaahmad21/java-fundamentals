package collection;
import  java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        //here India is the key and 1 is the value. and if we insert same key but different value for the second
        // time the code will update with the new value.
        //Hashmaps are unordered maps just like the hashset
        map.put("India" ,1);
        map.put("US", 2);
        map.put("Sri Lanka", 3);
        map.put("Australia", 3);
        System.out.println(map);

        //search
        System.out.println(map.containsKey("China"));
        //with the help of if-else
        if (map.containsKey("China")){
            System.out.println("key is present in the map");
        }else {
            System.out.println("key is not present in the map");
        }
        System.out.println(map.get("China"));//if it returns true then the value of the given key will print
        System.out.println(map.get("US"));//if it returns false then it will print null
    }
}
