package modifiers;

/**
 * Created by expertzlab12 on 6/13/18.
 */
public class developer extends employee {
    float bonus=19000;
    void empdetails()
    {
        System.out.println("name:"+name);
        System.out.println("salary"+salary);
        System.out.println("bonous"+bonus);
    }
    public static void main(String[] args) {
        developer d=new developer();
        d.name();
        d.bonus();
        d.salary();

    }

}
