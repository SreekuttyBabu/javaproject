package example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by expertzlab12 on 7/6/18.
 */
public class CollectionEx {
    public static void main(String[] args) {
        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("abc");
     treeSet.add("efg");
        //treeSet.add("abc");//duplicate values display avilla
       // treeSet.add("xyz");//null values accept chayyathilla
        //generic declaration
     //   HashSet<String>al=new HashSet<>();
       //HashSet al1=new HashSet();
       // LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
        //linkedHashSet.add("def");//linkedhashset insertion order keep cheyyum
      //  linkedHashSet.add("xyz");
      // linkedHashSet.add("abc");
      //  linkedHashSet.add("efg");
        //linkedHashSet.add("abc");
       // linkedHashSet.add(null);//onnil kooduthal null values accept chayyathilla
      // linkedHashSet.add(null);
//linkedHashSet.remove(null);
      //  al.add("abc");//hash values usually string values arikkum
      // al.add("efg");//hashset is simply hash table , hash table and linked list implementation of set interface is called  linked hashset
       // al.add("hij");
       // al.add(null);
       // al.add(null);
       // al.add("abc");//duplicate values display avilla
        //al.add(10);
        //al.add(50);
        //for (String o:al)
          //   {
             //    System.out.println(o);
       // }
       // for (String o:linkedHashSet) {
        //   System.out.println(o);
       // }
        for(String o:treeSet)
        {
            System.out.println(o);
        }
    }
}
