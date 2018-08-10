package example;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by expertzlab12 on 7/9/18.
 */
public class LinkedHashEx {
    public static void main(String[] args) {
        //linked list and hash table implementation of map interface
        LinkedHashMap<String,Integer>lmap=new LinkedHashMap<>();
        lmap.put("abc",1);
        lmap.put("xyz",2);
        lmap.put("cde",3);
        lmap.put(null,5);
        lmap.put("a",6);
        for(Map.Entry<String,Integer> obj :lmap.entrySet())
        {
            System.out.println("key="+obj.getKey());
            System.out.println("value="+obj.getValue());
        }
    }
}
