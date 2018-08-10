package collectionex;

/**
 * Created by expertzlab12 on 6/21/18.
 */
public class a {
    static int A=1;
    int j=1;
    a()
    {
        ++A;
        ++j;
        System.out.println("constructor");

    }
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        a obj=new a();
        a obj1=new a();
        System.out.println(A);
        System.out.println(obj.j);
        System.out.println(obj1.j);
    }

}
