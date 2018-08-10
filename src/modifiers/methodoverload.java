package modifiers;

/**
 * Created by expertzlab12 on 6/13/18.
 */
public class methodoverload {
    public static void sum(int a,int b)
    {
        System.out.println("int+int:"+(a+b));
    }
    public static void sum(float a,float b)
    {
        System.out.println("float+float"+(a+b));

    }
    public static void sum(int a,float b)
    {
        System.out.println("int+float"+(a+b));
    }
    public static void sum(float a,int b)
    {
        System.out.println("float+int"+(a+b));
    }
    public static void sum(Integer a,Integer b)
    {
        System.out.println("Integer+integer"+(a+b));
    }

    public static void main(String[] args) {
        methodoverload.sum(123.324f,67868);
                sum(10,20);

    }
}

