package hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetOverviewExample {
    public static void main(String[] args) {
        nullValueDemo();
        duplicateValueDemo();
        unorderedDemo();
    }

    private static void nullValueDemo(){
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.toString());
    }

    private static void duplicateValueDemo(){
        Set<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element1");
        System.out.println(set.toString());
    }

    private static void unorderedDemo(){
        Set<String> set = new HashSet<>();
        set.add("element1");
        set.add("element3");
        set.add("element2");
        set.add("element6");
        set.add("element5");
        set.add("element4");
        System.out.println(set.toString());
    }
}
