package second;
import collectionex.Example;

/**
 * Created by expertzlab12 on 6/22/18.
 */
public class examples {
    static int i;
    static class StaticEx{
        static void display()
        {
            System.out.println("static method");
        }
        public void getfun()
        {
            System.out.println("non static method");
        }
    }
    public static void main(String[] args) {
        examples.StaticEx.display();
examples.StaticEx obj=new examples.StaticEx();
obj.getfun();
    }

}
