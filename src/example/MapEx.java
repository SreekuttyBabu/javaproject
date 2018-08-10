package example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expertzlab12 on 7/6/18.
 */
public class MapEx {
    public static void main(String[] args) {
        //key value pair  or entry
        //key value basisl value enter chayyum
        //hashtable implementation of map interface
        HashMap<String,Integer>m=new HashMap<>();
        m.put("amal",133443545);
        m.put("aishu",567654656);
        m.put("timi",657456876);
        m.put("amal",45689990);
        m.remove("amal");//to  remove entry by key
        for(Map.Entry<String,Integer>obj:m.entrySet())
        {
            System.out.println("key= "+obj.getKey());
            System.out.println("values= "+obj.getValue());
        }

    }
}
