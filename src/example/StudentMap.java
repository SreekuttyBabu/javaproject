package example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by expertzlab12 on 7/9/18.
 */
public class StudentMap {
    int id ;
    int mark;
    String name;
    public StudentMap(int id,int mark,String name)
    {
        this.id=id;
        this.mark=mark;
        this.name=name;
    }

    public static void main(String[] args) {
        HashMap<Integer,StudentMap> m=new HashMap<>();
        StudentMap s1=new StudentMap(1,45,"abc");
        StudentMap s2=new StudentMap(2,35,"xyz");
        m.put(1,s1);
        m.put(2,s2);
        for(Map.Entry<Integer,StudentMap>obj:m.entrySet())
        {
            StudentMap s4=obj.getValue();
            System.out.println("key="+obj.getKey());
            //System.out.println("value="+obj.getValue());
            System.out.println(s4.id+ " " +s4.mark+ " " +s4.name+ " ") ;
        }
    }
}
