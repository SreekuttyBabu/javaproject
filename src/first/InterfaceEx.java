package first;

/**
 * Created by expertzlab12 on 6/28/18.
 */
public class InterfaceEx implements Firstinterface  {
    @Override
    public void display() {
        System.out.println("interface example");
    }

    @Override
    public int add(int x, int y) {
        return x+y;
    }

    public static void main(String[] args) {
        InterfaceEx obj=new InterfaceEx();
        obj.add(3,5);
        obj.display();
        //or
       // Firstinterface f=new InterfaceEx();
       // f.add(3,7);
       //                             f.display();
    }
}
