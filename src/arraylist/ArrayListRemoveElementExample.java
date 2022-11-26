package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveElementExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("PineApple");
        fruits.add("Grapes");
        System.out.println(fruits);

        fruits.remove("Apple");
        System.out.println(fruits);

        fruits.remove(0);
        System.out.println(fruits);

        fruits.removeAll(new ArrayList<>(List.of(new String[]{"PineApple", "Grapes"})));
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);
    }
}
