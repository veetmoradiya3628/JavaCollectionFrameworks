package linkedlist;

import java.util.LinkedList;

public class RemoveElementExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("PineApple");

        System.out.println(fruits);

        fruits.removeFirst();
        System.out.println(fruits);

        fruits.removeLast();
        System.out.println(fruits);

        fruits.removeFirstOccurrence("Apple");
        System.out.println(fruits);

        fruits.remove();
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);
    }
}
