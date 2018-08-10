package first;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Created by expertzlab12 on 7/3/18.
 */
public class CollectionEx {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>();
        ArrayList<String> al1 = new ArrayList<>();
        al.add("abc");
        al.add("pqr");
        al.add("xyz");
       System.out.println("using for each");
        for (String obj : al) {
            System.out.println(obj + " ");
        }
        System.out.println("\n");
        System.out.println("using iterator");
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
        System.out.println("\n");
        System.out.println("using for loop");
        for (int i =0 ; i < al.size(); i++)
        {
            System.out.println(al.get(i)+" ");
        }
        ArrayList<String> al22=new ArrayList<>();
        al22.add("anu");
        al22.add("anju");
        al.addAll(al22);//to add another collection to the first collection
        al.removeAll(al22);
        System.out.println(al.get(2));
        Iterator Itr=al.iterator();
       while (Itr.hasNext())
        {
            System.out.println(Itr.next()+" ");
        }
    }
}
