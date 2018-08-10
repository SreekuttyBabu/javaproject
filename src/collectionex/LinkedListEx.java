package collectionex;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by expertzlab12 on 7/5/18.
 */
public class LinkedListEx {
    //dqueue implementation is here
    //dqueue means we can add and remove elements in both direction
    public static void main(String[] args) {
        //generic declarations
       LinkedList<String> al=new LinkedList();
       LinkedList<String>al1=new LinkedList<>();
       al1.add("aaa");
       al1.add("bbb");
       al1.add("aaa");//we can add duplicate elements
       al1.add(null);//we can add null values
       al1.add(null);
       al1.addFirst("ccc");//to add element first
       al1.addLast("ddd");//to add element last
        //al1.removeFirst();
        //al1.removeLast();
       for(String x:al1)
       {
           System.out.println(x);
       }
        Iterator itr=al1.iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next());
       }
LinkedList<Integer>al2=new LinkedList<>();
       al2.add(2);
       al2.add(22);
    }
}
