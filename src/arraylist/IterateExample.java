package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateExample {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "hibernate");

        // basic For Loop
        for (int i = 0; i < courses.size(); i++) {
            System.out.print(courses.get(i)+" ");
        }
        System.out.println();
        // Enhanced For Loop
        for (String course: courses) {
            System.out.print(course+" ");
        }
        System.out.println();

        // basic loop with Iterator
        for(Iterator<String> iterator = courses.iterator(); iterator.hasNext();){
            String course =(String) iterator.next();
            System.out.print(course+ " ");
        }
        System.out.println();

        // iterator with While Loop
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()){
            String course = (String) iterator.next();
            System.out.print(course+" ");
        }
        System.out.println();

        // java 8 stream with lambda example
        courses.stream().forEach((course)->{
            System.out.print(course+" ");
        });
        System.out.println();

        // java 8 for each with lambda
        courses.forEach((course) -> {
            System.out.print(course+" ");
        });
        System.out.println();
    }
}
