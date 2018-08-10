package second;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by expertzlab12 on 6/28/18.
 */
public class AbstractExample extends Sample {
    @Override
    int add(int x, int y)
    {
        return x+y;
    }
    @Override
    public void display()
    {
        System.out.println("abstract clss function");
    }

    @Override
    String details() {

        System.out.println("hi");
        return "hi";
    }

    public static void main(String[] args) {
        Sample s=new AbstractExample();
        s.display();
        s.show();
        System.out.println(s.add(2,3));
      s.details();

    }

}
