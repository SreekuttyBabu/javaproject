package first;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by expertzlab12 on 7/3/18.
 */
public class Student {
    int rollnumber;
    String name;
    int age;
    public Student(int rollnumber,String name,int age)
    {
        this.rollnumber=rollnumber;
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        ArrayList<Student>al=new ArrayList<>();
        Student s1=new Student(1,"timi",20);
        Student s2=new Student(2,"sree",20);
        Student s3=new Student(3,"aishu",20);
        al.add(s1);
        al.add(s2);
        al.add(s3);
            Iterator itr=al.iterator();
            while(itr.hasNext())
            {
                Student stu=(Student)itr.next();
                System.out.println(s1.rollnumber+""+s1.age+" "+s1.name);
            }

        {
            System.out.println(s1.rollnumber+""+s1.age+" "+s1.name);
        }
    }
}
