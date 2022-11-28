package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class SearchIterateElement {
    public static void main(String[] args) {
        LinkedList<String> progLanguages = new LinkedList<>();

        progLanguages.add("C");
        progLanguages.add("C++");
        progLanguages.add("Core Java");
        progLanguages.add("Java EE");
        progLanguages.add("Core Java");
        progLanguages.add("Spring Framework");
        progLanguages.add("Hibernate Framework");
        System.out.println(progLanguages);

        System.out.println(progLanguages.contains("Hibernate Framework"));

        int indexJavaEE = progLanguages.indexOf("Java EE");
        System.out.println(indexJavaEE);

        int indexJava = progLanguages.lastIndexOf("Core Java");
        System.out.println(indexJava);

        // Iterate over LinkedList
        Iterator<String> iterator = progLanguages.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        progLanguages.forEach((language)->{
            System.out.print(language+" ");
        });
        System.out.println();
    }
}
