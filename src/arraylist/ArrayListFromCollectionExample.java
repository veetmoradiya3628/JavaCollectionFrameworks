package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFromCollectionExample {
    public static void main(String[] args) {

        List<Integer> firstFiveNumber = new ArrayList<>();
        firstFiveNumber.add(2);
        firstFiveNumber.add(3);
        firstFiveNumber.add(5);
        firstFiveNumber.add(7);
        firstFiveNumber.add(11);

        List<Integer> firstTenNumber = new ArrayList<>(firstFiveNumber);

        List<Integer> nextFiveNumber = new ArrayList<>();

        nextFiveNumber.add(13);
        nextFiveNumber.add(17);
        nextFiveNumber.add(19);
        nextFiveNumber.add(23);
        nextFiveNumber.add(29);

        firstTenNumber.addAll(nextFiveNumber);
        System.out.println(firstTenNumber);
    }
}
