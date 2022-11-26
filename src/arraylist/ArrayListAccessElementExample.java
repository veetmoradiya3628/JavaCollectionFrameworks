package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAccessElementExample {
    public static void main(String[] args) {
        List<String> topProgrammingLanguage = new ArrayList<>();
        System.out.println(topProgrammingLanguage.isEmpty());

        topProgrammingLanguage.add("C");
        topProgrammingLanguage.add("Java");
        topProgrammingLanguage.add("C++");
        topProgrammingLanguage.add("Python");
        topProgrammingLanguage.add(".NET");
        System.out.println(topProgrammingLanguage.size());
        System.out.println(topProgrammingLanguage.isEmpty());

        System.out.println(topProgrammingLanguage.get(1));
        System.out.println(topProgrammingLanguage.get(3));

        System.out.println(topProgrammingLanguage);
        topProgrammingLanguage.set(4, "C#");
        System.out.println(topProgrammingLanguage);
    }
}
