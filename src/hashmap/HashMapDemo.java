package hashmap;


import java.util.*;

/*
* JavaHashMap is a hash table based implementation of Java's Map Interface.
* A Hashmap can not contain duplicate keys.
* Java HashMap allows null values and null keys.
* HashMap is an unordered collection. It does not guarantee any specific order of the elements.
* HashMap is not thread-safe.
* */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> numberMap = new HashMap<>();

        numberMap.put("One", 1);
        numberMap.put("Two", 2);
        numberMap.put("Three", 3);
        numberMap.put("Four", 4);
        System.out.println(numberMap.toString());

        numberMap.put("null", 4);
        numberMap.put("null", 8);
        System.out.println(numberMap.toString());

        System.out.println(numberMap.isEmpty());
        System.out.println(numberMap.size());

        if (numberMap.containsKey("Four")){
            System.out.println("Exists");
        }else{
            System.out.println("Not Exists");
        }

        if (numberMap.containsValue(6)){
            System.out.println("Exists");
        }else{
            System.out.println("Not Exists");
        }

        System.out.println(numberMap.get("Two"));
        System.out.println(numberMap.get("Five"));

        numberMap.remove("One");
        System.out.println(numberMap.toString());

        Set<String> keySet = numberMap.keySet();
        System.out.println(keySet.toString());

        Collection<Integer> valueSet = numberMap.values();
        System.out.println(valueSet);

        System.out.println("HashMap Iteration Examples: ");
        for(Map.Entry<String, Integer> entry: numberMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue()+" "+entry.getClass());
        }

        System.out.println("HashMap Iteration Examples: ");
        Set<Map.Entry<String, Integer>> entries = numberMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("HashMap Iteration Examples: ");
        numberMap.forEach((K, V)->{
            System.out.println(K+" "+V);
        });
    }
}
