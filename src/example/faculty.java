package example;
import java.util.*;

/**
 * Created by expertzlab12 on 6/21/18.
 */
public class faculty {
    String fname;
    String department;
    int fid;
    int salary;
    faculty(String a,String b,int c,int d)
    {
        this.fname=a;
        this.department=b;
        this.fid=c;
        this.salary=d;

    }
    void display()
    {
        System.out.println("faculty name IS:"+fname);
        System.out.println("department is:"+department);
        System.out.println("faculty id is:"+fid);
        System.out.println("salary is:"+salary);
    }

    public static void main(String[] args) {
        faculty f=new faculty("sgfyhg","hbjjkj",67,77);
        faculty f1=new faculty("ytfy","tyut",5,767);
        f.display();
        f1.display();
    }
}
