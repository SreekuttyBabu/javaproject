package pack;

/**
 * Created by expertzlab12 on 6/27/18.
 */
public class Faculty extends Department {
    int facid;
    String name;
    String number;
    @Override
    public  void display()
    {
        System.out.println("method in child class");
    }
     Faculty(int dpid,String dptname,int facid,String name,String number) {
        super(dpid,dptname);//invokes parametrized constructor of parent class
        this.facid=facid;
        this.name=name;
        this.number=number;
        System.out.println("constructor of child class");
    }

    public static void main(String[] args) {
        Faculty f=new Faculty(101,"cse",1,"abc","897898989");
        f.display();
        System.out.println(" dpid:"+f.dpid+" dptname:"+f.dptname+" facid:"+f.facid+" name:"+f.name+" number:"+f.number);
        //Department f1=new Department();
        //f1.display("cse");
    }
    }

