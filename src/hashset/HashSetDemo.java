package hashset;

import java.util.HashSet;
import java.util.Set;

/*
* 1. HashSet can not contain duplicate Values.
* 2. HashSet allows null values
* 3. HashSet is Unordered Collection. It does not maintain the order in which the elements are inserted.
* 4. HashSet internally uses HashMap to store its elements.
* 5. HashSet is not thread-safe.
* */

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(1);
        set1.add(4);
        set1.add(3);
        set1.add(5);
        System.out.println("Set1: "+set1.toString());

        Set<Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        System.out.println("Set2 : "+set2.toString());

        set1.addAll(set2);
        System.out.println("Set1 After Add All : "+set1.toString());

        set1.remove(1);
        System.out.println("Set1 After Remove Element 1 : "+set1.toString());

        set1.removeAll(set2);
        System.out.println("Set1 After Remove Set2 : "+set1.toString());

        System.out.println("Stream Output: ");
        set1.stream().filter(number -> !(number==3)).forEach(number -> {
            System.out.print(number);
        });
    }
}
