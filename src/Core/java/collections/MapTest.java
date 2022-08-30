package Core.java.collections;

import java.util.*;
import java.util.function.Consumer;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("John", "(342)113-9878");
        map.put("Richard", "(245)890-9045");
        map.put("Donna", "(205)678-9823");
        map.put("Ken", "(205)678-9823");
        map.put("Jerry", "(342)113-9878");
        map.put("Bruce", "(245)890-9045");
        map.put("Rhonda", "(205)678-9823");
        map.put("Master", "(205)678-9823");


        //Print some things from above map

        System.out.println("Map: " + map);
        System.out.println("Map Size: " + map.size());
        System.out.println("Map is empty: " + map.isEmpty());
        System.out.println("Map contains Donna key: " + map.containsKey("Donna"));
        System.out.println("Donna Phone: " + map.get("Ken"));
        System.out.println("Donna key is removed: " + map.remove("Donna"));
        System.out.println("**********************");

        //Print keySet() method result and print using forEach() method
        Set<String> keys = map.keySet();
        System.out.println(keys);
        keys.forEach(System.out::println);
        System.out.println("**********************");

        //Create a set of entry objects.
        Set<Map.Entry<String,String>> entries = map.entrySet();
        System.out.println("Entry objects provided by map.entryset();");
        entries.forEach(System.out::println);
        System.out.println("**********************");

        //Each entry object is pair of key and value
        System.out.println("Each entry object is key and value pair");
        entries.forEach((Map.Entry<String,String> entry) -> {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key=" + key + ", value=" + value);
        });

        //create a treemap
        SortedMap<String,String> treepmap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }});
        treepmap.putAll(map);
        System.out.println("\n\nHere is sorted map using comparator \n" + treepmap);

    }

}
