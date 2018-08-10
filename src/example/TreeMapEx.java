package example;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by expertzlab12 on 7/9/18.
 */
public class TreeMapEx {
    public static void main(String[] args) {
        Map<String, String> lmap = new TreeMap<>();
        lmap.put("abc", "1");
        lmap.put("xyz", "2");
        for (Map.Entry<String, String> obj : lmap.entrySet()) {
            System.out.println("key=" + obj.getKey());
            System.out.println(" value=" + obj.getValue());
        }

    }
}
