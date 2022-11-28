package linkedlist;

import java.util.LinkedList;

public class RetrieveElementExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pineapple");

        String firstElement = fruits.getFirst();
        System.out.println(firstElement);

        String lastElement = fruits.getLast();
        System.out.println(lastElement);

        System.out.println("Position : 1 , Element : "+fruits.get(1));
        System.out.println("Position : 2 , Element : "+fruits.get(2));

        for(String element: fruits){
            System.out.println(element);
        }
    }
}
