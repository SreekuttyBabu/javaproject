package example;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by expertzlab12 on 7/9/18.
 */
public class Test {
    int houseno;
    String address;
    int phno;
    public Test(int houseno,String address,int phno)
    {
        this.houseno=houseno;
        this.address=address;
        this.phno=phno;
    }

    public static void main(String[] args) {
        TreeMap<Integer,Test>m=new TreeMap<>();
        Test t=new Test(1,"abc",65365);
        Test t1=new Test(2,"xyz",674567);
        Test t2=new Test(3,"dhb",56476);
        m.put(1,t);
        m.put(2,t1);
        m.put(3,t2);
        for (Map.Entry<Integer, Test> obj : m.entrySet()) {
            System.out.println("key=" + obj.getKey());
            System.out.println(" value=" + obj.getValue());
        }
        System.out.println();

    }
}
