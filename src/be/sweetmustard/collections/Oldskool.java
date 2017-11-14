package be.sweetmustard.collections;

import java.util.*;

public class Oldskool {

    private static Map<String, String> values = new HashMap<>();

    private static List<String> list = Arrays.asList("value1", "value2");

    private static List<String> list2 = new ArrayList<>();



    static {
        values.put("key", "value");
        values.put("key2", "value");

        list2.add("value1");
        list2.add("value2");
    }
}
