package pack;

/**
 * Created by expertzlab12 on 6/27/18.
 */
public class Department {
    int dpid;
    String dptname;
    public Department(int dpid,String dptname)
    {
        this.dpid=dpid;
        this.dptname=dptname;
    }
    public void display()
    {
        System.out.println("parent class method");
    }
}
