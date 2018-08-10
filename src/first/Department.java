package first;

/**
 * Created by expertzlab12 on 6/23/18.
 */
public class Department {
    int dept_id;
    String dept_name;
    public void getDetails()
    {
        System.out.println("parent method");
    }
    Department(int dept_id,String dept_name)
    {
        System.out.println(" constructor invoked");
       this.dept_id=dept_id;
       this.dept_name=dept_name;
    }
}
