package collection;
import java.util.LinkedList;
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("alfiya");
        names.add("imran");
        names.add("zoya");
        names.add("farhan");

        System.out.println(names);
        System.out.println(names.get(2));
        System.out.println(names.contains("ammi"));
        System.out.println(names.indexOf("zoya"));
        System.out.println(names.size());
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names);
        System.out.println(names.isEmpty());
        names.set(0,"papa");
        System.out.println(names);

    }
}
