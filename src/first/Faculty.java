package first;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by expertzlab12 on 6/23/18.
 */
public class Faculty extends Department {
int fac_id;
String name;
String subject;
Faculty(int dept_id, String dept_name,int fac_id,String name,String subject)

{
    super(dept_id,dept_name);
    this.fac_id=fac_id;
    this.name=name;
    this.subject=subject;
}

public void display()
{
    System.out.println("child class");

}

    public static void main(String[] args) {
        Faculty f=new Faculty(45,"rhj",34,"sree","maths");
        Faculty obj1=new Faculty(67,"guju",90,"timi","english");
        f.getDetails();

        System.out.println(f.dept_id);
        System.out.println(f.dept_name);
        System.out.println(f.fac_id);
        System.out.println(f.name);
        System.out.println(f.subject);
        System.out.println(obj1.dept_id+" "+obj1.dept_name+" "+obj1.fac_id+" "+obj1.name+" "+obj1.subject);
    }
}
