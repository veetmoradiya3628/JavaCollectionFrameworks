package linkedlist;

import java.util.LinkedList;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println(fruits);

        // Adding an element at the specific position in the LinkedList
        fruits.add(2, "Watermelon");
        System.out.println(fruits);

        // Adding element at the beginning of the LinkedList
        fruits.addFirst("Strawberry");
        System.out.println(fruits);

        // Adding element at the End of the LinkedList
        fruits.addLast("Orange");
        System.out.println(fruits);
    }
}
